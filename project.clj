(defproject corenlp "3.6.3"
  :description "Clojure wrapper for the Stanford CoreNLP tools."
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [edu.stanford.nlp/stanford-corenlp "3.9.2"]
                 [edu.stanford.nlp/stanford-corenlp "3.9.2" :classifier "models"]
                 [org.clojure/data.json "0.2.6"]
                 [aysylu/loom "0.6.0"]]
  :plugins [[lein-auto "0.1.2"]])
