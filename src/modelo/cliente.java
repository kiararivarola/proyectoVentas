
package modelo;

public class cliente {
    private int id;
    private String nombre_cliente;
    private String telefono_cliente;
    private String direccion_cliente;
    private String estado_cliente;

    public cliente() {
    }

    public cliente(int id, String nombre_cliente, String telefono_cliente, String direccion_cliente, String estado_cliente) {
        this.id = id;
        this.nombre_cliente = nombre_cliente;
        this.telefono_cliente = telefono_cliente;
        this.direccion_cliente = direccion_cliente;
        this.estado_cliente = estado_cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getEstado_cliente() {
        return estado_cliente;
    }

    public void setEstado_cliente(String estado_cliente) {
        this.estado_cliente = estado_cliente;
    }
    
    
}
