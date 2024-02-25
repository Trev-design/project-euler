(ns project-euler.core)


(require '[project-euler.problem-one])
(require '[project-euler.problem-two])
(require '[project-euler.problem-three])
(require '[project-euler.problem-four])
(require '[project-euler.problem-five])
(require '[project-euler.prime-helper])


(defn main []
  (project-euler.problem-one/problem-one)
  (project-euler.problem-two/problem-two)
  (project-euler.problem-three/problem-three)
  (project-euler.problem-four/problem-four)
  (project-euler.problem-five/problem-five)
  (project-euler.prime-helper/sieve 100))