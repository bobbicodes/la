(ns la.vectors-test
  (:require 
   #?(:clj [clojure.test  :refer [deftest is run-tests]])
   #?(:cljs [cljs.test :refer [deftest is run-tests]])
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

;; https://www.khanacademy.org/math/linear-algebra/vectors-and-spaces/vectors/e/unit-vector?modal=1

(deftest unit-vector-test
  (is (= (vectors/unit-vector 6 6)
         {:x 6, :y 6, :denom "\\sqrt{72}", :value 8.48528137423857}))
  (is (= (vectors/unit-vector -8 5)
         {:x -8, :y 5, :denom "\\sqrt{89}", :value 9.433981132056603})))

(comment 
  (run-tests)
  )