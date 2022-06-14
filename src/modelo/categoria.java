
package modelo;

public class categoria {
    private int id;
    private String nombre_categoria;
    private String estado_categoria;

    public categoria() {
    }

    public categoria(int id, String nombre_categoria, String estado_categoria) {
        this.id = id;
        this.nombre_categoria = nombre_categoria;
        this.estado_categoria = estado_categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getEstado_categoria() {
        return estado_categoria;
    }

    public void setEstado_categoria(String estado_categoria) {
        this.estado_categoria = estado_categoria;
    }
    
    
    
}
