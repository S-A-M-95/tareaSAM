package Clase2;

public class Main {
    static void main() {

        /* tipos de estructuras de control:
        if: significa (si...) la condicion es tal... has esto {} y va a compañado de un else que significa
        (sino...) has esto {}.
                ejemplo: if () {
                         imprime
                         } else {
                         imprime
                         }
        for: significa (para) y es una condicion en bucle que se repetira infinitamente hasta que le indico
        un final.
                Ejemplo: for (int contador = 0 ; int contador < 10 ; contador ++) {
                         imprime
                         }
        while: significa (mientras...) y es una condicion en bucle, mientras se que se cumpla una condicion
        mientras sea verdadera (true) y se corta cuando sea falso (false).
               ejemplo: while (condicion de verdadero) {
                        condicion de falso
                        }
                        otro ejemplo:
                        boolean prendido = true;
                             while (prendido == true){
                                    //MENU
                                    System.out.println("---------------------------------------------------------");
                                    System.out.println("Hola, este es tu menu, selecciona una opcion");
                                    System.out.println("1. Imprime Hola");
                                    System.out.println("2. Tablas de Multiplicar");
                                    System.out.println("3. Suma");
                                    System.out.println("4. Restar");
                                    System.out.println("5. Salir");
                                    System.out.println("---------------------------------------------------------");
                                    }

        Switch: significa (cambiar) es un if de muchos casos, pero no lleva else. se inicia con case y
        termina en brake.

        char caracter = '-';

        switch(caracter){
            case '+':
                //---------------------------------------------


                ACA DENTRO PUEDO HACER LO QUE YO QUIERA


                //---------------------------------------------
                break;
            case '-':
                System.out.println("Este es el caso 2");
                break;
            case '/':
                System.out.println("Este es el caso 2");
                break;
            default:
                System.out.println("No es ningun caso");
        }

         */
        /*ejercicio 1:
        Control de presupuesto en el supermercado
Imagina que tienes una lista con los precios de varios productos en tu carrito de compras y quieres
saber cuántos de ellos son productos costosos (es decir, aquellos que cuestan más de 50 dólares).

Tus datos:
Precios en el carrito: 20, 65, 15, 80, 45, 100
Para empezar este nuevo ejercicio, ¿cómo declararías e inicializarías el arreglo de enteros precios
 con esos valores y tu contador productosCostosos?

        int[] madurezFruta = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int frutasAptas = 0;

        for (int i = 0 ; i < madurezFruta. length; i++) {
            if (madurezFruta[i] >= 7 ){
                frutasAptas++;
            }
        }
        System.out.println("frutas aptas="+frutasAptas);
        */


        /* EJERCICIO 2:
        Control de presupuesto en el supermercado
        Imagina que tienes una lista con los precios de varios productos en tu carrito de compras
        y quieres saber cuántos de ellos son productos costosos (es decir, aquellos que cuestan
        más de 50 dólares).

        Tus datos:
        🏷️ Precios en el carrito: 20, 65, 15, 80, 45, 100
        Para empezar este nuevo ejercicio, ¿cómo declararías e inicializarías el arreglo de enteros precios con esos valores y tu contador productosCostosos?
         */
        /*
        int[] precioProductos = {10, 20, 30, 55, 50, 65, 100, 105, 85, 32, 90};
        int productosCostosos = 0;

        for (int i = 0 ; i < precioProductos.length ; i++){
            if (precioProductos[i] >= 50){
                productosCostosos++;
            }
        }
        System.out.println("tienes "+productosCostosos+" productos costosos");
        */

        /*EJERCICIO WHILE
        Carga inteligente de batería (while e if)
        A diferencia del for, usamos while cuando no sabemos exactamente cuántas veces se repetirá
        un ciclo, sino que dependemos de que una condición se siga cumpliendo.

        El escenario:
        Un teléfono se está cargando. Empezará con un nivel de batería del 80% y se cargará en
        incrementos de 5% en cada ciclo hasta llegar al 100%.

        Reglas:

        🔁 while: Se ejecuta mientras la batería sea menor que 100.

        ➕ En cada vuelta sumamos 5 al nivel de la batería (bateria = bateria + 5 o bateria += 5).

        🚦 if: Si la batería llega exactamente al 90%, imprimimos una alerta: "⚡ Cambiando a carga
         lenta para cuidar la batería".

        Para iniciar este programa, necesitamos la variable inicial: int bateria = 80;.

        ¿Cómo escribirías la estructura básica del bucle while (...) para que se repita mientras la
        batería no haya llegado al 100%?

            while (condicion de verdadero) {
                        condicion de falso
                        }
                        otro ejemplo:
                        boolean prendido = true;
                             while (prendido == true){
                                    //MENU
                                    System.out.println("---------------------------------------------------------");
                                    System.out.println("Hola, este es tu menu, selecciona una opcion");
                                    System.out.println("1. Imprime Hola");
                                    System.out.println("2. Tablas de Multiplicar");
                                    System.out.println("3. Suma");
                                    System.out.println("4. Restar");
                                    System.out.println("5. Salir");
                                    System.out.println("---------------------------------------------------------");
                                    }

        */
        /*
        int bateria = 75;
        boolean bateriaCargando = true ;

        if (bateriaCargando == true) {
            while (bateria < 100) {
                bateria += 5;
                System.out.println("cargando... bateria al " + bateria + "%.");
                if (bateria == 90) {
                    System.out.println("Cambiando a carga lenta para cuidar la batería.");
                }
            }
            System.out.println("bateria cargada al 100%, desconecte el cargador.");
        } else {
            System.out.println("bateria descargandose, conecte el cargador.");
        }
        */
        /* EJERCICIO 2 DE WHILE E IF:

        🏃 El contador de pasos de un reloj deportivo
        Tu meta final es alcanzar los 10.000 pasos.

        El contador arranca en 0 pasos.

        En cada ciclo o intervalo, el reloj registra un avance de 2.500 pasos.

        Si en algún momento llegas exactamente a la mitad (5.000 pasos), el reloj debe mostrar una
        alerta de motivación: "¡Vas por la mitad, no te detengas!".

        Para empezar a armar la lógica en tu mente antes de escribir el código completo:

        ¿Qué variables (contenedores) crees que vas a necesitar y con qué valor inicializarías cada una?

        ¿Cuál sería la condición dentro del while (...) para saber cuando detener la caminata?
         */
        /*
        int pasos = 0 ;
        boolean caminando = true ;

        if (caminando == true) {
            System.out.println("Exelente, vamos a ejercitarnos. nuestra meta son 10000 pasos");
            while (pasos < 10000) {
                pasos += 2500 ;
                System.out.println("Llevas: " + pasos + " pasos.");
                if (pasos == 5000){
                    System.out.println("¡Vas por la mitad, no te detengas!");
                } else {
                    if (pasos == 10000) {
                        System.out.println("Felicidades alcanzaste tu meta diaria.");
                    }
                }


            }
        } else {
            System.out.println("Recordatorio, necesitas cumplir tu meta diarai de 10000 pasos. comenzamos?");
        }
        */
        /*
        EJERCICIO 1 DE SWITCH:

        Sistema de cobro en un restaurante (switch e if)Usamos switch cuando queremos evaluar el valor
        de una variable contra una lista de opciones fijas y conocidas (como un menú o un listado de
        días de la semana), en lugar de evaluar rangos como "mayor que" o "menor que".
        El escenario:Un cliente selecciona una opción del menú indicando un número
        (opcionMenu):
        1 hamburguesa ($10).
        2 Pizza ($12).
        3 Ensalada ($8).
        Cualquier otro número. Muestra un mensaje de error.
        La regla especial del descuento:Si la persona elige la Hamburguesa (Opción 1) y además tiene
        un cupón (boolean tieneCupon = true), el precio de la hamburguesa debe reducirse en $2.
        Para dar el primer paso sin preocuparnos aún por la parte del descuento: ¿cómo estructurarías
        las partes clave del switch (opcionMenu) con sus bloques case para las opciones 1, 2, 3 y el
        caso por defecto default?
         */






        /*



    }
}
