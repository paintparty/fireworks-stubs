(ns fireworks.core
  #?(:cljs (:require-macros 
            [fireworks.core :refer [? !? ?> !?> ?flop !?flop]])))

(defmacro ?>
  ([x] x))

(defmacro ?
  ([])
  ([x] x)
  ([_ x] x)
  ([_ _ x] x))

(defmacro ?flop
  ([])
  ([x] x)
  ([x _] x))

(defmacro !?>
  ([x] x))

(defmacro !?
  ([])
  ([x] x)
  ([_ x] x)
  ([_ _ x] x))

(defmacro !?flop
  ([])
  ([x] x)
  ([x _] x))
