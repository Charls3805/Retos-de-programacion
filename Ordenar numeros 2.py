# -*- coding: utf-8 -*-
"""
Created on Sat Oct 26 16:37:16 2024

@author: Carlos
"""

import random
import time
def Insertion_Sort(arr):
    n = len(arr)
    for i in range(1, n):
        aux = arr[i]
        j = i-1
        while j >=0 and aux < arr[j]:
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = aux
    return arr

#ejemplo de uso
arr = [5,3,8,4,2]
#arr = [random.randint(1,30) for i in range(1000)]
#medir el tiempo de ejecución
star_time = time.time()
print(Insertion_Sort(arr))
#terime
end_time = time.time()
#mostrar el tiempo de ejecucion
print(f"Ordenar {len(arr)} numeros lleva: ")
print("Tiempo de ejecucion: {:.6f} segundos.", format(end_time - star_time))