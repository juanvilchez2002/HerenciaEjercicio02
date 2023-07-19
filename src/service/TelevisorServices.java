
package service;

import entidades.Electrodomestico;
import entidades.Televisor;
import java.util.Scanner;


public class TelevisorServices extends ElectrodomesticoService{
    
    Scanner consola = new Scanner(System.in);
    ElectrodomesticoService es = new ElectrodomesticoService();
    Electrodomestico e = es.crearElectrodomestico();
    Televisor t = new Televisor();
    
    public void crearTelevisor(){
        t.setColor(e.getColor());
        t.setConsumoEnergetico(e.getConsumoEnergetico());
        t.setPeso(e.getPeso());
        t.setPrecio(e.getPrecio());
        
        System.out.print("TDT (Si o No");
        String tdt = consola.nextLine();
        
        if(tdt.equalsIgnoreCase("SI")){
            t.setTdt(true);
        }else{        
            t.setTdt(false);
        }
        
        System.out.print("Resolusion: ");
        t.setResolusion(consola.nextInt());   
        
    }

    public void precioFinal() {
        super.precioFinal(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        if(t.getResolusion()>40){
            t.setPrecio((int)(t.getPrecio()*1.3));
        }
        
        if(t.isTdt()){
            t.setPrecio(t.getPrecio()+500);
        }
        
    }

    @Override
    public String toString() {
        return "TelevisorServices{" + "es=" + es.toString() + ", e=" + e.toString()  + ", t=" + t.toString()  + '}';
    }

   

    
}
