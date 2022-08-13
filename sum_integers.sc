#!/usr/bin/guile -s
!#
(newline)
(display "HELLO")
(newline)

// Write your program here
(define (sum-int a b)
    (if (> a b)
        0
        (+ a
            (sum-int (+ a 1) b))))

(newline)
(display "END")
(newline)
