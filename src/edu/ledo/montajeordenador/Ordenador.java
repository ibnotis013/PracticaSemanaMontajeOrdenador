package edu.ledo.montajeordenador;

public class Ordenador {
    private Caja caja;
    private PlacaBase placaBase;
    private Cpu cpu;
    private Gpu gpu;
    private Refrigeracion refrigeracion;
    private FuenteAlimentacion fuenteAlimentacion;

    public Ordenador(Caja caja, PlacaBase placaBase, Cpu cpu, Gpu gpu, Refrigeracion refrigeracion, FuenteAlimentacion fuenteAlimentacion) {
        this.caja = caja;
        this.placaBase = placaBase;
        this.cpu = cpu;
        this.gpu = gpu;
        this.refrigeracion = refrigeracion;
        this.fuenteAlimentacion = fuenteAlimentacion;
    }


    public boolean esCompatible(){
        return caja.getTipoCaja()==placaBase.getTipoCaja();
    }

}
