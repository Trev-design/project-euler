(ns project-euler.problem-nine)


(defn pythagorean-triplet []
  (loop [n  1 m (inc n)]
    (let [a (* 2 n m) b (- (* m m) (* n n)) c (+ (* m m) (* n n)) sum (+ a b c)]
      (cond
        (= sum 1000) {:a a :b b :c c}
        (< sum 1000) (recur n (inc m))
        (> sum 1000) (recur (inc n) (+ 2 n))))))



(defn calculate-product [results]
  (if (contains? results :error)
    results
    (->> (vals results) (reduce *))))


(defn problem-nine []
  (-> (pythagorean-triplet) (calculate-product) (print "\n")))