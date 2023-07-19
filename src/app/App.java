
package app;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import service.ElectrodomesticoService;
import service.LavadoraService;
import service.TelevisorServices;


public class App {


    public static void main(String[] args) {
        
//        ElectrodomesticoService es = new ElectrodomesticoService();
//        Electrodomestico e = es.crearElectrodomestico();
        LavadoraService ls = new LavadoraService();
        Lavadora e = ls.crearLavadora();
        System.out.println(e.toString().toString());
        
        TelevisorServices ts = new TelevisorServices();
        ts.crearTelevisor();
        ts.precioFinal();
        
        System.out.println(ts.toString());
        
    }
    
}
