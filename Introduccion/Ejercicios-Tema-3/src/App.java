public class App {
    public static void main(String[] args) throws Exception {

        //Primera Parte

        int resultado = suma(10,20,30);
        System.out.println("El resultado de la suma es: " + resultado);

        //Segunda Parte
        
        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        System.out.println("El numero de puertas es: " +miCoche.numPuertas);
    }

    //Primera Parte

    public static int suma(int numA, int numB, int numC) {

        return numA + numB + numC;

    }
}

//Segunda Parte

class Coche{
        
    public int numPuertas=3;

    public void AumentarPuertas(){

        this.numPuertas++; 

    }

}