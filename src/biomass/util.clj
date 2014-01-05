(ns biomass.util
  (:require [clj-time.format :as tf]))

(defn nil-or-integer
  [s]
  (when-not (empty? s)
    (Integer/parseInt s)))

(defn nil-or-double
  [s]
  (when-not (empty? s)
    (Double/parseDouble s)))

;;TODO: allow passing of formatter type, with default
(defn nil-or-datetime
  [s]
  (when-not (empty? s)
    (tf/parse (tf/formatters :date-time-no-ms) s)))

(defn nil-or-boolean
  [s]
  (when-not (empty? s)
    (Boolean/parseBoolean s)))

(defn restify-layout-params
  [params]
  (let [convert #(hash-map (keyword (str "HITLayoutParameter." %1 ".Name")) (name (first %2))
                           (keyword (str "HITLayoutParameter." %1 ".Value")) (second %2))]
    (reduce merge (map convert (range) params))))
