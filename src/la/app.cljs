(ns la.app
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [la.editor :as editor :refer [update-editor! !tri eval-all]]
            [la.math :refer [pi]]))

(defonce tri
  (r/atom {:magnitude 4
           :direction 80}))

(def view-box-width 300)
(def view-box-height 326)

(def grid
  (fn []
    [:path {:d "M0 325V25M18.75 325V25M37.5 325V25M56.25 325V25M75 325V25M93.75 325V25M112.5 325V25M131.25 325V25M150 325V25M168.75 325V25M187.5 325V25M206.25 325V25M225 325V25M243.75 325V25M262.5 325V25M281.25 325V25M300 325V25M0 325h300M0 306.25h300M0 287.5h300M0 268.75h300M0 250h300M0 231.25h300M0 212.5h300M0 193.75h300M0 175h300M0 156.25h300M0 137.5h300M0 118.75h300M0 100h300M0 81.25h300M0 62.5h300M0 43.75h300M0 25h300"
            :stroke "#ffcc00"
            :stroke-width 2
            :opacity ".1"}]))

(defn axes []
  [:path {:d "M150 175H1.05
              M150 175h148.95
              M150 175v148.95
              M150 175V26.05"
          :stroke "#ffcc00"
          :stroke-linejoin "round"
          :stroke-linecap "round"
          :stroke-width 2}])

(defn arrows []
  [:path {:d "M7.05 169.4c-.35 2.1-4.2 5.25-5.25 5.6 1.05.35 4.9 3.5 5.25 5.6
              M294.45 180.6c.35-2.1 4.2-5.25 5.25-5.6-1.05-.35-4.9-3.5-5.25-5.6
              M155.5 31.3c-2.1-.35-5.25-4.2-5.6-5.25-.35 1.05-3.5 4.9-5.6 5.25
              M144.5 318.7c2.1.35 5.25 4.2 5.6 5.25.35-1.05 3.5-4.9 5.6-5.25"
          :fill "none"
          :stroke "#ffcc00"
          :stroke-linejoin "round"
          :stroke-linecap "round"
          :stroke-width 2}])

(defn ticks []
  [:path {:d "M168.75 180v-10M187.5 180v-10M206.25 180v-10M225 180v-10M243.75 180v-10M262.5 180v-10M281.25 180v-10M131.25 180v-10M112.5 180v-10M93.75 180v-10M75 180v-10M56.25 180v-10M37.5 180v-10M18.75 180v-10M145 156.25h10M145 137.5h10M145 118.75h10M145 100h10M145 81.25h10M145 62.5h10M145 43.75h10M145 193.75h10M145 212.5h10M145 231.25h10M145 250h10M145 268.75h10M145 287.5h10M145 306.25h10"
          :stroke "#ffcc00"}])

(defn graph []
      [:svg {:width    "100%"
             :view-box (str "0 24 " view-box-width " " view-box-height)}
       [:g
        [grid]
        [arrows]
        [axes]
        [ticks]]])

(defn app []
  [:div#app
   [:h2 "Linear Algebra"]
   [editor/editor (str @tri) !tri {:eval? true}]
   [graph]])

(defn render []
  (rdom/render [app]
            (.getElementById js/document "root")))

(defn ^:dev/after-load start []
  (render)
  (js/console.log "start"))

(defn ^:export init []
  (js/console.log "init")
  (start))

(defn ^:dev/before-load stop []
  (js/console.log "stop"))
