package ClassesEntidades;

/**
 *
 * @author jucabnu
 */
public class Venda {

    private String cliente;
    private String renavan;
    private double valOut;
    private String dataOut;

    @Override
    public String toString() {
        return "Renavan: " + this.renavan + "\n"
                + "CPF cliente: " + this.cliente + "\n"
                + "Valor saída: R$ " + this.valOut + "\n"
                + "Data saída: " + this.dataOut + "\n"
                + "------------------------------------------";
    }

    public Venda() {
        this.cliente = "";
        this.renavan = "";
        this.valOut = 0.0;
        this.dataOut = "";
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public double getValOut() {
        return valOut;
    }

    public void setValOut(double valOut) {
        this.valOut = valOut;
    }

    public String getDataOut() {
        return dataOut;
    }

    public void setDataOut(String dataOut) {
        this.dataOut = dataOut;
    }
}
