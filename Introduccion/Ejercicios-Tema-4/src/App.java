public class App {
    public static void main(String[] args) throws Exception {

        //If else
        int numeroIf = 5;

        if(numeroIf > 0) {
            System.out.println("El numero "+numeroIf+" es positivo.");
        }
        else if(numeroIf < 0) {
            System.out.println("El numero "+numeroIf+" es negativo.");
        }
        else{
            System.out.println("El numero es igual a cero.");
        }

        //While
        int numeroWhile = 0;

        while (numeroWhile < 3){

            System.out.println("Numero While = "+numeroWhile);
            numeroWhile++;

        }

        //Do while
        int numeroDoWhile = 2;

        do{

            System.out.println("Numero Do While = "+numeroDoWhile);
            numeroDoWhile++;

        }while(numeroDoWhile<3);

        //For
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){

            System.out.println("Numero For = "+numeroFor);

        }

        //Switch

        String estacion = "PRIMAVERA";

        switch(estacion){
            case "OTOÑO":
                System.out.println("La estacion es Otoño");
                break;
            case "INVIERNO":
                System.out.println("La estacion es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("La estacion es Primavera");
                break;
            case "VERANO":
                System.out.println("La estacion es Verano");
                break;
            default:
                System.out.println("La variable no corresponde a una estacion");

        }
    }
}
