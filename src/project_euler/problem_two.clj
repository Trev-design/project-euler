(ns project-euler.problem-two)


(defn make-sum [fib sum]
  (if (= (mod fib 2) 0)
    (+ sum fib)
    sum))


(defn even-fibonacci-sum []
  (loop 
   [current 0 next 1 sum 0] 
    (if (>= current 4000000)
      sum
      (recur next (+ next current) (make-sum current sum)))))


(defn problem-two [] 
  (even-fibonacci-sum))