(ns project-euler.problem-five)


(defn find-smallest-multiple []
  (loop [current 1 count 1 prime-factors (vector 2 3 5 7 11 13 17 19)]
    (case (empty? prime-factors)
      true (print current "\n")
      (let [[head & tail] prime-factors]
        (if (> (* count head) 20)
          (recur (* current count) 1 tail)
          (recur current (* count head) prime-factors))))))


(defn problem-five []
  (find-smallest-multiple))