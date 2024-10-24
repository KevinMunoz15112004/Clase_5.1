public class Ciudadanos {
    private String nombre;
    private String apellido;
    private int edad;

    //Constructores (Con parámetros y vacío)
    public Ciudadanos(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Ciudadanos() {

    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo para imprimir
    public void imprimir() {
        System.out.println("El nombre del ciudadano es: "+ getNombre());
        System.out.println("El apellido del ciudadano es: "+ getApellido());
        System.out.println("El edad del ciudadano es: "+ getEdad());
    }
}
