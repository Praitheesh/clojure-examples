(ns loops)

;; 1. Using loop and recur (Explicit recursion)
(defn count-down [n]
  (loop [i n]
    (when (pos? i)
      (println "Countdown:" i)
      (recur (dec i)))))  ;; recur calls loop again with new value

(count-down 5)

;; 2. Using for (List comprehension - returns a sequence)
(def numbers (for [x (range 1 6)] (* x x)))  ;; squares of numbers 1 to 5
(println "Squares:" numbers)

;; 3. Using doseq (Side-effect iteration, similar to foreach)
(doseq [n (range 1 6)]
  (println "Processing number:" n))

;; 4. Using map (Functional iteration)
(def squared (map #(* % %) (range 1 6)))
(println "Mapped squares:" squared)

;; 5. Using reduce (Accumulating values)
(def sum (reduce + (range 1 6)))
(println "Sum of numbers 1 to 5:" sum)
