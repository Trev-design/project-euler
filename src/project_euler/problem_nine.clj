(ns [project-euler.problem-nine :refer [pythagorean-triplet]])


(defn find-pythagorean-triplet [first-edge]
  (loop [first-edge first-edge 
         second-edge 1]
    (if (<= (+ first-edge (* second-edge 2)) 1000)
      (let [hypothenuse (- 1000 first-edge second-edge)] 
        (if (= (+ (Math/pow first-edge 2) (Math/pow first-edge 2)) (Math/pow hypothenuse 2)) 
          {:a first-edge :b second-edge :c hypothenuse} 
          (recur first-edge (inc second-edge))))
      (pythagorean-triplet (inc first-edge)))))


(defn pythagorean-triplet [first-edge]
  (if (< first-edge 334)
    (find-pythagorean-triplet first-edge)
    {:error "edge to big"}))


(defn calculate-product [results]
  (if (contains? results :error)
    results
    (->> (vals results) (reduce +))))


(defn problem-nine []
  (-> 1 (pythagorean-triplet) (calculate-product) (print "\n")))