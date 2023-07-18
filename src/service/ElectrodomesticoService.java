
package service;

import entidades.Electrodomestico;
import java.util.Scanner;


public class ElectrodomesticoService {
    
    Scanner consola = new Scanner(System.in);
    
    public Electrodomestico crearElectrodomestico(){
        
        System.out.println("---- Ingresando Electrodimestico ----");
        System.out.print("Color: ");
        String color = consola.nextLine();        
        System.out.print("Consumo (A, B, C, D, E, F) : ");
        Character consumo = consola.next().charAt(0);        
        System.out.print("Peso: ");
        int peso = consola.nextInt();
        int base = 1000;
        Electrodomestico e = new Electrodomestico(1000, color, consumo, peso );       
        
        precioFinal(e);
        
        return e;
    }
    
    public void precioFinal(Electrodomestico e){
        
        //CONSUMO
        switch(e.getConsumoEnergetico()){
            case 'A':
                e.setPrecio(e.getPrecio()+1000);
                break;
            case 'B':
                e.setPrecio(e.getPrecio()+800);
                break;
            case 'C':
                e.setPrecio(e.getPrecio()+600);
                break;
            case 'D':
                e.setPrecio(e.getPrecio()+500);
                break;   
            case 'E':
                e.setPrecio(e.getPrecio()+300);
                break;
            case 'F':
                e.setPrecio(e.getPrecio()+100);
                break;
        }
        
        //peso
        if(e.getPeso()<20){
           e.setPrecio(e.getPrecio()+100);
        }else if(e.getPeso()<50){
            e.setPrecio(e.getPrecio()+500);
        }else if(e.getPeso()<80){
            e.setPrecio(e.getPrecio()+800);
        }else{            
            e.setPrecio(e.getPrecio()+1000);
        }
        
    }
}
