package Clase1;

public class Practica3 {
    static void main() {
        /*
        ================================================================================================
                                         TALLER DE PROGRAMACIÓN I - JAVA
                             Ejercicios de Estructuras Condicionales y Tipos de Datos
        ================================================================================================

        INSTRUCCIONES:
        - Resuelve cada ejercicio declarando las variables de entrada indicadas al inicio de cada uno.
        - Utiliza únicamente: 'if', 'else', variables 'int', 'double' (para porcentajes/precios),
          'String', 'boolean' y operadores lógicos (&&, ||, !).
        - No utilices bucles (for, while) ni arreglos (arrays).
        - Escribe tu código de resolución justo debajo del comentario de cada ejercicio.

        ================================================================================================
        */



        /*
        EJERCICIO 1: SISTEMA DE BECAS UNIVERSITARIAS
        Declara las sigui\entes variables:
        - int edad (ej. 21)
        - int promedio (de 0 a 100, ej. 88)
        - String carrera (ej. "Sistemas", "Medicina" o "Derecho")
        - boolean tieneSanciones (ej. false)

        REGLAS:
        - Si el estudiante tiene sanciones, queda automáticamente descartado (beca = 0%).

        - Si no tiene sanciones, evalúa según la carrera:
          * Para "Sistemas": Si el promedio es >= 90 y tiene menos de 25 años, obtiene el 80% de beca,
          (si no tiene el promedio minimo de 50% tiene 0%).
          Si el promedio es entre 85 y 89, obtiene el 50%. De lo contrario, 15%.
          (si no tiene promedio, no tiene beca.)

          * Para "Medicina": Requiere promedio >= 95 sin importar la edad para obtener el 90% de beca.
          Si el promedio está entre 90 y 94, obtiene el 60%. Otros casos, 10%.

          * Para "Derecho" u otras carreras: Si el promedio es >= 90 y tiene entre 18 y 30 años, obtiene 40%.
          Si no cumple la edad pero tiene el promedio, obtiene 20%. (sino cumple 0% beca)
        Muestra en consola un mensaje con el porcentaje de beca obtenido.
        */

        // --- Escribe tu código para el Ejercicio 1 aquí ---

    /*    int edad1 = 24;
        int edad2 = 18;
        int edad3 = 20;
        int promedio1 = 88;
        int promedio2 = 50;
        int promedio3 = 100;
        String carrera1 = "Sistema";
        String carrera2 = "Medicina";
        String carrera3 = "Derecho";
        boolean tieneSanciones1 = false;

        if (tieneSanciones1) {
            System.out.println("Estudiante descartado, no tiene beca por sancion");
        } else {
            if (carrera1 == "Sistema") {
                if (promedio1 >= 90 && edad1 < 25) {
                    System.out.println("Estudiante 1 tiene el 80% de beca");
                } else {
                    if (promedio1 >= 85 && promedio1 <= 89) {
                        System.out.println("Estudiante 1 obtiene el 50% de la beca");
                    } else {
                        if (promedio1 >= 50 && promedio1 <= 84) {
                            System.out.println("Estudiante 1 obtiene 15% de la beca");
                        } else {
                            System.out.println("Estudiante 1 no tiene beca, tiene sancion");
                        }
                    }
                }
            }
            if (carrera2 == "Medicina") {
                if (promedio2 >= 95) {
                    System.out.println("Estudiante 2 obtiene 90% de la beca");
                } else {
                    if (promedio2 >= 90 && promedio2 <= 94) {
                        System.out.println("Estudiante 2 obtiene el 60% de la beca");
                    } else {
                        if (promedio2 >= 50 && promedio2 <= 89) {
                            System.out.println("Estudiante 2 obtiene el 10%");
                        } else {
                            System.out.println("Estudiante 2 no tiene beca, tiene sancion");
                        }
                    }
                }
            }
            if (carrera3 == "Derecho") {
                if (promedio3 >= 90 && edad3 >= 18 && edad3 <= 30) {
                    System.out.println("Estudiante 3 tiene 40% de la beca");
                } else {
                    if (promedio3 >= 90) {
                        System.out.println("Estudiante 3 tiene el 20% de la beca");
                    } else {
                        System.out.println("Estudiante 3 no tiene beca, tiene sancion");
                    }
                }
            }
        }
*/
        /*
        EJERCICIO 2: SIMULADOR DE CRÉDITO HIPOTECARIO
        Declara las siguientes variables:
        - int salarioMensual (ej. 2500)
        - int edad (ej. 35)
        - boolean historialCrediticioSano (ej. true)
        - String tipoVivienda (ej. "Nueva" o "Usada")

        REGLAS:
        - Si el historial crediticio NO es sano, el crédito es rechazado de inmediato.
        - Si el historial es sano, evalúa el salario y la edad:
        * Si el salario es mayor a 4000:
            - Si tiene entre 18 y 40 años: Crédito aprobado con tasa de interés del 8% anual si la vivienda es "Nueva",
               y del 10% si es "Usada".
            - Si tiene más de 40 años: Tasa de interés del 11% anual sin importar el tipo de vivienda.
        * Si el salario está entre 1500 y 4000:
            - Requiere obligatoriamente tener entre 25 y 50 años. Si cumple, la tasa es del 14% para "Nueva"
              y 16% para "Usada". Si no cumple la edad, el crédito es rechazado.
        * Si el salario es menor a 1500: Crédito rechazado por ingresos insuficientes.
        Imprime si el crédito fue aprobado/rechazado y la tasa de interés final.
        */

        // --- Escribe tu código para el Ejercicio 2 aquí ---

        int salarioMensual = 4000;
        int edad = 20;
        boolean historialCrediticioSano = true;
        String tipoDeVivienda = "Nueva";

        if (historialCrediticioSano == false) {
            System.out.println("Hitorial crediticio malo, credito denegado");
        } else {
            if (salarioMensual <= 1500 && edad <= 17) {
                System.out.println("Crédito rechazado por ingresos y edad insuficientes.");
            } else {
                if (tipoDeVivienda == "Nueva") {
                    if (salarioMensual >= 4000 && edad >= 18 && edad <= 40) {
                        System.out.println("Crédito aprobado vivienda nueva con tasa de interés del 8% anual");
                    } else {
                        if (salarioMensual >= 1500 && salarioMensual <= 4000)
                            if (edad >= 25 && edad <= 50) {
                                System.out.println("Crédito aprobado vivienda nueva con tasa de interés del 14% anual");
                            } else {
                                System.out.println("Crédito rechazado edad insuficientes");
                            }
                        else {
                            if (salarioMensual >= 4000 && edad >= 18) {
                                System.out.println("Credito aprobado de casa de interés del 11% anual");
                            } else {
                                System.out.println("Credito denegado, sueldo insuficiente");
                            }
                        }
                    }
                } else {
                    if (tipoDeVivienda == "Usada") {
                        if (salarioMensual >= 4000 && edad >= 18 && edad <= 40) {
                            System.out.println("Crédito aprobado vivienda usada con tasa de interés del 10% anual");
                        } else {
                            if (salarioMensual >= 1500 && salarioMensual <= 4000) {
                                if (edad >= 25 && edad <= 50) {
                                    System.out.println("Crédito aprobado vivienda usada con tasa de interés del 16% anual");
                                } else {
                                    System.out.println("Crédito rechazado edad insuficientes");
                                }
                            } else {
                                System.out.println("Credito denegado, sueldo insuficiente");
                            }
                        }
                    }
                }
            }
        }


        //
        /*
        EJERCICIO 3: FILTRO DE ADMISIÓN ESPORTS (GAMING)
        Declara las siguientes variables:
        - int edad (ej. 17)
        - String rangoJuego (ej. "Bronce", "Plata", "Oro", "Platino", "Diamante")
        - int horasSemanales (ej. 25)
        - boolean tienePenalizaciones (ej. false)

        REGLAS:
        - Para ser admitido en el equipo profesional, el jugador no debe tener penalizaciones.
        - Si no tiene penalizaciones, se aplican los siguientes filtros anidados:
          * Si es menor de edad (menos de 18 años): Solo puede ingresar si su rango es "Diamante" y juega más de
          30 horas semanales. Si cumple, su bono de entrada es del 50%.
          * Si tiene entre 18 y 25 años:
            - Si su rango es "Diamante" o "Platino", es aceptado con un bono del 100% si juega más de 20 horas,
              o 75% si juega menos de eso.
            - Si su rango es "Oro", es aceptado pero sin bono (0%).
            - Rangos "Plata" o "Bronce" son rechazados.
          * Si tiene más de 25 años: Solo se acepta si es "Diamante" y juega más de 40 horas semanales
           (bono del 30%).
        Imprime si fue aceptado y el porcentaje de su bono.
        */

        // --- Escribe tu código para el Ejercicio 3 aquí ---


        /*
        EJERCICIO 4: LIQUIDADOR DE ENVÍOS INTERNACIONALES
        Declara las siguientes variables:
        - int pesoPaqueteKg (ej. 12)
        - String destino (ej. "America", "Europa", "Asia")
        - boolean envioExpress (ej. true)
        - int valorDeclaradoArticulo (ej. 500)

        REGLAS:
        - El costo base de envío se calcula por peso:
          * Hasta 5 kg: 20 USD.
          * De 6 a 15 kg: 50 USD.
          * Más de 15 kg: 100 USD.
        - Surcharges (Recargos por destino en porcentaje sobre el costo base):
          * "America": +10% sobre el base. Si es Express, se suma un 5% adicional.
          * "Europa": +20% sobre el base. Si es Express, se suma un 10% adicional.
          * "Asia": +30% sobre el base. Si es Express, se suma un 15% adicional.
        - Impuesto de Aduana:
          * Si el valorDeclaradoArticulo supera los 400 USD, se aplica un impuesto aduanero del 15% calculado sobre el total acumulado (costo base + recargos).
        Imprime detalladamente el costo base, los recargos por destino/express, el impuesto y el total final a pagar.
        */

        // --- Escribe tu código para el Ejercicio 4 aquí ---


        /*
        EJERCICIO 5: EVALUADOR DE SEGURIDAD DE CONTRASEÑAS (SIMULADO)
        Declara las siguientes variables:
        - String password (ej. "Admin123*")
        - int longitudPassword (ej. 9)
        - boolean tieneMayuscula (ej. true)
        - boolean tieneNumero (ej. true)
        - boolean tieneCaracterEspecial (ej. true)

        REGLAS:
        - Si la longitudPassword es menor a 8 caracteres, la seguridad es "Inaceptable" (sin importar el resto de variables).
        - Si la longitud es >= 8:
          * Si tieneMayuscula, tieneNumero y tieneCaracterEspecial, el nivel es "Excelente".
          * Si le falta solo UNO de esos tres requisitos (pero tiene los otros dos):
            - Si el requisito faltante es el caracter especial, el nivel es "Medio-Alto".
            - Si el requisito faltante es la mayúscula o el número, el nivel es "Medio-Bajo".
          * Si le faltan dos o más requisitos, el nivel es "Inseguro".
        Imprime el diagnóstico final de la contraseña.
        */

        // --- Escribe tu código para el Ejercicio 5 aquí ---


        /*
        EJERCICIO 6: TARIFADOR DE PARQUEADERO INTELIGENTE
        Declara las siguientes variables:
        - int horasEstacionado (ej. 5)
        - String tipoVehiculo (ej. "Automovil", "Motocicleta", "Camioneta")
        - boolean esDiaFestivo (ej. false)
        - boolean tieneTarjetaClub (ej. true)

        REGLAS:
        - Tarifa base por hora según tipo de vehículo:
          * "Motocicleta": 2 USD por hora.
          * "Automovil": 4 USD por hora.
          * "Camioneta": 7 USD por hora.
        - Multiplica la tarifa base por las horasEstacionado para obtener el subtotal.
        - Ajustes por condiciones:
          * Si es dia festivo, se aplica un recargo del 25% sobre el subtotal.
          * Si NO es festivo y el vehículo estuvo estacionado más de 6 horas, se aplica un descuento del 10% por permanencia larga.
          * Finalmente, si el cliente tiene tarjeta club, se aplica un descuento del 15% sobre el total acumulado hasta ese momento.
        Imprime el desglose de los cálculos y el valor final a cobrar.
        */

        // --- Escribe tu código para el Ejercicio 6 aquí ---


        /*
        EJERCICIO 7: CONTROL DE ACCESO A ATRACCIÓN EXTREMA
        Declara las siguientes variables:
        - int estaturaCm (ej. 155)
        - int edad (ej. 14)
        - boolean tieneProblemaCardiaco (ej. false)
        - String tipoPase (ej. "Estandar", "VIP", "SuperVIP")

        REGLAS:
        - Si tiene problemas cardíacos, el acceso está totalmente prohibido ("Acceso Denegado por Salud").
        - Si su salud es óptima, evalúa estatura y edad:
          * Si la estatura es menor a 140 cm o la edad es menor a 12 años: "Acceso Denegado por Seguridad (Muy pequeño/joven)".
          * Si cumple con la estatura (>=140) y la edad (>=12):
            - Si tiene pase "SuperVIP": Tiene acceso inmediato y derecho a usar la "Fila Ultra Rápida" (prioridad 100%).
            - Si tiene pase "VIP":
              * Si su edad es mayor a 18 años, accede a la "Fila Rápida" (prioridad 50%).
              * Si es menor de edad, accede pero debe ir acompañado por un adulto (prioridad 25%).
            - Si tiene pase "Estandar": Tiene acceso pero debe hacer la fila normal (prioridad 0%).
        Imprime el estado de acceso del usuario y su nivel de prioridad en fila.
        */

        // --- Escribe tu código para el Ejercicio 7 aquí ---


        /*
        EJERCICIO 8: CALCULADORA DE IMPUESTOS TECNOLÓGICOS (ADUANA)
        Declara las siguientes variables:
        - int precioDolares (ej. 850)
        - String categoria (ej. "Laptop", "Celular", "Accesorio")
        - boolean esParaEducacion (ej. false)
        - int cantidadProductos (ej. 4)

        REGLAS:
        - Calcula el valor total de la compra (precioDolares * cantidadProductos).
        - Determina el impuesto base según la categoría:
          * "Laptop": Impuesto del 10%.
          * "Celular": Impuesto del 15%.
          * "Accesorio": Impuesto del 20%.
        - Descuentos y penalizaciones en cascada (nested):
          * Si es para educación y la categoría es "Laptop", el impuesto se reduce a la mitad (ej. de 10% a 5%). Si es celular, se reduce un 30% (ej. si era 15%, baja a 10.5%). Para accesorios no hay descuento de educación.
          * Si la cantidad de productos comprados es mayor a 3:
            - Se añade un arancel de importación por volumen del 5% adicional sobre el impuesto final calculado.
        Imprime el valor total de la compra antes de impuestos, el porcentaje de impuesto aplicado y el total final facturado.
        */

        // --- Escribe tu código para el Ejercicio 8 aquí ---


        /*
        EJERCICIO 9: CONTROL DE ACCESO A EVENTO EXCLUSIVO (DISCOTECA/CLUB)
        Declara las siguientes variables:
        - int edad (ej. 20)
        - String vestimenta (ej. "Formal", "Casual", "Deportiva")
        - boolean tieneInvitacionEspecial (ej. true)
        - int horaLlegada (formato 24h, ej. 23 para las 11:00 PM)

        REGLAS:
        - Si la vestimenta es "Deportiva", el acceso está denegado inmediatamente (código de vestimenta estricto).
        - Si la vestimenta es aceptable ("Formal" o "Casual"):
          * Si es menor de 18 años: Solo puede pasar si tiene una invitación especial Y la hora de llegada es antes de las 21 (9:00 PM). De lo contrario, acceso denegado.
          * Si es mayor de edad (>= 18 años):
            - Si viste "Formal": Pasa gratis si llega antes de las 24 (medianoche). Si llega después, paga el 50% de la entrada.
            - Si viste "Casual":
              * Si tiene invitación especial, pasa gratis a cualquier hora.
              * Si no tiene invitación, paga tarifa completa (100%) si llega antes de las 23; si llega más tarde de las 23, paga tarifa completa más un recargo del 20% por hora pico.
        Imprime el resultado del acceso y la condición de pago del cliente.
        */

        // --- Escribe tu código para el Ejercicio 9 aquí ---


        /*
        EJERCICIO 10: CLASIFICADOR DE CLIENTES Y CASHBACK (RECOMPENSAS)
        Declara las siguientes variables:
        - int montoConsumoMes (ej. 600)
        - String nivelCliente (ej. "Regular", "Plata", "Oro")
        - boolean suscritoNewsletter (ej. true)
        - int antiguedadMeses (ej. 14)

        REGLAS:
        - El porcentaje base de Cashback (dinero devuelto) se calcula por nivel de cliente:
          * "Regular": 1% de cashback.
          * "Plata": 3% de cashback.
          * "Oro": 5% de cashback.
        - Modificadores anidados:
          * Si el cliente tiene una antiguedad de más de 12 meses (1 año):
            - Si es "Oro", su cashback sube un 2% adicional (total 7%).
            - Si es "Plata" o "Regular", su cashback sube un 1% adicional.
          * Si el cliente NO está suscrito al Newsletter, se le penaliza restándole un 0.5% de su cashback total acumulado.
          * Si el montoConsumoMes supera los 1000 USD, se le regala un bono extra del 1% de cashback directo sobre el total final.
        Imprime el porcentaje final de cashback obtenido y la cantidad de dinero exacta que se le devolverá al cliente según su consumo.
        */

        // --- Escribe tu código para el Ejercicio 10 aquí ---


    }
}
