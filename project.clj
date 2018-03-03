(defproject inventory-service "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [compojure "1.6.0"]
                 [ring/ring-defaults "0.2.1"]

                 [buddy/buddy-auth "2.1.0"]

                 ;;Database
                 [ragtime "0.7.2"]
                 [org.clojure/java.jdbc "0.7.5"]
                 [org.postgresql/postgresql "9.4.1212.jre7"]
                 ]
  :plugins [[lein-ring "0.12.3"]]
  :ring {:handler inventory-service.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}}

  :aliases {"migrate"  ["run" "-m" "user/migrate"]
            "rollback" ["run" "-m" "user/rollback"]})
