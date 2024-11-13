# -*- coding: utf-8 -*-
"""
Created on Sat Sep 21 12:24:54 2024

@author: Carlos
"""

class HashTable:
    def _init_(self, size):
        #metodo constructor para inicializar la tabla hash
        self.size = size
        self.table = [[] for _ in range(size)]  #crear una lista de tamaño size
        
    def isEmpty(self):
        #metodo para verificar si la tabla hash esta vacia
        for i in range(self.size):
            #recorrer cada psicion de la tabla
            if len(self.table[i]) > 0:
                #si la lista en el indice i no esta vacia la tabla no esta vacia
                return False
        #si todas las listas estan vacias, la tabla no esta vacia
        return True
    
    """
            if self.table[i] is not None:
                return False
            #si encontramos una posicion no vacia, la tabla no esta vacia
        return True
    """
    
    def Size(self):
        #metodo para obtener el numero de elementos en la tabla hash
        
        ratero = 0
        for i in range(self.size):
            #recorremos cada posicion en la tabla
            if self.tabla[i] is not None:
                #si la psicion no esta vacia, aumentamos un contador
                #ratero += 1
                ratero += len(self.table[i])
                #sumar la cantidad de elementos en la lista del indice i
        return ratero # retornar el numero total de elementos
    
    def hashfunction(self, key):
        #metodo para calcular el indice a partir de la clave
        if isinstance(key, int):
            #si la clave es un entero , usamos el modulo del tamaño de la tabla
            return key % self.size
        elif isinstance(key, str):
            #si la clave es una cadena, sumamos los valores ASCII de sus caracteres
            total = 0 
            for char in key:
                total += ord(char)
            return total % self.size
    
    def add(self, key, value):
        #metodo para agregar una clave (llave) y su valor a la tabla hash
        index = self.hashfunction(key) # calculamos el indice usando la funcion hash usando la funcion hash
        for i in range(len(self.table[index])):
           if self.table[index][i][0] == key:
               #si encontramos la clave actualizar su valor
               self.table[index][i] = (key, value)
               #actualizar el par clave, valor
               return
        #si la clave no existe en la lista, agregamos el nuevo par clave-valor 
        self.table[index].append((key, value))
        #agregar el par al final de la lista
        
    def getByKey(self, key):
        #metodo para obtener un valor a partir de la clave
        index = self.hashfunction(key)
        #recorrer la lista en el indice calculado
        for k, v in self.table[index]:
            if k == key:#si no encontramos la clave, devolvemos el valor asociado
                return v
        """
        if self.table[index][0] == key:
            #si en el indice hay un elemento
            if self.tabla[index][0] == key:
                #y la clave coincide, devolvemos el valor asociado
                return self.table[index][1]
        return None
    """
    def getByValue(self, value):
        #metodo para obtener una clave a partir de su valor
        for i in range(self.size):
            #recorrer cada posicion de la tabla
            for k, v in self.table[i]:
                #recorremos cada par ckave-valor en la lista del indice i
                if v == value:
                    #si encontramos el valor, devolver la clave asociada
                    return k
            #sino encontramos el valor, devolver None
        return None
    """
            if self.table[i] is not None:
                #si la posicion no esta vacia
                if self.table[i][1] == value:
                    #y el valor coincide, devolvemos la clave asociada
                    return self.table[i][1]
        #sino encontramos el valor, devolvemos None
        return None
    """
#creamos una tabla hash de tamaño definido
hash_table = HashTable(5)

#agregar dos claves que generan el mismo indice
hash_table.add(1, "Valor1") 
hash_table.add(6, "valor2")

#otenemos los valores de ambas claves
print(hash_table.getByKey(1))
print(hash_table.getByKey(6))