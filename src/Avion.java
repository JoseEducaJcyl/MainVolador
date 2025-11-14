// Clase Avion con los metodos sobreescritos de Volador
public class Avion implements Volador{
    @Override
    public void volar() {
        System.out.println("El avion vuela");
    }

    @Override
    public void aterriza() {
        System.out.println("El avion aterriza");
    }
}
