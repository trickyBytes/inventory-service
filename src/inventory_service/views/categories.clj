(ns inventory-service.views.categories
   (:require [hiccup.page :as h]
             [inventory-service.views.common :refer :all]
             [clojure.string :refer [join]]))

(defn list-categories []
  (bootstrap-page
   {:title "Categories"}
   [:div "Some categories"]))
