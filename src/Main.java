// Clase MainVolador con el metodo main para ejecutar el codigo
class MainVolador {
    public static void main(String[] args) {
        // Se crean dos objwtos de las clases Ave y Avion
        Volador ave = new Ave();
        Volador avion = new Avion();
        // Los objetos usan los metodos sobreescritos
        ave.volar();
        avion.volar();
        ave.aterriza();
        avion.aterriza();
    }
}