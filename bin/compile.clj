(use '[cljs.closure :only (build)])
(build "cljs" {:output-to "resources/foo.js" :output-dir "resources/js"})
