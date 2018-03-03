(ns user
  (:require [ragtime.jdbc :as jdbc]
            [ragtime.repl :as repl]))

(def pg-db {:dbtype "postgresql"
            :dbname "inventory"
            :host "localhost"
            :user "inventory"
            :password "inventory"})

(defn load-config []
  {:datastore  (jdbc/sql-database pg-db)
   :migrations (jdbc/load-resources "migrations")})

(defn migrate []
  (repl/migrate (load-config)))

(defn rollback []
  (repl/rollback (load-config)))
