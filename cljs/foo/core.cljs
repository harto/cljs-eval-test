(ns foo.core
  (:require [clojure.browser.repl :as repl]))

(defn ^:export hello []
  (js/alert "Hello"))

(defn ^:export init []
  (repl/connect "http://localhost:8081/repl"))
