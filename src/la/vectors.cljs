(ns la.vectors
  (:require [la.math :refer [abs]]))

(defn scalar [multiplier {:keys [magnitude direction]}]
  {:magnitude (* (abs multiplier) magnitude)
   :direction 
   (if (pos? multiplier) direction
     (+ direction (abs (* 360 multiplier))))})

(scalar (- (/ 1 3))
 {:magnitude 6
  :direction 300})

(mod 480 360)