
package modelo;


public class usuario {
    private String id_usuario;
    private String usuario;
    private String nombre_usuario;
    private String contrasena_usuario;
    private String rol_usuario;
    private String caja_usuario;
    private String estado_usuario;

    public usuario() {
    }

    public usuario(String id, String usuario, String nombre_usuario, String contrasena_usuario, String rol_usuario, String caja_usuario, String estado_usuario) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasena_usuario = contrasena_usuario;
        this.rol_usuario = rol_usuario;
        this.caja_usuario = caja_usuario;
        this.estado_usuario = estado_usuario;
    }

    public String getId() {
        return id_usuario;
    }

    public void setId(String id) {
        this.id_usuario = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena_usuario() {
        return contrasena_usuario;
    }

    public void setContrasena_usuario(String contrasena_usuario) {
        this.contrasena_usuario = contrasena_usuario;
    }

    public String getRol_usuario() {
        return rol_usuario;
    }

    public void setRol_usuario(String rol_usuario) {
        this.rol_usuario = rol_usuario;
    }

    public String getCaja_usuario() {
        return caja_usuario;
    }

    public void setCaja_usuario(String caja_usuario) {
        this.caja_usuario = caja_usuario;
    }

    public String getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(String estado_usuario) {
        this.estado_usuario = estado_usuario;
    }
    
    
}
