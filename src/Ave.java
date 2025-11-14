// Clase Ave con los metodos sobreescritos de Volador
public class Ave implements Volador{
    @Override
    public void volar() {
        System.out.println("El ave vuela");
    }
    @Override
    public void aterriza() {
        System.out.println("El ave aterriza");
    }
}
