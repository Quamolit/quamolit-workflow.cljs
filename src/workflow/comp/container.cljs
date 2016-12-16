
(ns workflow.comp.container
  (:require [hsl.core :refer [hsl]] [quamolit.alias :refer [create-comp group text rect]]))

(defn style-button [guide-text]
  {:font-size 16,
   :surface-color (hsl 200 80 50),
   :w 80,
   :text-color (hsl 200 80 100),
   :h 32,
   :text guide-text})

(defn handle-back [mutate!] (fn [event dispatch] (mutate! :portal)))

(defn render [timestamp store]
  (fn [state mutate! instant tick]
    (comment .log js/console state)
    (group {:style {}} (text {:style {:color (hsl 0 0 0), :text "DEMO"}}) (rect {}))))

(def comp-container (create-comp :container render))
