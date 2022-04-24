

# Practicas en Java
El siguiente repositorio contiene ejercicios de Java correspondientes a la cátedra de Programación Básica II, correspondiente a la Tecnicatura en Desarrollo Web de la Universidad Nacional de La Matanza.

## Ejercicio FutSal

### Descripción
Las tareas que se piden que realice el programa son las siguientes
1. **Agregar**  los jugadores a los equipos (los equipos no es necesario dar de alta
porque se conforman previo al inicio de la competencia, es decir contaremos de
antemano con esa información).
2. **Calcular** el valor del equipo, esto es la sumatoria del precio de cada jugador.
3. **Calcular** la edad promedio del equipo.
4. **Registrar** un nuevo partido. En él se debe poder incorporar al local y al visitante.
5. Una vez creado el partido, se nos solicita poder **registrar** los siguientes eventos:
+ **Gol**, se interesa conocer el *autor* y el *minuto* en el que ocurrió
+ **Amonestados**, se desea conocer el *jugador* amonestado y en qué *minuto*
(cuando un jugador ==es amonestado== en dos oportunidades
automáticamente debe ser **expulsado**, y se espera que el sistema informes
esta situación).
+ **Expulsados**, ya sea por doble amonestación o por expulsión directa, se
debe conocer los jugadores que son expulsados del partido.
Ver el resumen. En este resumen se espera conocer el resultado del partido, y el
detalle de los autores de los goles, amonestados y expulsados

### Desarrollo
Se crearon dos clases para el desarrollo del programa

JUGADOR| Variable
-------- | -----
- DNI| int
- NOMBRE| String
- APELLIDO| String
- numero| int
- edad| int
- valorJugador| double
- local| boolean
- puesto| Puesto

Se utiliza un constructor para cargar todos los datos del jugador con los parámetros de todos los atributos del objeto

Los valores DNI, NOMBRE Y APELLIDO se establecen como constantes.
El Puesto se establece con un enun donde los valores son ARQUERO, DEFENSOR, MEDIOCAMPISTA, DELANTERO.

PARTIDO| Variable
-------- | -----
- numeroPartido| int
- equipoLocal| ArrayList Jugador
- equipoVisitante| ArrayList Jugador
- goles| ArrayList Eventos


Se utilizo un ArrayList en lugar de un array común para la manipulación de los datos y facilitar los métodos. Los mismos se inicializan en el constructor.

```
public Partido(int numeroPartido) {
	
		this.numeroPartido = numeroPartido;
		this.equipoLocal = new ArrayList<Jugador>();
		this.equipoVisitante = new ArrayList<Jugador>();
		this.eventosDelPartido = new ArrayList<Eventos>();
		
		
	}
```

### Desarrollo
1. Para **Agregar un Jugador** se creo la función **agregarJugador**. El jugador a incluir se pasa por parámetro en la función.Se utiliza un condicional para analizar el atributo del Jugador *local*, al ser verdadero se agrega al array de **equipoLocal**, si es falso se agrega al **equipoVisitante**
2. Para **calcular el valor del equipo** se utiliza la función **valorDelEquipoLocal** y **valorDelEquipoVisitante** para contar a cada array de equipos. Iteramos el array con un for, en donde con el método *.size()* establecemos la cantidad de iteraciones ( lo que en los arrays comunes lo haciamos con .length). Creamos un contador con la variable *valorEquipo* en donde sumamos el atributo del jugador (valorJugador) en cada iteración. Para obtener el atributo usamos **.get** pasando como parámetro el numero de iteración y *getValorJugador* para obtener el valor del atributo del objeto. Nos queda la funcion dentro del for de esta forma `valorEquipo +=equipoVisitante.get(i).getValorJugador();`. Terminamos la función retornando el **valorEquipo**
3. Para el Promedio el proceso es similar como el cálculo de *valorEquipo*, se crea un contador de edad que va acumulando las edades en las iteraciones y luego generamos un retorno en donde dividimos la suma con la cantidad de elementos del array que lo obtenemos con *.size()*
4. Para los eventos se crea una Clase llamada Eventos con un enun para determinar los eventos en GOL, AMONESTACION y EXPULSION. Para registrar los goles realizamos una validación con un condicional para asegurar que el jugador se encuentre en el partido, luego creamos un nuevo evento con el jugador y el minuto para luego realizar un add al arrayList de eventosDelPartido. Para las amonestaciones validamos primero revisando que tenga elementos el array, luego buscamos en el mismo si el jugador ya habia cometido una amonestación. De ser asi llamamos al metodo expulsarJugador, sino creamos un evento amonestacion con el jugador y los minutos. El metodo expulsarJugador se crea con el jugador y los minutos para crear un nuevo evento
