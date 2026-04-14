package edu.ledo.montajeordenador;

import java.util.ArrayList;

public class PlacaBase extends Componentes {

    private boolean gaming;
    private TipoCaja tipoRam;
    private ArrayList<MemoriaRam> numeroRams;
    private ArrayList<Gpu> gpus;

    public PlacaBase(String nombre, String fabricante, double precio, int consumoEnergia, boolean gaming, TipoCaja tipoCaja) {
        super(nombre, fabricante, precio, consumoEnergia);
        this.gaming = gaming;
        this.tipoRam = tipoCaja;
        this.numeroRams = new ArrayList<>();
        this.gpus = new ArrayList<>();
    }


    public boolean conprovarSlotsRam(MemoriaRam memoriaRam) {
        if (numeroRams.size() >= 4) {
            return false;
        }
        if (memoriaRam instanceof GDDR) {
            return false;
        }
        if(!numeroRams.isEmpty()) {
            if(memoriaRam instanceof DDR && numeroRams.get(0) instanceof DDR) {
                DDR nueva = (DDR) memoriaRam;
                DDR existe = (DDR) numeroRams.get(0);

                if(nueva.getTipo() != existe.getTipo()) {
                    return false;
                }
            }
        }
        numeroRams.add(memoriaRam);
        return true;

    }

    public boolean comprobarGamingGpu(Gpu gpu) {
        if (gaming && gpus.size() >= 2) {
            return false;
        }
        if (!gaming && gpus.size() >= 1) {
            return false;
        }
        gpus.add(gpu);
        return true;
    }

    public void inspecionarRAM(){
        int ddr4 =0;
        int ddr5 =0;
        int gddr =0;

        for(MemoriaRam memoriaRam : numeroRams){
            if(memoriaRam instanceof GDDR) {
                gddr++;
            } else if(memoriaRam instanceof DDR) {
                DDR ddr = (DDR) memoriaRam;
                if (ddr.getTipo()==TipoDDR.DDR4){
                    ddr4++;
                }
                else{
                    ddr5++;
                }
            }
        }
        System.out.println("DDR4: " + ddr4);
        System.out.println("DDR5: " + ddr5);
        System.out.println("GDDR: " + gddr);
    }




    public boolean isGaming() {
        return gaming;
    }

    public void setGaming(boolean gaming) {
        this.gaming = gaming;
    }

    public TipoCaja getTipoCaja() {
        return tipoRam;
    }

    public ArrayList<MemoriaRam> getNumeroRams() {
        return numeroRams;
    }

    public ArrayList<Gpu> getGpus() {
        return gpus;
    }

    @Override
    public String toString() {
        return "PlacaBase{" +
                "gaming=" + gaming +
                '}';
    }


}
