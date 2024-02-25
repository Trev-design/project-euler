(ns project-euler.prime-helper)


(defn sieve [upper-bound]
  (if (< upper-bound 2)
    []
    (let [primes (vec (repeat (inc upper-bound) true))
          primes (assoc  primes 0 false 1 false)]
      (loop [current-number 2
             primes primes]
        (if (<= current-number upper-bound)
          (if (= (nth primes current-number) true)
            (recur 
             (inc current-number)
             (loop [index (+ current-number current-number)
                    primes primes]
               (if (<= index upper-bound)
                 (recur (+ index current-number) (assoc primes index false))
                 primes)))
            (recur (inc current-number) primes))
          (->> primes 
               (map-indexed 
                (fn [index value] 
                  (when (= value true) index)))
               (remove nil?)))))))