(ns project-euler.core)

(require '[project-euler.problem-one])
(require '[project-euler.problem-two])
(require '[project-euler.problem-three])


(defn main []
  (print (project-euler.problem-one/problem-one) "\n")
  (print (project-euler.problem-two/problem-two) "\n")
  (print (project-euler.problem-three/problem-three) "\n"))