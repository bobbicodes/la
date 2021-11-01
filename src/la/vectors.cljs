(ns la.vectors
  (:require [la.math :refer [abs sq sqrt]]))

(defn scalar [multiplier {:keys [magnitude direction]}]
  {:magnitude (* (abs multiplier) magnitude)
   :direction 
   (if (pos? multiplier) direction
     (+ direction (abs (* 360 multiplier))))})

(defn endpoint [scalar x y]
  [(* scalar x) (* scalar y)])

(defn unit-vector [x y]
    {:x x
     :y y
     :denom (str "\\sqrt{" (+ (sq x) (sq y)) "}")
     :value
     (sqrt (+ (sq x) (sq y)))})

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
  (sqrt (+ (sq 6) (sq 6)))
  (unit-vector 6 6)
    (unit-vector -8 5)
  (unit-vector 5 -2)
  (unit-vector 2 7)
  (unit-vector 2 -8)
  )