# Ejercicio Montacargas
Se desarrolla la Clase Montacargas con dos atributos, el **PESO_MAXIMO** en donde se determina el peso maximo que soporta el montacargas; y el **pesoActual** que indica el peso que contiene el montacargas en ese momento.

## Actividad
El pedido es que se le puedan realizar cargas al montacargas que no superen su limite.
Para esto realizamos un metodo booleano llamado **Carga** en donde pasamos  el peso de la carga.
Se evalua ese peso con un if en donde la condición es que si la suma del peso actual y el peso de la carga no superan el peso maximo, el peso de la carga pasado por parámetro se sume al peso actual del montacargas y devolvera **true** indicando que la carga se realizó. De no ser asi el método retorna **false**.
## Test
Se crean tres test en donde verificamos en el primero que se cree el montacargas, el segundo verificamos que se realice la carga probando el método carga. Por último realizamos una prueba sobrepasando el máximo de carga permitido para corroborar que una nueva carga no se realice si se supera el **PESO_MAXIMO**

