public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(30);
        persona.setNombre("Rodigo");
        persona.setTelefono(312487287);

        System.out.print("El nombre es: ");
        System.out.println(persona.getNombre());
        System.out.print("La edad es: ");
        System.out.println(persona.getEdad());
        System.out.print("El telefonmo es: ");
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}