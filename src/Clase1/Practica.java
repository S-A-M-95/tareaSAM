package Clase1;

public class Practica {
    static void main() {
        //////////////////////////////////////////////////////
        //Samuel tiene 56 casas, si tiene mas de 50 imprimir tiene mas de 50
        //y si ademas de tener mas de 50 casas tiene mas de 70 imprimir "+70"

        int casasSamuel = 76;

        if(casasSamuel > 50){
            System.out.println("Tiene mas de 50 casas");
            if (casasSamuel > 70) {
                System.out.println("Tiene mas de 70");
            }else{
                System.out.println("Pero no tiene mas de 70");
            }
        }else{
            System.out.println("Tiene menos de 50");
        }
        //////////////////////////////////////////////////////
    }
}
