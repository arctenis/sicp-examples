#!/usr/bin/guile -s
!#
(newline)
(display "HELLO")
(newline)
(newline)

(define (square a) (* a a))

(define (sum-sq a b)
    (if (> a b)
        0
        (+ (square a)
            (sum-sq (1+ a) b))))


(define (sum term a next b)
    (if (> a b)
        0
        (+ (term a)
            (sum term
                (next a)
                next
                b))))

(display (sum square 0 1+ 5))


(newline)
(newline)
(display "END")
(newline)
