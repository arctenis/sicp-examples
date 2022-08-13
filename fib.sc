#!/usr/bin/guile -s
!#
(display "Hello!")
(newline)
(define (fib n)
    (if (< n 2)
        n 
        (+ (fib (- n 1))
           (fib (- n 2)))))

(display (fib 10))
(newline)
(display (fib 32))

(newline)
