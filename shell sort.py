# -*- coding: utf-8 -*-
"""
Created on Thu Oct 31 16:40:44 2024

@author: alas0
"""

def ShellSort(A):
    #inicializar el tamaño de la lista
    n = len(A)
    #empezar con el intervalo igual a la mitad del tam de la lista
    gap = int (n/2)
    #continuar reduciendo el intervalo hasta llegar a 0
    while gap > 0:
        #recorrer la lista desde el indice igual al intrervalo o gap hasta el final
        for i in range(gap,n):
            #guardar el valor actual en u a variable temporal
            temp = A[i]
            #inicializar la variable j en la posicion i
            j = i
            #desplazar los elementos del subareglo ordenado si son mayores que el valor temporal
            while j >= gap and A[j - gap] > temp:
                A[j] = A[j - gap]
                j -= gap
                
            #insertar el valor temporal en la posición correcta
            
            A[j] = temp
        print(A)    
        #Reeducir el gap
        gap //=2

#Ejemplo de uso
arreglo = [8,6,7,2,1,4,5,3]
ShellSort(arreglo)
print("Lista ordenada usando ShellSort", arreglo)
        
        