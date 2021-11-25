package ClassesEntidades;

/**
 *
 * @author jucabnu
 */
public class Marca {

    private int cod_marca;
    private String des_marca;

    @Override
    public String toString() {

        return "Cód.: " + this.cod_marca + "\n"
                + "Descrição: " + this.getDes_marca() + "\n"
                + "------------------------------------------------";
    }

    public Marca() {
        this.cod_marca = 0;
        this.des_marca = "";
    }

    public int getCod_marca() {
        return cod_marca;
    }

    public void setCod_marca(int cod_marca) {
        this.cod_marca = cod_marca;
    }

    public String getDes_marca() {
        return des_marca;
    }

    public void setDes_marca(String des_marca) {
        this.des_marca = des_marca;
    }
}
