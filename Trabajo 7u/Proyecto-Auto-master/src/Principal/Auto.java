
package Principal;

/**
 *
 * @author Uciel 
 */
public class Auto {
    protected String placa;
    protected String color;
    protected int velocidades;
    protected String transmision;

    public Auto(String placa, String color, int velocidades, String transmision) {
        this.placa = placa;
        this.color = color;
        this.velocidades = velocidades;
        this.transmision = transmision;
    }

    public Auto() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
    public String verDatos(){
        String datos = "Metodo desde la clase Auto: "+placa+" "+color+" "+String.valueOf(velocidades)+" "+transmision;
        return datos;
    }
    
    
}
