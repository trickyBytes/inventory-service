(ns inventory-service.views.categories
   (:require [hiccup.page :as h]
             [inventory-service.views.common :refer :all]
             [clojure.string :refer [join]]))

(defn list-categories [categories]
  (bootstrap-page
   {:title "Categories"}
   [:div.container-fluid
    [:table.table
     [:thead
      [:tr
       [:th {:scope "col"} "#"]
       [:th {:scope "col"} "Name"]]
      [:tbody
      (for [c (vals categories)]
        [:tr
         [:th {:scope "row"} (:id c)]
         [:td (:name c)]])
      ]]]]))
   
(defn edit-category []
  (bootstrap-page
   {:title "Category"}
   (form
    [:div.container-fluid
     [:div.form-group
      [:label {:for "parent"} "Parent Category"]
      [:input.form-control {:type "text" :id "parent" :name "parent"}]]

     [:div.form-group
      [:label {:for "name"} "Name"]
      [:input.form-control {:type "text ":id "name" :name "name"} "Text"]]])))
