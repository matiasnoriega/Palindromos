# Palindromos
Ejercicio de Palindromos de la Olimpiada Informatica Argentina


CERTAMEN NACIONAL - 1998
Nivel I
Problema 1
: Palindromo
Una hilera de letras, o palabra, se llama palindromo cuando tiene más de
una letra y leída de izquierda a derecha y de derecha a izquierda son
iguales, por ejemplo, ababa.
Una hilera se llama i-palindromo cuando quitando el primer carácter de la
izquierda se convierte en palindromo, por ejemplo casa.
Una hilera se llama d-palindromo cuando quitando el primer carácter de la
derecha se convierte en palindromo, por ejemplo amad.
Llamaremos palabras distinguidas a aquellas que son palindromo, i-
palindromo o d-palindromo.
El problema consiste en recibir una palabra y determinar los cortes, si los
hubiera, que la descomponen en dos palabras distinguidas, e indicar para
cada una de ellas de que tipo o tipos es.
La palabra a cortar viene en un archivo PALIN.IN, y la salida debe estar
en el archivo PALIN.OUT, ocupando dos lineas por cada corte posible.
En cada linea irá, separado por espacios, una palabra distinguida y los
tipos a los que pertenece. Si no hay ninguna descomposición posible se
colocará 
no se puede
.
Ejemplo 1:
Si el archivo PALIN.IN contiene:
azarosos
El archivo PALIN.OUT podría contener:
azar d-palindromo
osos i-palindromo d-palindromo
Ejemplo 2:
Si el archivo PALIN.IN contiene:
amarrar
El archivo PALIN.OUT podría contener:
ama palindromo
rrar i-palindromo
amar d-palindromo
rar palindromo
Este ejercicio tendrá un puntaje máximo de 40 puntos.
