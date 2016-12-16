
(ns workflow.updater.core (:require [workflow.schema :as schema]))

(defn updater-fn [store op op-data tick]
  (.log js/console "store update:" op op-data tick)
  (case op store))
