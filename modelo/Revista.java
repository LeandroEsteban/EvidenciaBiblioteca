package modelo;

public class Revista extends MaterialBiblioteca implements Prestable {
    // Atributos adicionales
    private String ISSN;
    private int numero;

    // Constructor
    public Revista(int id, String titulo, String autor, String ISSN, int numero) {
        super(id, titulo, autor); // Llamada al constructor de la clase padre
        this.ISSN = ISSN;
        this.numero = numero;
    }

    // Getters y setters
    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Métodos de la interfaz modelo.Prestable
    @Override
    public void prestar() {
        // Si la revista no está prestada, se cambia el estado a prestada
        if (!this.prestado) {
            this.prestado = true;
        }
    }

    @Override
    public void devolver() {
        // Si la revista está prestada, se cambia el estado a no prestada
        if (this.prestado) {
            this.prestado = false;
        }
    }
}
