package edu.ledo.montajeordenador;

public class DDR extends MemoriaRam{
    private TipoDDR tipo;

    public DDR(String nombre, String fabricante, double precio, int consumoEnergia, TipoDDR tipo) {
        super(nombre, fabricante, precio, consumoEnergia);
        this.tipo = tipo;
    }
    public TipoDDR getTipo() {
        return tipo;
    }

}
