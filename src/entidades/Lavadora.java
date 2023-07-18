
package entidades;


public class Lavadora extends Electrodomestico {
    
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, Character consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + ", precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}' ;
    }
}
