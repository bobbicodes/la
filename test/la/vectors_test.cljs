(ns la.vectors-test
  (:require [cljs.test :refer (deftest is run-tests)]
            [la.vectors :as vectors]))

;; https://www.khanacademy.org/math/linear-algebra/vectors-and-spaces/vectors/e/scaling_vectors?modal=1

(deftest scalar-multiplication-test
  (is (= (vectors/scalar (- (/ 1 2))
                 {:magnitude 4
                  :direction 80})
         {:magnitude 2 :direction 260}))
  (is (= (vectors/scalar (/ 1 3)
                 {:magnitude 6
                  :direction 300})
         {:magnitude 2, :direction 300}))
  (is (= (vectors/scalar 5
                 {:magnitude 3
                  :direction 160})
         {:magnitude 15, :direction 160})))

(deftest endpoint-test
  (is (= (vectors/endpoint (- (/ 1 3)) -3 6) [1 -2]))
  (is (= (vectors/endpoint (- (/ 1 5)) -25 10) [5 -2]))
  (is (= (vectors/endpoint (/ 1 2) -4 -6) [-2 -3]))
  (is (= (vectors/endpoint (/ 1 4) 8 4) [2 1])))

(comment
  (run-tests)
  )