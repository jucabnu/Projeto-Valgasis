package ClassesEntidades;

/**
 *
 * @author jucabnu
 */
public class Veiculo {

    private String renavan;
    private String placa;
    private int ano;
    private int modelo;
    private String cor;
    private String dataIn;
    private double valIn;
    private String obs_veic;
    private String clienteIn;
    private boolean status;

    @Override
    public String toString() {
        return "Renavan: " + this.renavan + "\n"
                + "Placa: " + this.placa + "\n"
                + "Ano: " + this.ano + "\n"
                + "Cód. Modelo: " + this.modelo + "\n"
                + "Cor: " + this.cor + "\n"
                + "Data entrada: " + this.dataIn + "\n"
                + "Valor entrada: R$ " + this.valIn + "\n"
                + "CPF cliente: " + this.clienteIn + "\n"
                + "Observações: " + this.obs_veic + "\n"
                + "---------------------------------------------------";
    }

    public Veiculo() {
        this.renavan = "";
        this.placa = "";
        this.ano = 0;
        this.modelo = 0;
        this.cor = "";
        this.dataIn = "";
        this.valIn = 0.0;
        this.obs_veic = "";
        this.clienteIn = "";
        this.status = false;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDataIn() {
        return dataIn;
    }

    public void setDataIn(String dataIn) {
        this.dataIn = dataIn;
    }

    public double getValIn() {
        return valIn;
    }

    public void setValIn(double valIn) {
        this.valIn = valIn;
    }

    public String getObs_veic() {
        return obs_veic;
    }

    public void setObs_veic(String obs_veic) {
        this.obs_veic = obs_veic;
    }

    public String getClienteIn() {
        return clienteIn;
    }

    public void setClienteIn(String clienteIn) {
        this.clienteIn = clienteIn;
    }
}
