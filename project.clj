(defproject am.ik/clj-gae-testing "0.2.0-SNAPSHOT"
  :description "a Test library on Google App Engine for Clojure"
  :repositories {"maven.seasar.org" "http://maven.seasar.org/maven2"}
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 [com.google.appengine/appengine-api-1.0-sdk "1.3.5"]
                 [com.google.appengine/appengine-testing "1.3.5"]
                 [com.google.appengine/appengine-api-labs "1.3.5"]
                 [com.google.appengine/appengine-api-stubs "1.3.5"]]
  :dev-dependencies [;; [com.google.appengine/appengine-local-runtime "1.3.5"]
                     ;; [leiningen/lein-swank "1.1.0"]
                     [lein-clojars "0.5.0-SNAPSHOT"]] 
  :namespaces [am.ik.clj-gae-testing.test-utils])
