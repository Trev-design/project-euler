(ns project-euler.problem-ten 
  (:require [project-euler.prime-helper :as primes]))


(defn sum-of-primes []
  (->> (primes/prime-seq (primes/sieve 2000000))
       (reduce +)))


(defn problem-ten []
  (print (sum-of-primes) "\n"))