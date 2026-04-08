package edu.ledo.montajeordenador;

public class Caja extends Componentes {

    private TipoCaja tipoCaja;

    public Caja(String nombre, String fabricante, double precio, int consumoEnergia, TipoCaja tipoCaja) {
        super(nombre, fabricante, precio, consumoEnergia);
        this.tipoCaja = tipoCaja;
    }

    public TipoCaja getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(TipoCaja tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "tipoCaja=" + tipoCaja +
                '}';
    }


}
