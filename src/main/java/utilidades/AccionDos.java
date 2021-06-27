package utilidades;

import framework.Accion;

public class AccionDos implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("Chau!!");
    }
    @Override
    public String nombreItemMenu() {
        return "Despedirse";
    }
    @Override
    public String descripcionItemMenu() {
        return "Escribe un msj de despedida";
    }
}