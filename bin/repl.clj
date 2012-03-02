(use '[cljs.repl :only (repl)]
     '[cljs.repl.browser :only (repl-env)])
(repl (repl-env :port 8081))
