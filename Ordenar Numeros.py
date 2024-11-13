# -*- coding: utf-8 -*-
"""
Created on Sat Oct 26 16:32:57 2024

@author: Carlos
"""

import time
import random
def tamalitos(greñas): #greñas es el arreglo
     contador = 0
     running = True
     if not greñas:
         return 0
     else:
         while running:
             greñas.pop(0)
             contador += 1
 #if greñas is None:
     if not greñas:
         running = False
         return contador
def Bubble_Sort(arr):
    n = len(arr)
    for i in range(n-1):
        #print(f"Pasada: ", i+1)
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                #intercambiar
                #print(arr)
                aux = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = aux
                #print(f"Se intercambia {arr[j]} por {arr[j+1]}:")
                #print(arr)
                #print(f"Fin de pasada: ", i+1)
    return arr
#ejemplo de uso
#arr = [5,3,8,4,2]
arr = [random.randint(1,30) for i in range(1000)]
#medir el tiempo de ejecución
star_time = time.time()
print(Bubble_Sort(arr))
#terime
end_time = time.time()
#mostrar el tiempo de ejecucion
print(f"Ordenar {len(arr)} numeros lleva: ")
print("Tiempo de ejecucion: {:.9f} segundos.", format(end_time - star_time))