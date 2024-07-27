(ns fireworks.pp)

(defmacro ?pp
  ([])
  ([x] x)
  ([_ x] x))

(defmacro pprint
  ([])
  ([_])
  ([_ _])
  ([_ _ _]))
