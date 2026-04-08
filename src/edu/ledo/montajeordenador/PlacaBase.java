package edu.ledo.montajeordenador;

public class PlacaBase extends Componentes{

    private boolean gaming;

    public PlacaBase(String nombre, String fabricante, double precio, int consumoEnergia, boolean gaming) {
        super(nombre, fabricante, precio, consumoEnergia);
        this.gaming = gaming;
    }


    public boolean isGaming() {
        return gaming;
    }

    public void setGaming(boolean gaming) {
        this.gaming = gaming;
    }

    @Override
    public String toString() {
        return "PlacaBase{" +
                "gaming=" + gaming +
                '}';
    }
}
