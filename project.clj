(defproject cljs-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  ;; :main "cljs.main"
  :plugins [[lein-cljsbuild "1.1.4"]]
  :dependencies [
    [org.clojure/clojure "1.12.2"]
    [org.clojure/clojurescript "1.12.116"]
    ]
  :cljsbuild {
    :builds [{
        :source-paths ["src"]
        :compiler {
          :main "cljs-test.core"
          :output-to "out/main.js"
          :output-dir "out"
          :target :nodejs
          :optimizations :none
          :pretty-print true}}]}
  :repl-options {:init-ns cljs-test.core})
