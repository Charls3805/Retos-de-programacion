# -*- coding: utf-8 -*-
"""
Created on Thu Oct  3 19:05:12 2024

@author: alas0
"""

def Hanoi(a,b,c,n):
    #nota:
            #a:origen
            #b: destino
            #c: auxiliar
    #caso base: Si solo hay un disco, se mueve directamente del origen al destino
    if n == 1:
        print(f"Mover disco 1 de la torre {a} a la torre {b}")
        return 

    #mover los n-1 discos de origen a auxiliar usando destino como apoyo
    Hanoi(a,c,b,n-1)
    
    #mover el disco n de origen a destino
    print(f"Mover disco {n} de la torre {a} a la torre {b}")
    
    #mover n-1 discos de auxiliar a destino usando origen como apoyo
    Hanoi(c,b,a,n-1)
    
#ejemplo de uso
n = 3
Hanoi("A", "B", "C", n)