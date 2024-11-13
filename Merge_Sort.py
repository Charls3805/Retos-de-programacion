# -*- coding: utf-8 -*-
"""
Created on Thu Oct 31 18:08:54 2024

@author: alas0
"""

def Merge_Sort(A):
    #verificar si la lista tiene mas de 1 elemento( sino, ya esta ordenada)
    n = len(A)
    if n > 1:
        #Encontrar el punto medio de la lista
        medio = n // 2
        #dividir la lista en dos mitades
        izquierda = A[:medio]
        derecha = A[medio:]
        
        #llamar a merge sort recursivamente en ambas mitades
        Merge_Sort(izquierda)
        Merge_Sort(derecha)
        
        #inicializamos los indices para recorrer cada mitad y la lista principal
        #i = izquierda
        #j = derecha
        #k = original
        i = 0 
        j = 0 
        k = 0 
        
        #combinamos las dos mitades en una sola lista ordenada
        while i < len(izquierda) and j < len(derecha):
            if izquierda[i] < derecha [j]:
                A[k] = izquierda[i]
                i += 1
            else:
                A[k] = derecha[j]
                j += 1
            k += 1
        while i < len(izquierda):
            A[k] = izquierda[i]
            i += 1
            k += 1
        #Agregar los elementos restantes de derecha si los hay
        while j < len(derecha):
            A[k] = derecha[j]
            j += 1
            k += 1
        print(A)   
#ejemplo de uso
arreglo = [2, 124, 23, 5, 89, -1, 44, 643, 34]
Merge_Sort(arreglo)
print("Lista ordenada usando Merge Sort: ", arreglo)