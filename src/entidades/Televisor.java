
package entidades;


public class Televisor extends Electrodomestico {
    
    protected int resolusion;
    protected boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolusion, boolean tdt, int precio, String color, Character consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolusion = resolusion;
        this.tdt = tdt;
    }

    public int getResolusion() {
        return resolusion;
    }

    public void setResolusion(int resolusion) {
        this.resolusion = resolusion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolusion=" + resolusion + ", tdt=" + tdt + ", precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}' ;
    }
        
}
