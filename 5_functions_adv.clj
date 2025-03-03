(ns advanced-functions)

;; Multi-arity function
defn greet
  ([] "Hello, Guest!")
  ([name] (str "Hello, " name "!"))
  ([name age] (str "Hello, " name "! You are " age " years old.")))

(println (greet))
(println (greet "Praitheesh"))
(println (greet "Praitheesh" 30))

;; Destructuring in function arguments
defn print-coordinates [[x y]]
  (println "X:" x "Y:" y))

(print-coordinates [10 20])

;; Recursion with tail-call optimization using loop/recur
defn factorial [n]
  (loop [acc 1, num n]
    (if (<= num 1)
      acc
      (recur (* acc num) (dec num)))))

(println "Factorial of 5:" (factorial 5))

;; Memoization to optimize recursive functions
def factorial-memo (memoize factorial))
(println "Memoized Factorial of 6:" (factorial-memo 6))

;; Higher-order functions with map, filter, and reduce
(def numbers [1 2 3 4 5])

(println "Squared numbers:" (map #(* % %) numbers))
(println "Even numbers:" (filter even? numbers))
(println "Sum of numbers:" (reduce + numbers))

;; Function composition
def square-and-double (comp #(* 2 %) #(* % %)))
(println "Square and double of 4:" (square-and-double 4))

;; Currying function
defn curried-add [a]
  (fn [b] (+ a b)))

(def add5 (curried-add 5))
(println "Adding 5 to 10:" (add5 10))
