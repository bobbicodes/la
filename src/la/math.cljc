(ns la.math)

(def pi
  #?(clj Math/PI)
  #?(cljs js/Math.PI))

(defn sqrt [n]
  #?(clj (Math/sqrt n))
  #?(cljs (.sqrt js/Math n)))

(defn sq [n]
  (* n n))

(defn sin [rad]
  #?(clj (Math/sin n))
  #?(cljs (.sin js/Math n)))

(defn cos [rad]
  #?(clj (Math/cos n))
  #?(cljs (.cos js/Math n)))

(defn tan [rad]
  #?(clj (Math/tan n))
  #?(cljs (.tan js/Math n)))

(defn asin [rad]
  #?(clj (Math/asin n))
  #?(cljs (.asin js/Math n)))

(defn acos [rad]
  #?(clj (Math/acos n))
  #?(cljs (.acos js/Math n)))

(defn atan [rad]
  #?(clj (Math/atan n))
  #?(cljs (.atan js/Math n)))

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