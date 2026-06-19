(defn collection-type [col]
  (cond
    (list? col) :list
    (map? col) :map
    (vector? col) :vector))

(println (collection-type (list 1 2)))
(println (collection-type {:a 1}))
(println (collection-type [1 2]))