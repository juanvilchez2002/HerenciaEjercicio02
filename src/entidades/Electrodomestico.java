
package entidades;

import java.util.ArrayList;
import java.util.List;


public class Electrodomestico {
    
    protected int precio;
    protected String color;
    protected Character consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, Character consumoEnergetico, int peso) {
        this.precio = precio;
        this.color=color;
        comprobarColor();
        this.consumoEnergetico=consumoEnergetico;
        comprobarConsumoEnergetico();
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void comprobarConsumoEnergetico(){
        if(this.consumoEnergetico.equals('A') ||this.consumoEnergetico.equals('B')||this.consumoEnergetico.equals('C')||this.consumoEnergetico.equals('D')||this.consumoEnergetico.equals('E')||this.consumoEnergetico.equals('F')){
            
        }else{
            this.consumoEnergetico = 'F';
        }
    }
    
    public void comprobarColor(){
        String[] colores = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        
        boolean flag=true;
        for(int i=0; i<colores.length; i++){
            if(colores[i].equalsIgnoreCase(this.color)){
                flag=false;
                break;
            }
        }
        
        if(flag){
            this.color = "BLANCO";
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
}
