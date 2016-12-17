
(ns workflow.comp.container
  (:require [hsl.core :refer [hsl]] [quamolit.alias :refer [create-comp group text rect]]))

(defn render [timestamp store]
  (fn [state mutate! instant tick]
    (comment .log js/console state)
    (group
     {:style {}}
     (text {:style {:text-align "center", :size 20, :fill-style (hsl 0 0 0), :text "DEMO"}})
     (rect {:style {:y 40, :w 100, :fill-style (hsl 240 80 80), :x 100, :height 60}}))))

(def comp-container (create-comp :container render))
