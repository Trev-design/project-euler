(ns project-euler.problem-nine)


(defn pythagorean-triplet [scope]
  (loop [n  1 m (inc n)]
    (let [a (* 2 n m) b (- (* m m) (* n n)) c (+ (* m m) (* n n)) sum (+ a b c)]
      (cond
        (> n (int (Math/sqrt scope))) {:error "no triplet found"}
        (< sum scope) (recur n (inc m))
        (> sum scope) (recur (inc n) (+ 2 n))  
        (= sum scope) {:a a :b b :c c}))))


(defn calculate-product [results]
  (if (contains? results :error)
    results
    (->> (vals results) (reduce *))))


(defn problem-nine []
  (-> 1000 (pythagorean-triplet) (calculate-product) (println)))