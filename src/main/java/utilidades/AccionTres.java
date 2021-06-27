package utilidades;

import framework.Accion;

public class AccionTres implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("¿Como estas hoy?");
    }
    @Override
    public String nombreItemMenu() {
        return "PreguntarEstadoDeAnimo";
    }
    @Override
    public String descripcionItemMenu() {
        return "Escribe un msj consultando por el estado de animo";
    }
}
