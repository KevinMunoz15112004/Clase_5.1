public class Mascotas {
    private String nombre;
    private String raza;
    private String ColorPelaje;
    private int edad;

    //Constructores (Con parámetros y vacío)
    public Mascotas(String nombre, String raza, String ColorPelaje, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.ColorPelaje = ColorPelaje;
        this.edad = edad;
    }
    public Mascotas() {

    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getColorPelaje() {
        return ColorPelaje;
    }
    public void setColorPelaje(String ColorPelaje) {
        this.ColorPelaje = ColorPelaje;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo para imprimir
    public void imprimir() {
        System.out.println("El nombre de la mascota es: " + getNombre());
        System.out.println("El raza de la mascota es: " + getRaza());
        System.out.println("El color de la mascota es: " + getColorPelaje());
        System.out.println("La edad de la mascota es: " + getEdad());
    }
}
