package utilidades;

import framework.Accion;

public class AccionUno implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("Hola!!");
    }

    @Override
    public String nombreItemMenu() {
        return "Saludar";
    }

    @Override
    public String descripcionItemMenu() {
        return "Escribe un mensaje de hola";
    }
}