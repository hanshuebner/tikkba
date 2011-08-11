(defproject tikkba "0.2.0"
  :description
  "Tikkba is Clojure library for the creation and the dynamic modification
of SVG documents. It wraps the Apache Batik library and provides functions to
create SVG images with the Clojure-based SVG DSL of the Analemma library."
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojars.pallix/analemma "1.0.0-SNAPSHOT"]
                 [org.clojars.pallix/batik "1.7.0"]]
  :dev-dependencies [[swank-clojure "1.4.0-SNAPSHOT"]
                     [org.clojars.rayne/autodoc "0.8.0-SNAPSHOT"]])
