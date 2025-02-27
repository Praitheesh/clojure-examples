(ns my-clojure-learning)

;; Define a simple function
(defn greet [name]
  (str "Hello, " name "!"))

;; Call the function
(println (greet "Praitheesh"))

;; Function with multiple parameters
(defn add [a b]
  (+ a b))

(println "Sum of 5 and 3 is:" (add 5 3))

;; Function with recursion (factorial example)
(defn factorial [n]
  (if (<= n 1)
    1
    (* n (factorial (- n 1)))))

(println "Factorial of 5 is:" (factorial 5))

;; Anonymous function (lambda)
(def square (fn [x] (* x x)))

(println "Square of 4 is:" (square 4))

;; Shorter anonymous function using #(…)
(def cube #(* % % %))

(println "Cube of 3 is:" (cube 3))
