1. Clone this repository:

    ```
    $ git clone http://github.com/harto/cljs-eval-test.git
    $ cd cljs-eval-test
    ```

2. Start a Clojure REPL, compile ClojureScript sources and start the browser REPL:

    ```
    $ lein repl
    user=> (load-file "bin/compile.clj")
    user=> (load-file "bin/repl.clj")
    ```

3. Open `resources/index.html` in a web browser

4. Evaluate forms in the `foo.core` (ClojureScript) namespace:

    ```
    ClojureScript:cljs.user> (in-ns 'foo.core)
    ClojureScript:foo.core> (hello)
    ```

A JavaScript alert should appear in the browser. Everything works as expected
so far.

1. Close and restart the Clojure REPL:

    ```
    $ lein repl
    ```

2. Start the browser REPL:

    ```
    user=> (load-file "bin/repl.clj")
    ```

3. Reload `resources/index.html` in the web browser

4. Evaluate forms in the `foo.core` namespace:

    ```
    ClojureScript:cljs.user> (in-ns 'foo.core)
    ClojureScript:foo.core> (hello)
    "Error evaluating:" (hello) :as ".hello.call(null);\n"
    ...
    ```

The ClojureScript compiler omits the namespace in the compiled JavaScript.
Forcing a recompile (by removing `.js` files or touching `.cljs` files, then
re-running `(load-file "bin/compile.clj")`) eliminates the problem.
