
package dominio;

public class Persona_Jubilada {
    private String cedula;
    private String nombre;
    private int salario_base;
    private int anios_aporte;

    public Persona_Jubilada(String cedula, String nombre, int anios_aporte, int salario_base) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.anios_aporte = anios_aporte;
        this.salario_base = salario_base;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(int salario_base) {
        this.salario_base = salario_base;
    }

    public int getAnios_aporte() {
        return anios_aporte;
    }

    public void setAnios_aporte(int anios_aporte) {
        this.anios_aporte = anios_aporte;
    }
    
    @Override
    public String toString(){
        return this.nombre+" "+this.cedula+ " "+this.salario_base+" "+this.anios_aporte;
    }
    
    
}
