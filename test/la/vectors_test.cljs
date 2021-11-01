(ns la.vectors-test
  (:require [cljs.test :refer (deftest is run-tests)]
            [la.vectors :as vectors]))

(deftest scalar-multiplication-test
  (is (= (vectors/scalar (- (/ 1 2))
                 {:magnitude 4
                  :direction 80})
         {:magnitude 2 :direction 260}))
  (is (= (vectors/scalar (/ 1 3)
                 {:magnitude 6
                  :direction 300})
         {:magnitude 2, :direction 300})))

(comment
  (run-tests))