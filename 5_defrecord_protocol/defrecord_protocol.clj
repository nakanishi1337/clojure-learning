(defprotocol Greetable
  (greet [this]))

(defrecord Person [name]
  Greetable
  (greet [this]
    (str "Hello, " name "!")))

(println (greet (->Person "Alice")))
