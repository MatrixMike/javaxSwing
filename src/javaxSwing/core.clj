(comment revived Thursday, 25 October 2018)
(ns javaxSwing.core
  (:gen-class)
  (:import [java.awt Dimension]) 
   (:import [java.awt Color])
  (:import [javax.swing JPanel JFrame] )

  )
;; Tue 12 May 2015 00:15:46 EST 
 (def psize  200)
 (def width 50)
 (def height 75)

(defn make-panel []
  (let [panel (proxy [JPanel] []
                (paintComponent [g]
 ;;                 (.drawLine g 0 0   psize psize)
;;    (doto g
   ;  (.setColor (. Color YELLOW))
 ;;  (.setColor Color/YELLOW)
    ;  (.drawRect 100 100 width height)    ; why not working
;;     (.setColor (. Color BLACK))
   ;;  (.drawRect 0 0 (dec width) (dec height))
   ;   (.setFont g (Font. "Serif" (. Font PLAIN) 24))
 ;;     (.drawString "Hello World!" 20 40))))
                 ; (.drawLine g 0 psize psize psize)
           (doto g       (.setColor Color/ORANGE))
          (doseq [j (range 1 5)]       
        (doseq [i (range 0 10)]          
                 ; (for [leng [20 30 40 50 60 70 80 90]]
					(.drawLine g 20 0 (* i 75) (* j 75))) )
                  
                  ;(.drawLine g psize 0   psize psize)
                  ;(.drawLine g psize 0   0 psize) 
                  
  (doseq [i (range 0 5)]
      ;(println (+ (* i 10) 2)    ))                
    
	;(for [leng [20 30 40 50 60 70 80 90]]
    ;  concat an integer to           	 (.drawString g ["Mike"+str(i)]   (* i 10) (- 200 (* i 15) ) ) )
          (doto g       (.setColor Color/BLUE))  
          (.drawString g "Mike H"   (* i 10) (- 200 (* i 15) ) ) )  
          
            (doseq [j (range 1 5)]  
      ;      (def label ["mike " str(j)]  )
                            (doto g       (.setColor Color/GREEN)) 
			(.drawString g (str "Mike " j) psize (* j 75) )  )
                  ))]
    (doto panel
      (.setPreferredSize (Dimension. (* psize 2) (* psize 2))))))
 ;---------------------------------------
(defn make-frame [panel]
  (doto (new JFrame "javaxSwing with colours")        ;;was (new JFrame)
    (.add panel)
     (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
    .pack
    .show))
 ;--------------------------------------- 
 
 (defn -main [& args] 
(make-frame (make-panel))
 
)
