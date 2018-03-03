(ns inventory-service.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.json :refer [wrap-json-response]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [inventory-service.views.categories :as cat-views]))

(defroutes app-routes
  (GET "/" [] "Inventory Handler")
  (GET "/categories/" []
       (cat-views/list-categories))
  (route/not-found "Not Found"))

(def app
  (wrap-json-response
   (wrap-defaults app-routes site-defaults)))
