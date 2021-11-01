(ns la.vectors
  (:require [la.math :refer [abs]]))

(defn scalar [multiplier {:keys [magnitude direction]}]
  {:magnitude (* (abs multiplier) magnitude)
   :direction (+ direction (abs (* 360 multiplier)))})

(scalar (- (/ 1 2))
 {:magnitude 4
  :direction 80})

{:magnitude nil
 :direction nil}

(+ 80 (abs (* 360 (- (/ 1 2)))))