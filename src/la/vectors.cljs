(ns la.vectors
  (:require [la.math :refer [abs]]))

(defn scalar [multiplier {:keys [magnitude direction]}]
  {:magnitude (* (abs multiplier) magnitude)
   :direction 
   (if (pos? multiplier) direction
     (+ direction (abs (* 360 multiplier))))})

(defn endpoint [scalar x y]
  [(* scalar x) (* scalar y)])

(comment
  (scalar (- (/ 1 3))
          {:magnitude 6
           :direction 300})
  (scalar 5
          {:magnitude 3
           :direction 160})
  (endpoint (- (/ 1 3)) -3 6)
  (endpoint (- (/ 1 5)) -25 10)
  (endpoint 0.5 -4 -6)
  (endpoint 0.25 8 4)
  )