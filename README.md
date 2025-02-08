# Descripción del problema

Emily, la empresaria, tiene una idea de negocio genial: empaquetar y vender copos de nieve. Ha ideado una máquina que captura los copos de nieve a medida que caen y los serializa en una corriente de copos de nieve que fluyen, uno por uno, dentro de un paquete. Una vez que el paquete está lleno, se cierra y se envía para su venta.

El lema de marketing de la empresa es “bolsas de singularidad”. Para estar a la altura del lema, cada copo de nieve en un paquete debe ser diferente de los demás. Desafortunadamente, esto es más fácil de decir que de hacer, porque en realidad, muchos de los copos de nieve que fluyen a través de la máquina son idénticos. A Emily le gustaría saber el tamaño del paquete más grande posible de copos de nieve únicos que se puede crear. La máquina puede comenzar a llenar el paquete en cualquier momento, pero una vez que comienza, todos los copos de nieve que fluyen desde la máquina deben entrar en el paquete hasta que este esté completo y sellado. El paquete puede completarse y sellarse antes de que todos los copos de nieve hayan salido de la máquina.

### Entrada

- La primera línea de entrada contiene un entero que especifica la cantidad de casos de prueba a seguir.
- Cada caso de prueba comienza con una línea que contiene un entero n, la cantidad de copos de nieve procesados ​​por la máquina.
- Las siguientes n líneas contienen cada una un entero (en el rango de 0 a 109, inclusive) que identifica de manera única un copo de nieve. Dos copos de nieve se identifican con el mismo entero si y solo si son idénticos.
- La entrada no contendrá más de un millón de copos de nieve en total.

### Salida

- Para cada salida de caso de prueba, una línea que contiene un solo entero, la cantidad máxima de copos de nieve únicos que puede haber en un paquete.

### Entrada de muestra

1
5
1
2
3
2
1

### Salida de muestra

3
