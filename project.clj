(defproject euler_clj "0.1.0-SNAPSHOT"
  :description "A project for Euler problems solutions"
  :url "git@github.com:dandro/euler_clj.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]]
  :main ^:skip-aot euler-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
