package ClassesEntidades;

/**
 *
 * @author jucabnu
 */
public class Cliente {

    private String cpf;
    private String nome;
    private long telefone;
    private String data_cli;
    private String obs_cli;
    private String endereco;

    @Override
    public String toString() {

        return "CPF: " + this.cpf + "\n"
                + "Nome: " + this.nome + "\n"
                + "Telefone: " + this.telefone + "\n"
                + "Data: " + this.data_cli + "\n"
                + "Obs.: " + this.obs_cli + "\n"
                + "Endereço: " + this.endereco + "\n"
                + "------------------------------------------------";
    }

    public Cliente() {
        this.cpf = "";
        this.nome = "";
        this.telefone = 0;
        this.data_cli = "";
        this.obs_cli = "";
        this.endereco = "";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getData_cli() {
        return data_cli;
    }

    public void setData_cli(String data_cli) {
        this.data_cli = data_cli;
    }

    public String getObs_cli() {
        return obs_cli;
    }

    public void setObs_cli(String obs_cli) {
        this.obs_cli = obs_cli;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
