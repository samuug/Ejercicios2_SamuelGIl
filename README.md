# Ejercicios2_SamuelGIl

## Nota:
Mi repositorio es: https://github.com/samuug/Ejercicios2_SamuelGIl.git

## Enunciado:
### 1. Valores de las variables
__¿Cuáles serán los valores de las variables a y b después de cada línea del siguiente algoritmo?__  
Algo ValoresDeLasVariables  
variable a, b: entero  
Inicio  
1   a <- 3  
2   escribir("a = " & a)  
3   b<-a+5  
4   escribir("a = " & a & " y b = " & b)  
5   a<-7  
6   escribir("a = " & a & " y b = " & b)  
Fin 

__Solución__  
1: a:3, b:0  
2: a:3, b:0  
3: a:3, b:2  
4: a:3, b:2  
5: a:7, b:-2  
6: a:7, b:-2  

### 2. ¿Qué se muestra?
__¿Qué veremos al ejecutar el siguiente algoritmo?__

Algo QueVeremos 
# ¿Qué veremos al ejecutar el siguiente algoritmo?  
Variable valor1, valor2: entero  
Variable cadena1: texto  
Constante CST: real <- 49,78  
Inicio  
   valor1 <- 92 % 8  
   valor2 <- 2 * valor1  
   cadena1 <- "Test"  
   escribir(cadena1 & " , valor2 = " & valor2)  
   escribir(valor1 & " # " & CST)  
Fin 

__Solución__  
Test , valor2 = 8  
4 # 49,78  

### 3. ¿Qué hace?
__¿Qué hace este algoritmo?__  

Algo QueHace  
# ¿Qué hace este algoritmo?  
Variable valor1, valor2: real  
Inicio  
1   valor1 <- enter("Introduza un valor: ")  
2   valor2 <- enter("Introduza otro valor: ")  
3   # tratamiento 
4   valor1 <- valor2  
5   valor2 <- valor1  
6   escribir("valor1 = " & valor1 & "; valor2 = " & valor2)  
Fin 

__Solución__  
1: Preguntar por teclado el valor de valor1  
2: Preguntar por teclado el valor de valor2  
3: Comentario  
4: Iguala el valor1 a valor2  
5: Iguala el valor2 a valor1 (aunque realmente no cambia su valor porque valor1 en la anterior línea la hemos sobreescrito con el valor de valor2)  
6: Muestra por pantalla los valores de valor1 y valor2.  

### 4. Velocidad media
__Escriba un algoritmo que calcule la velocidad media de desplazamiento del usuario.__  

A continuación, se muestra un ejemplo de posibles visualizaciones y entradas durante una ejecución del algoritmo (los valores introducidos por el usuario están escritos en negrita y cursiva):

Introduzca la distancia recorrida (km).

__370

Introduzca el tiempo del recorrido (min).

240

Se ha desplazado a una velocidad de 92,5 km/h.

__Solución__  
ejercicio4.java
