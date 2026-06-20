(def accounts
  (ref [{:id 1 :name "Alice" :balance 1000}
        {:id 2 :name "Bob" :balance 500}]))

(defn change-balance [account-id amount]
  (dosync
    (alter accounts
           (fn [accounts]
             (mapv (fn [account]
                     (if (= (:id account) account-id)
                       (update account :balance + amount)
                       account))
                   accounts)))))

(defn debit [account-id amount]
  (change-balance account-id (- amount)))

(defn credit [account-id amount]
  (change-balance account-id amount))

(println @accounts)
(debit 1 200)
(credit 2 300)
(println @accounts)
