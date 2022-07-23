public class Main {
    public static void main(String[] args) {

        int numeroIf = -5;

        if(numeroIf > 0)
            System.out.println("El numero es positivo");
        else if (numeroIf < 0)
            System.out.println("El numero es negativo");
        else
            System.out.println("El numero es 0");

        int numeroWhile = 2;

        while (numeroWhile<3){
            System.out.println("El numero es " + numeroWhile);
            numeroWhile++;
        }

        int doWhile = 2;

        do{
            System.out.println("El numero es " + doWhile);
            doWhile++;
        }while(doWhile<3);


        for(int numeroFor = 0; numeroFor <= 3; numeroFor++)
            System.out.println("numeroFor = " + numeroFor);

        String estacion = "invierno";

        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otono":
                System.out.println("Es otono");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }
        }

        }
