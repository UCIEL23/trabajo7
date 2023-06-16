
package Principal;

/**
 *
 * @author 
 */
public class Decarga extends Auto {

    private String tipoCombustible;
    private double toneladasDeCarga;

    public Decarga(String tipoCombustible, double toneladasDeCarga, String placa, String color, int velocidades, String transmision) {
        super(placa, color, velocidades, transmision);
        this.tipoCombustible = tipoCombustible;
        this.toneladasDeCarga = toneladasDeCarga;
    }

    public Decarga() {
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getToneladasDeCarga() {
        return toneladasDeCarga;
    }

    public void setToneladasDeCarga(double toneladasDeCarga) {
        this.toneladasDeCarga = toneladasDeCarga;
    }

    public String verDatos() {
        String datos = placa + " " + color + " " + String.valueOf(velocidades) + " " + transmision + " " + tipoCombustible + String.valueOf(toneladasDeCarga);
        return datos;
    }

}
