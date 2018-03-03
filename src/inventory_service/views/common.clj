(ns inventory-service.views.common
  (:require [hiccup.page :as h]
            [ring.util.anti-forgery :refer [anti-forgery-field]]))

(defmacro form
  [params & contents]
  `[:form ~params
    (anti-forgery-field)
    ~@contents])

(defn nav-bar
  "Renders a navigation bar somewhere"
  [])

(defmacro bootstrap-page
  [misc & elts]
  (let [misc
        (merge
         {:title "Event boooking"
          :css []
          :onload false
          :navbar true}

         misc)]
    `(h/html5
      [:head
       [:meta {:charset "utf-8"}]
       [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
       (h/include-css "/assets/bootstrap/css/bootstrap.min.css")
       (h/include-css "/assets/bootstrap/css/bootstrap-theme.min.css")
       [:script {:src "http://code.jquery.com/jquery-2.0.3.min.js"}]
       [:script {:src "/assets/bootstrap/js/bootstrap.min.js"}]
       (for [c# ~(:css misc)] (h/include-css c#))
       [:title ~(:title misc)]]
      [:body {:onload ~(:onload misc)}
       [:div
        (nav-bar)
        ~@elts]
       ])
    )
  )
