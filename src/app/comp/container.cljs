
(ns app.comp.container
  (:require [hsl.core :refer [hsl]] [quamolit.alias :refer [create-comp group text rect]]))

(defn render [timestamp store]
  (fn [state mutate! instant tick]
    (comment .log js/console state)
    (group
     {:style {}}
     (text {:style {:text "DEMO", :fill-style (hsl 0 0 0), :text-align "center", :size 20}})
     (rect {:style {:x 100, :y 40, :w 100, :height 60, :fill-style (hsl 240 80 80)}}))))

(def comp-container (create-comp :container render))
