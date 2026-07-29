package Clase1;

public class Practica2 {
    static void main() {


        //tengo una cuenta de banco con 12001Bs
        //mi mama me presta 500
        //comprobar si mi cuenta de banco tiene la cantidad exacta de 12500 (si es as[i imprimir "ganador")
        //sino imprimir "no loco"

        //si es distinto que 12500 y le sumo el 30% del monto total, es mas que 16750???

        int cuentaBanco = 12001;
        int prestamoMama = 500;

        int total = cuentaBanco+prestamoMama;

        if (total == 12500){
            System.out.println("ganador");
        }else {
            System.out.println("no loco");
            if (((total * 0.30) + total) >= 16750){
                System.out.println("es mayor o igual a 16750");
            }else{
                System.out.println("no es mayor");
            }
        }

        boolean joeGanaConUnMovimiento = true;
        boolean eresUnFalso = false;

        if(joeGanaConUnMovimiento == true){
            eresUnFalso = true;
        }else{
            eresUnFalso = false;
        }

    }
}
