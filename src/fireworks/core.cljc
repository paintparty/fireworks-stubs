(ns fireworks.core
  #?(:cljs (:require-macros 
            [fireworks.core :refer [? !? ?- !?- ?-- !?-- ?> !?> ?i !?i
                                    ?l !?l ?log !?log ?log- !?log- ?pp
                                    !?pp ?pp- !?pp- ?trace !?trace p-data]])))
     


(defmacro ?>
  ([x] x))

(defmacro ?-
  ([])
  ([x] x)
  ([a x] x))

(defmacro ?i
  ([])
  ([x] x)
  ([a x] x))

(defmacro ?l
  ([])
  ([x] x)
  ([a x] x))

(defmacro ?
  ([])
  ([x] x)
  ([a x] x))

(defmacro ?flop
  ([])
  ([x] x)
  ([x a] x))

(defmacro ?--
  ([])
  ([x] x))

(defmacro ?trace 
  ([x] x)
  ([user-opts x] x))

(defmacro ?log
  ([])
  ([x] x)
  ([a x] x))

(defmacro ?log-
  ([])
  ([x] x))

(defmacro ?pp
  ([])
  ([x] x)
  ([a x] x))

(defmacro ?pp-
  ([])
  ([x] x))

(defmacro p-data
  ([])
  ([x] x)
  ([a x] x))



(defmacro !?>
  ([x] x))

(defmacro !?-
  ([])
  ([x] x)
  ([a x] x))

(defmacro !?i
  ([])
  ([x] x)
  ([a x] x))

(defmacro !?l
  ([])
  ([x] x)
  ([a x] x))

(defmacro !?
  ([])
  ([x] x)
  ([a x] x))

(defmacro !?flop
  ([])
  ([x] x)
  ([x a] x))

(defmacro !?--
  ([])
  ([x] x))

(defmacro !?trace 
  ([x] x)
  ([user-opts x] x))

(defmacro !?log
  ([])
  ([x] x)
  ([a x] x))

(defmacro !?log-
  ([])
  ([x] x))

(defmacro !?pp
  ([])
  ([x] x)
  ([a x] x))

(defmacro !?pp-
  ([])
  ([x] x))



;; (defn !?*
;;   ([])
;;   ([x] x)
;;   ([_ x] x))

;; (def ?> !?*)
;; (def ?- !?*)
;; (def ?i !?*)
;; (def ?l !?*)
;; (def ? !?*)
;; (def ?flop !?*)
;; (defn !?-- ([]) ([x]))
;; (def ?trace !?*)
;; (def ?log !?*)
;; (def ?log- !?*)
;; (def ?pp !?*)
;; (def ?pp- !?*)
;; (def p-data !?*)

;; Silencers
;; (def !?> !?*)
;; (def !?- !?*)
;; (def !?i !?*)
;; (def !?l !?*)
;; (def !? !?*)
;; (def !?flop !?*)
;; (defn !?-- ([]) ([x]))
;; (def !?trace !?*)
;; (def !?log !?*)
;; (def !?log- !?*)
;; (def !?pp !?*)
;; (def !?pp- !?*)
