(ns project-euler.problem-one)


(defn make-sum [iteration current-result]
  (if (or (= (mod iteration 3) 0) (= (mod iteration 5) 0))
    (+ current-result iteration)
    current-result))


(defn multiple-of-three-or-five [lower-bound upper-bound result]
  (loop
   [iteration lower-bound
    sum result]
    (if (< iteration upper-bound)
      (recur (inc iteration) (make-sum iteration sum))
      (print sum "\n"))))


(defn problem-one []
  (multiple-of-three-or-five 1 1000 0))