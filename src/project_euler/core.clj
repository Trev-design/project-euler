(ns project-euler.core)


(require '[project-euler.problem-one])
(require '[project-euler.problem-two])
(require '[project-euler.problem-three])
(require '[project-euler.problem-four])


(defn main []
  (project-euler.problem-one/problem-one)
  (project-euler.problem-two/problem-two)
  (project-euler.problem-three/problem-three)
  (project-euler.problem-four/problem-four))