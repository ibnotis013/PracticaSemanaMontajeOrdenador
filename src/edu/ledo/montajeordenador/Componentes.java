package edu.ledo.montajeordenador;

public class Componentes {

    private String nombre;
    private String fabricante;
    private double precio;
    private int consumoEnergia;


    public Componentes(String nombre, String fabricante, double precio, int consumoEnergia) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.precio = precio;
        this.consumoEnergia = consumoEnergia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }


    @Override
    public String toString() {
        return "Componentes{" +
                "nombre='" + nombre + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                ", consumoEnergia=" + consumoEnergia +
                '}';
    }

}
