(ns la.vectors-test
  (:require [cljs.test :refer (deftest is run-tests)]
            [la.vectors :as vectors]))

(deftest scalar-multiplication-test
  (is (= (vectors/scalar (- (/ 1 2))
                 {:magnitude 4
                  :direction 80})
         {:magnitude 2 :direction 260})))

(comment
  (run-tests))