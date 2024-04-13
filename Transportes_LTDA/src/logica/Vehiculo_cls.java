package logica;

public class Vehiculo_cls {
    private String placa;
    private String descripcion;
    private String nombreConductor;
    private String ruta;
    private String marca;
    private String modelo;
    
    public Vehiculo_cls(String placa, String descripcion, String nombreConductor, String ruta, String marca,
            String modelo) {
        this.placa = placa;
        this.descripcion = descripcion;
        this.nombreConductor = nombreConductor;
        this.ruta = ruta;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}