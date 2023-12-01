# Langton Ant

## Introducción:
Las hormigas tienen habilidades increíbles: pueden levantar 5.000 veces su peso y recurrir de forma natural a la 
heurística para resolver sus problemas. Esta kata rinde un pequeño homenaje a nuestras pequeñas compañeras en la 
observación de su comportamiento emergente.

La idea es construir una aplicación que tenga una hormiga corriendo dentro de una cuadrícula, a la cual le daremos 
ciertas instrucciones para observar su comportamiento. Esto también es conocido como ''La Hormiga de Langton''.

Teniendo en cuenta las reglas:

- En un cuadrado blanco, gira 90° en sentido horario (R), cambia el color del cuadrado y avanza una unidad.
- En un cuadrado negro, gira 90° en sentido antihorario (L), cambia el color del cuadrado y avanza una unidad.

## Reglas
- La secuencia anterior debe tener al menos 2 caracteres (e.g 'RL'), que se ejecutarán en bucle durante el número de pasos definido.
- Al inicio, todas las casillas serán de color blanco.
- La cuadrícula debe tener un tamaño impar para que la hormiga pueda estar en el centro.
- La cuadrícula debe mostrarse después de cada paso para que podamos observarla.
- Debemos ser capaces de detener el código después de 'x' iteraciones.
