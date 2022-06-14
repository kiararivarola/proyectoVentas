
package modelo;


public class proveedor {
    private int id;
    private String ruc_proveedor;
    private String nombre_proveedor;
    private String telefono_proveedor;
    private String direccion_proveedor;
    private String estado_proveedor;

    public proveedor() {
    }

    public proveedor(int id, String ruc_proveedor, String nombre_proveedor, String telefono_proveedor, String direccion_proveedor, String estado_proveedor) {
        this.id = id;
        this.ruc_proveedor = ruc_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.telefono_proveedor = telefono_proveedor;
        this.direccion_proveedor = direccion_proveedor;
        this.estado_proveedor = estado_proveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRuc_proveedor() {
        return ruc_proveedor;
    }

    public void setRuc_proveedor(String ruc_proveedor) {
        this.ruc_proveedor = ruc_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getTelefono_proveedor() {
        return telefono_proveedor;
    }

    public void setTelefono_proveedor(String telefono_proveedor) {
        this.telefono_proveedor = telefono_proveedor;
    }

    public String getDireccion_proveedor() {
        return direccion_proveedor;
    }

    public void setDireccion_proveedor(String direccion_proveedor) {
        this.direccion_proveedor = direccion_proveedor;
    }

    public String getEstado_proveedor() {
        return estado_proveedor;
    }

    public void setEstado_proveedor(String estado_proveedor) {
        this.estado_proveedor = estado_proveedor;
    }
    
    
}
