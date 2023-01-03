(ns la.math)

(def pi
  #?(:clj Math/PI)
  #?(:cljs js/Math.PI))

(defn sqrt [n]
  #?(:clj (Math/sqrt n))
  #?(:cljs (.sqrt js/Math n)))

(defn sq [n]
  (* n n))

(defn sin [rad]
  #?(:clj (Math/sin rad))
  #?(:cljs (.sin js/Math rad)))

(defn cos [rad]
  #?(:clj (Math/cos rad))
  #?(:cljs (.cos js/Math rad)))

(defn tan [rad]
  #?(:clj (Math/tan rad))
  #?(:cljs (.tan js/Math rad)))

(defn asin [rad]
  #?(:clj (Math/asin rad))
  #?(:cljs (.asin js/Math rad)))

(defn acos [rad]
  #?(:clj (Math/acos rad))
  #?(:cljs (.acos js/Math rad)))

(defn atan [rad]
  #?(:clj (Math/atan rad))
  #?(:cljs (.atan js/Math rad)))

(defn csc
  "Returns the cosecant, the reciprocal of the sine,
   the ratio of the hypotenuse to the side opposite 
   a given angle in a right triangle."
  [h o]
  (/ h o))

(defn sec
  "Returns the secant, the reciprocal of the cosine,
   the ratio of the hypotenuse to the side adjacent to 
   a given angle in a right triangle."
  [h a]
  (/ h a))

(defn cot
  "Returns the cotangent, the reciprocal of the tangent,
   the ratio of the adjacent side 
   to the opposite side of a right triangle."
  [a o]
  (/ a o))