(ns basic-concepts)

;; Define a simple function
(defn greet [name]
  (str "Hello, " name "!"))

;; Call the function
(println (greet "Alice"))

;; Working with lists
(def my-list '(1 2 3 4 5))
(println "List:" my-list)

;; Working with vectors
(def my-vector [10 20 30 40])
(println "Vector:" my-vector)

;; Working with maps
(def my-map {:name "Alice" :age 30 :city "New York"})
(println "Map:" my-map)

;; Access map values
(println "Name:" (:name my-map))
