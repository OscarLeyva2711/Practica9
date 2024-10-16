public class Mantenimiento {
    private String tipoDeMantenimiento;
    private String fecha;
    private float  costo;
    public Mantenimiento(String tipoDeMantenimiento, String fecha, float costo) {
        this.tipoDeMantenimiento = tipoDeMantenimiento;
        this.fecha = fecha;
        this.costo = costo;
    }
    public String getTipoDeMantenimiento() {
        return tipoDeMantenimiento;
    }
    public void setTipoDeMantenimiento(String tipoDeMantenimiento) {
        this.tipoDeMantenimiento = tipoDeMantenimiento;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public float getCosto() {
        return costo;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }

}
