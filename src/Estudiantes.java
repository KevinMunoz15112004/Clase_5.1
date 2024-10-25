public class Estudiantes {
    private String nombre;
    private String apellido;
    private int edad;
    private double nota;

    //Constructores (Con parámetros y vacío)
    public Estudiantes(String nombre, String apellido, int edad, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
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
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    //Metodo para imprimir
    public void imprimir(){
        System.out.println("El nombre del estudiante es: " + getNombre());
        System.out.println("El apellido del estudiante es: " + getApellido());
        System.out.println("La edad del estudiante es: " + getEdad());
        System.out.println("La nota obtenida es: " + getNota());
    }
}

