(ns project-euler.prime-helper)


(defn sieve [upper-bound]
  (if (< upper-bound 2)
    []
    (let [sqrt-n (int (Math/ceil (Math/sqrt upper-bound)))
          sieve-size (inc (bit-shift-right upper-bound 1))]
      (loop [current-number 3
             primes (transient (vec (repeat sieve-size true)))]
        (if (<= current-number sqrt-n) 
          (if (= (nth primes (bit-shift-right current-number 1)) true)
            (recur
             (+ current-number 2)
             (loop [index (bit-shift-right (* current-number current-number) 1)
                    primes primes]
               (if (<= index sieve-size)
                 (recur (+ index current-number) (assoc! primes index false))
                 primes)))
            (recur (+ current-number 2) primes))
          (persistent! primes))))))


(defn prime-seq [primes]
  (keep-indexed 
   (fn [index value]
     (when (= value true)
       (if (= index 0)
         2
         (dec (bit-shift-left (inc index) 1)))))
   primes))


(defn get-nth-prime [primes index]
  (nth primes index))