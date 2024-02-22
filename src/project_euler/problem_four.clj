(ns project-euler.problem-four)


(defn make-palindrome [number]
  (let [num-str (str number)]
    (Integer/parseInt (str num-str (apply str (reverse num-str))))))


(defn greatest-palindrome-product []
  (loop [number 0 palindrome-half 999 iterator 100]
    (if 
      (and (= (mod number iterator) 0)
           (<= (int (/ number iterator)) 999)
           (>= (int (/ number iterator)) 100))
      (print number "=" iterator "*" (int (/ number iterator)) "\n")
      (case iterator
        999 (recur (make-palindrome palindrome-half) (dec palindrome-half) 100)
        (recur (make-palindrome palindrome-half) palindrome-half (inc iterator))))))


(defn problem-four []
  (greatest-palindrome-product))