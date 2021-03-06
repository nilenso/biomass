(defproject nilenso/biomass "0.7.0"
  :description "Boss people around. No suit required. Clojure wrapper for Amazon Mechanical Turk API"
  :url "https://github.com/shafeeq/biomass"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-codec "1.0.1"]
                 [clj-http "3.1.0" :exclusions [cheshire
                                                crouton
                                                org.clojure/tools.reader
                                                commons-codec]] ;; only this because ring-codec is behind
                 [clj-time "0.12.0"]
                 [prismatic/schema "1.1.3"]
                 [jarohen/nomad "0.7.2"]]
  :plugins [[cider/cider-nrepl "0.12.0"]])
