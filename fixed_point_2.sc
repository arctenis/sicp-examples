#!/usr/bin/guile -s
!#
(newline)

(define (average x y) (/ (+ x y) 2 ))

(define average-damp
    (lambda (f)
        (lambda (x) (average (f x) x))))

(define (sqrt x)
    (define average-damp
        (lambda (f)
            (lambda (x) (average (f x) x))))
    (define (fixed-point f start)
        (define tolerance 0.0001)
        (define (close-enough? u v)
            (< (abs (-u v)) tolerance))
        (define (iter old new)
            (if (close-enough? old new)
                new
                (iter new (f new))))
        (iter start (f start)))
    (fixed-point
        (average-damp (lambda (y) (/ x y)))
        1))

(display (sqrt 144))

(newline)
