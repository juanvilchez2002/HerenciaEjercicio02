
package service;

import entidades.Electrodomestico;
import entidades.Lavadora;
import java.util.Scanner;


public class LavadoraService extends ElectrodomesticoService{
    
    Scanner consola = new Scanner(System.in);
    
    public Lavadora crearLavadora(){
        ElectrodomesticoService es = new ElectrodomesticoService();
        Electrodomestico e = es.crearElectrodomestico();
        //es.precioFinal(e);
        
        Lavadora l = new Lavadora();
        l.setColor(e.getColor());
        l.setConsumoEnergetico(e.getConsumoEnergetico());
        l.setPrecio(e.getPrecio());
        l.setPeso(e.getPeso());
        
        System.out.print("Carga: ");
        l.setCarga(consola.nextInt());
        
        if(l.getCarga()>30){
            l.setPrecio(l.getPrecio()+500);
        }       
        System.out.println(l.getPrecio());
        return l;
    }
}
