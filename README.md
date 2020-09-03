# MaestriaEafitTransformacionFeatures

#Pruebas por pares

Algunos problemas solo ocurren como resultado de una interacción entre parámetros / componente.

Las pruebas por pares encuentran entre el 50% y el 90% de los defectos, prueba todos los pares (combinaciones de 2 vías) de variable valores, de ser selecionado o no seleccionado una feature

Es una técnica de prueba que requiere cubrir todas las tuplas de valores de tamaño t de n atributos de parámetros o propiedades modeladas a partir de los parámetros de entrada. Los conjuntos de pruebas de CIT han demostrado ser muy efectivos en las pruebas de software ya a nivel de pares (t = 2), y la efectividad de CIT crece con el ancho de tupla t. Desafortunadamente, la cantidad de tuplas que se van a probar también aumenta. Para reducir el esfuerzo de prueba, se evalua el tamaño mínimo con algoritmos eficaces y escalables.

Ejemplo:

¿Cuántas pruebas serían necesarias?

● Hay 5 feature, cada uno puede ser seleccionada o no seleccionada

● Todas las combinaciones son 2 5 = 32 pruebas

Aplicando transformación de feature manteniendo la equivalencia entre features

● Habian 5 feature con la transformacion de features manteniendo la equivalencia queda en 3 feature, cada uno puede ser seleccionada o no seleccionada

● Todas las combinaciones son 2 3 = 8 pruebas
