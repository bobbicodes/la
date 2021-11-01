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
  (endpoint (- (/ 1 3)) -3 6)
  )