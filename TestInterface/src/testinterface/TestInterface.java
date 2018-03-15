
package testinterface;

public class TestInterface {

   
    public static void main(String[] args) {
        Avion avion = new Avion();
        Helicoptero heli = new Helicoptero();
        avion.setVelMax(1200);
        heli.setVelMax(500);
        System.out.println(avion.compareTo(heli));
        System.out.println(heli.compareTo(avion));
        //Fran GAAAYYYjajaaj
        // hdp jaja
    }
    
}
