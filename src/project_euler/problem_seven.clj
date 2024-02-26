(ns project-euler.problem-seven
  (:require [project-euler.prime-helper :as primes]))


(defn prime-at-10001 []
  (primes/get-nth-prime (primes/prime-seq (primes/sieve 150000)) (dec 10001)))


(defn problem-seven []
  (print (prime-at-10001) "\n"))