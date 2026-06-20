(defmacro unless
  ([test body]
   (list 'if (list 'not test) body))
  ([test then else]
   (list 'if (list 'not test) then else)))

(unless false (println "This will be printed"))
(unless true (println "This will not be printed"))

(unless false
  (println "This will be printed")
  (println "This will not be printed"))

(unless true
  (println "This will not be printed")
  (println "This will be printed"))


