(ns project-euler.problem-six)


(defn square-of-sum [numbers]
  (Math/pow (->> numbers (reduce +)) 2))


(defn sum-of-squares [numbers]
  (loop [numbers numbers current-result 0]
    (if (empty? numbers)
      current-result
      (let [[head & tail] numbers]
        (recur tail (+ current-result (Math/pow head 2)))))))


(defn sum-square-difference []
  (let [numbers (range 1 101)]
    (- (square-of-sum numbers) (sum-of-squares numbers))))


(defn problem-six []
  (print (sum-square-difference) "\n"))