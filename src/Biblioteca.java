import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {
    // Atributos
    private ArrayList<MaterialBiblioteca> materiales; // Lista de materiales
    private ArrayList<Usuario> usuarios; // Lista de usuarios
    private HashMap<Usuario, ArrayList<MaterialBiblioteca>> prestamos; // Mapa de préstamos

    // Constructor
    public Biblioteca() {
        this.materiales = new ArrayList<>(); // Se inicializa la lista de materiales vacía
        this.usuarios = new ArrayList<>(); // Se inicializa la lista de usuarios vacía
        this.prestamos = new HashMap<>(); // Se inicializa el mapa de préstamos vacío
    }

    // Métodos para operaciones de la biblioteca

    // Método para registrar un material
    public void registrarMaterial(MaterialBiblioteca material) {
        // Se agrega el material a la lista de materiales
        this.materiales.add(material);
    }

    // Método para buscar un material por título
    public MaterialBiblioteca buscarMaterialPorTitulo(String titulo) {
        // Se recorre la lista de materiales
        for (MaterialBiblioteca material : this.materiales) {
            // Si el título del material coincide con el buscado, se retorna el material
            if (material.getTitulo().equals(titulo)) {
                return material;
            }
        }
        // Si no se encuentra el material, se retorna null
        return null;
    }

    // Método para buscar un material por autor
    public ArrayList<MaterialBiblioteca> buscarMaterialPorAutor(String autor) {
        // Se crea una lista vacía para almacenar los materiales encontrados
        ArrayList<MaterialBiblioteca> resultado = new ArrayList<>();
        // Se recorre la lista de materiales
        for (MaterialBiblioteca material : this.materiales) {
            // Si el autor del material coincide con el buscado, se agrega el material a la lista de resultado
            if (material.getAutor().equals(autor)) {
                resultado.add(material);
            }
        }
        // Se retorna la lista de resultado
        return resultado;
    }

    // Método para registrar un usuario
    public void registrarUsuario(Usuario usuario) {
        // Se agrega el usuario a la lista de usuarios
        this.usuarios.add(usuario);
    }

    // Método para buscar un usuario por id
    public Usuario buscarUsuarioPorId(int idUsuario) {
        // Se recorre la lista de usuarios
        for (Usuario usuario : this.usuarios) {
            // Si el id del usuario coincide con el buscado, se retorna el usuario
            if (usuario.getIdUsuario() == idUsuario) {
                return usuario;
            }
        }
        // Si no se encuentra el usuario, se retorna null
        return null;
    }

    // Método para prestar un material a un usuario


    // Método para devolver un material de un usuario

}