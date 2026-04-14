package edu.ledo.montajeordenador;

import java.util.Scanner;

public class Principal {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuánto dinero tienes? ");
        double dinero = sc.nextDouble();

        Caja caja = new Caja("Caja1", "Corsair", 100, 0, TipoCaja.ATX);
        PlacaBase placa = new PlacaBase("Placa1", "Asus", 200, 50, true,TipoCaja.ATX);
        Cpu cpu = new Cpu("Ryzen 5", "AMD", 200, 65);
        Refrigeracion ref = new Refrigeracion("Cooler", "CoolerMaster", 50, 10);
        FuenteAlimentacion fuente = new FuenteAlimentacion("PSU", "EVGA", 100, 600);

        placa.conprovarSlotsRam(new DDR("RAM1", "Kingston", 80, 5, TipoDDR.DDR4));
        placa.comprobarGamingGpu(new Gpu("RTX", "Nvidia", 400, 200));

        Ordenador pc = new Ordenador(caja, placa, cpu,new Gpu("RTX", "Nvidia", 400, 200), ref, fuente);

        double precio = pc.precioTotal();

        if (dinero >= precio) {
            System.out.println("Compra realizada, tu cambio es de: " + (dinero - precio) + "€");
        } else {
            System.out.println("Error en la comrpa, te faltan: " + (precio - dinero) + "€");
        }

        if (pc.enceder()) {
            System.out.println("El PC se enciende correctamente");
        } else {
            System.out.println("Error de energía");
        }
    }
}
