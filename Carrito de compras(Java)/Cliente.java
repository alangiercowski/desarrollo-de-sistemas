import java.util.ArrayList;

public class Cliente {
    private Integer idCliente;
    private String nombre;
    private String direccionDeEnvio;
    private String direccionDeCobro;
    private String Email;
    private Boolean esDiferencial;
    private ArrayList<Carrito> listaCArritos;
    private Tarjeta tarjeta;

    public Cliente(Integer idCliente, String nombre, String direccionDeEnvio, String direccionDeCobro, String email, Boolean esDiferencial, ArrayList<Carrito> carritos, Tarjeta tarjeta) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccionDeEnvio = direccionDeEnvio;
        this.direccionDeCobro = direccionDeCobro;
        this.Email = email;
        this.esDiferencial = esDiferencial;
        this.listaCArritos = carritos;
        this.tarjeta = tarjeta;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionDeEnvio() {
        return direccionDeEnvio;
    }

    public void setDireccionDeEnvio(String direccionDeEnvio) {
        this.direccionDeEnvio = direccionDeEnvio;
    }

    public String getDireccionDeCobro() {
        return direccionDeCobro;
    }

    public void setDireccionDeCobro(String direccionDeCobro) {
        this.direccionDeCobro = direccionDeCobro;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Boolean getEsDiferencial() {
        return esDiferencial;
    }

    public void setEsDiferencial(Boolean esDiferencial) {
        this.esDiferencial = esDiferencial;
    }

    public ArrayList<Carrito> getListaCArritos() {
        return listaCArritos;
    }

    public void setListaCArritos(ArrayList<Carrito> listaCArritos) {
        this.listaCArritos = listaCArritos;
    }
}
