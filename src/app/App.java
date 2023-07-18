
package app;

import entidades.Electrodomestico;
import entidades.Lavadora;
import service.ElectrodomesticoService;
import service.LavadoraService;


public class App {


    public static void main(String[] args) {
        
//        ElectrodomesticoService es = new ElectrodomesticoService();
//        Electrodomestico e = es.crearElectrodomestico();
        LavadoraService ls = new LavadoraService();
        Lavadora e = ls.crearLavadora();
        System.out.println(e.toString().toString());
    }
    
}
