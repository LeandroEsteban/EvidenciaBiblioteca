public class Libro extends MaterialBiblioteca implements Prestable {
    // Atributos adicionales
    private String ISBN;
    private int edicion;

    // Constructor
    public Libro(int id, String titulo, String autor, String ISBN, int edicion) {
        super(id, titulo, autor); // Llamada al constructor de la clase padre
        this.ISBN = ISBN;
        this.edicion = edicion;
    }

    // Getters y setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    // Métodos de la interfaz Prestable
    @Override
    public void prestar() {
        // Si el libro no está prestado, se cambia el estado a prestado
        if (!this.prestado) {
            this.prestado = true;
        }
    }

    @Override
    public void devolver() {
        // Si el libro está prestado, se cambia el estado a no prestado
        if (this.prestado) {
            this.prestado = false;
        }
    }
}
