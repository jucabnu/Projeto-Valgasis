package ClassesEntidades;

/**
 *
 * @author jucabnu
 */
public class Modelo {

    private int cod_modelo;
    private String des_modelo;
    private int marca;

    @Override
    public String toString() {

        return "Cód. Modelo: " + this.cod_modelo + "\n"
                + "Descrição Modelo: " + this.getDes_modelo() + "\n"
                + "------------------------------------------------";
    }

    public Modelo() {
        this.cod_modelo = 0;
        this.des_modelo = "";
        this.marca = 0;
    }

    public int getCod_modelo() {
        return cod_modelo;
    }

    public void setCod_modelo(int cod_modelo) {
        this.cod_modelo = cod_modelo;
    }

    public String getDes_modelo() {
        return des_modelo;
    }

    public void setDes_modelo(String des_modelo) {
        this.des_modelo = des_modelo;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }
}
