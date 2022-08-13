#!/usr/bin/guile -s
!#
(newline)

(define (fixed-point f start)
    (define tolerance 0.0001)
    (define (close-enough? u v)
        (< (abs (-u v)) tolerance))
    (define (iter old new)
        (if (close-enough? old new)
            new
            (iter new (f new))))
    (iter start (f start)))

(define (sqrt x)
    (fixed-point
        (lambda (y) (average (/ x y) y))
        1))

(newline)
