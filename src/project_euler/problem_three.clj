(ns project-euler.problem-three)


(defn devide [number divisor]
  (if (= (mod number divisor) 0)
    (/ number divisor)
    number))


(defn largest-prime-factor []
  (loop [number 600851475143 divisor 2]
    (if (>= (* divisor divisor) number)
      (print number "\n")
      (recur (devide number divisor) (inc divisor)))))


(defn problem-three [] 
  (largest-prime-factor))