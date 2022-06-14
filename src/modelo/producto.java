
package modelo;


public class producto {
    private int id;
    String nombre_producto;
    String estado_producto;

    public producto() {
    }

    public producto(int id, String nombre_producto, String estado_producto) {
        this.id = id;
        this.nombre_producto = nombre_producto;
        this.estado_producto = estado_producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getEstado_producto() {
        return estado_producto;
    }

    public void setEstado_producto(String estado_producto) {
        this.estado_producto = estado_producto;
    }
    
    
}
