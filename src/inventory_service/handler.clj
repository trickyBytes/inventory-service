(ns inventory-service.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.webjars :refer [wrap-webjars]]
            [ring.middleware.json :refer [wrap-json-response]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [inventory-service.views.categories :as cat-views]))

(defroutes app-routes
  (GET "/" [] "Inventory Handler")
  (GET "/categories/" []
       (cat-views/list-categories {1 {:id 1 :name "Necklaces"}
                                   2 {:id 2 :name "Bracelets"}}))
  (route/not-found "Not Found"))

(def app
  (->
   app-routes
   wrap-webjars
   wrap-json-response
   (wrap-defaults site-defaults)))
