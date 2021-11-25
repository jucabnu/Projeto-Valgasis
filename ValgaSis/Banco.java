/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ValgaSis;

import ClassesEntidades.Cliente;
import ClassesEntidades.Marca;
import ClassesEntidades.Modelo;
import ClassesEntidades.Veiculo;
import ClassesEntidades.Venda;
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jucabnu
 */
public class Banco {

    //  **************************************************
    //  ********************* SELECT *********************
    //  **************************************************
    // ---------------  VENDA
    public static Venda selectVenda(int chaveValor) {

        Venda v = new Venda();
        Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "SELECT * FROM tab_saida WHERE num = " + chaveValor + "";
            System.out.println(q);
            ResultSet rs = st.executeQuery(q);
            if (rs.next()) {
                v.setCliente(rs.getString("cpf"));
                v.setRenavan(rs.getString("renavan"));
                v.setValOut(rs.getDouble("valOut"));
                v.setDataOut(rs.getString("dataOut"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return v;
    }

    public static ArrayList selectVendaPesquisa(String chaveValor) {

        ArrayList<Venda> lista = new ArrayList<>();
        Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "SELECT * FROM tab_saida WHERE renavan LIKE '%"
                    + chaveValor + "%'";
            System.out.println(q);
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                Venda v = new Venda();
                v.setCliente(rs.getString("cpf"));
                v.setRenavan(rs.getString("renavan"));
                v.setValOut(rs.getDouble("valOut"));
                v.setDataOut(rs.getString("dataOut"));
                lista.add(v);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    // ---------------  CLIENTE
    public static Cliente selectCliente(String chaveValor) {

        Cliente clie = new Cliente();
        Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "SELECT * FROM tab_clientes WHERE cpf = " + chaveValor + "";
            System.out.println(q);
            ResultSet rs = st.executeQuery(q);
            if (rs.next()) {
                clie.setCpf(rs.getString("cpf"));
                clie.setNome(rs.getString("nome"));
                clie.setTelefone(rs.getLong("telefone"));
                clie.setEndereco(rs.getString("endereco"));
                clie.setObs_cli(rs.getString("obs_clie"));
                clie.setData_cli(rs.getString("data_cli"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return clie;
    }

    public static ArrayList selectClientePesquisa(String chaveValor, String chave) {

        ArrayList<Cliente> lista = new ArrayList<>();
        Connection conn = Conexao.getConnection();
        if (chave.equals("")) {
            chave = "nome";
        }
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "SELECT * FROM tab_clientes WHERE " + chave + " LIKE '%"
                    + chaveValor.toUpperCase() + "%' ";
            q += "ORDER BY nome"; // q += "order by 2";
            System.out.println(q);
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                Cliente clie = new Cliente();
                clie.setCpf(rs.getString("cpf"));
                clie.setNome(rs.getString("nome"));
                clie.setTelefone(rs.getLong("telefone"));
                clie.setEndereco(rs.getString("endereco"));
                clie.setObs_cli(rs.getString("obs_clie"));
                clie.setData_cli(rs.getString("data_cli"));
                lista.add(clie);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    // ---------------  VEÍCULO
    public static Veiculo selectVeiculo(String chaveValor) {

        Veiculo veic = new Veiculo();
        Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "SELECT * FROM tab_veiculos WHERE renavan = "
                    + chaveValor + "";
            System.out.println(q);
            ResultSet rs = st.executeQuery(q);
            if (rs.next()) {
                veic.setRenavan(rs.getString("renavan"));
                veic.setPlaca(rs.getString("placa"));
                veic.setAno(rs.getInt("ano"));
                veic.setModelo(rs.getInt("modelo"));
                veic.setCor(rs.getString("cor"));
                veic.setObs_veic(rs.getString("obs_vei"));
                veic.setValIn(rs.getDouble("valIn"));
                veic.setClienteIn(rs.getString("cpf"));
                veic.setDataIn(rs.getString("dataIn"));
                veic.setStatus(rs.getBoolean("status"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return veic;
    }

    public static ArrayList selectVeiculoPesquisa(String chaveValor, String chave) {

        ArrayList<Veiculo> lista = new ArrayList<>();
        Connection conn = Conexao.getConnection();
        if (chave.equals("")) {
            chave = "placa";
        }
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "SELECT * FROM tab_veiculos WHERE " + chave + " like '%"
                    + chaveValor.toUpperCase() + "%'";
            q += "ORDER BY modelo";
            System.out.println(q);
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                Veiculo veic = new Veiculo();
                veic.setRenavan(rs.getString("renavan"));
                veic.setPlaca(rs.getString("placa"));
                veic.setAno(rs.getInt("ano"));
                veic.setModelo(rs.getInt("modelo"));
                veic.setCor(rs.getString("cor"));
                veic.setObs_veic(rs.getString("obs_vei"));
                veic.setValIn(rs.getDouble("valIn"));
                veic.setClienteIn(rs.getString("cpf"));
                veic.setDataIn(rs.getString("dataIn"));
                veic.setStatus(rs.getBoolean("status"));
                lista.add(veic);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    // ---------------  MARCA
    public static Marca selectMarca(int chaveValor) {

        Marca marc = new Marca();
        Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "SELECT * FROM tab_marcas WHERE cod_marca = "
                    + chaveValor + "";
            System.out.println(q);
            ResultSet rs = st.executeQuery(q);
            if (rs.next()) {
                marc.setCod_marca(rs.getInt("cod_marca"));
                marc.setDes_marca(rs.getString("des_marca"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return marc;
    }

    public static ArrayList selectMarcaPesquisa(String chaveValor) {
        ArrayList<Marca> lista = new ArrayList<>();
        Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "SELECT * FROM tab_marcas WHERE UPPER(des_marca) LIKE '%"
                    + chaveValor.toUpperCase() + "%'";
            // q += "ORDER by des_marca";
            System.out.println(q);
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                Marca marc = new Marca();
                marc.setCod_marca(rs.getInt("cod_marca"));
                marc.setDes_marca(rs.getString("des_marca"));
                lista.add(marc);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    // ---------------  MODELO
    public static Modelo selectModelo(int chaveValor) {

        Modelo model = new Modelo();
        Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "SELECT * FROM tab_modelos WHERE cod_modelo = "
                    + chaveValor + "";
            System.out.println(q);
            ResultSet rs = st.executeQuery(q);
            if (rs.next()) {
                model.setCod_modelo(rs.getInt("cod_modelo"));
                model.setDes_modelo(rs.getString("des_modelo"));
                model.setMarca(rs.getInt("cod_marca"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    public static ArrayList selectModeloPesquisa(String chaveValor) {
        ArrayList<Modelo> lista = new ArrayList<>();
        Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "SELECT * FROM tab_modelos WHERE UPPER(des_modelo) LIKE '%"
                    + chaveValor.toUpperCase() + "%'";
            // q += "ORDER BY des_modelo";
            System.out.println(q);
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                Modelo model = new Modelo();
                model.setCod_modelo(rs.getInt("cod_modelo"));
                model.setDes_modelo(rs.getString("des_modelo"));
                model.setMarca(rs.getInt("cod_marca"));
                lista.add(model);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    //  **************************************************
    //  ********************* INSERT *********************
    //  **************************************************
    // ---------------  VENDA
    public static void insertVenda(Venda v) {
        com.mysql.jdbc.Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "INSERT INTO tab_saida (renavan, cpf, ValOut, dataOut)";
            q += "VALUES('" + v.getRenavan() + "', '" + v.getCliente() + "', "
                    + v.getValOut() + ", CURDATE())";
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "UPDATE tab_veiculos SET ";
            q += "status = 1 ";
            q += "WHERE renavan = '" + v.getRenavan() + "'";
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }

    // ---------------  CLIENTE
    public static void insertCliente(Cliente c) {
        com.mysql.jdbc.Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "INSERT INTO tab_clientes (cpf, nome, telefone, "
                    + "endereco, obs_clie, data_cli)";
            q += "VALUES('" + c.getCpf() + "', '" + c.getNome() + "', "
                    + c.getTelefone() + ", '" + c.getEndereco() + "', '"
                    + c.getObs_cli() + "', CURDATE())";
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // ---------------  VEÍCULO
    public static void insertVeiculo(Veiculo v) {
        com.mysql.jdbc.Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "INSERT INTO tab_veiculos (renavan, placa, ano, "
                    + "cor, modelo, obs_vei, valIn, cpf, dataIn, status)";
            q += "VALUES('" + v.getRenavan() + "', '" + v.getPlaca() + "', "
                    + v.getAno() + ", '" + v.getCor() + "', " + v.getModelo()
                    + ", '" + v.getObs_veic() + "', " + v.getValIn() + ", '"
                    + v.getClienteIn() + "', CURDATE(), " + v.isStatus() + ")";
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // ---------------  MARCA
    public static void insertMarca(Marca m) {
        com.mysql.jdbc.Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "INSERT INTO tab_marcas (cod_marca, des_marca)";
            q += "VALUES(" + m.getCod_marca() + ", '" + m.getDes_marca() + "')";
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // ---------------  MODELO
    public static void insertModelo(Modelo m) {
        com.mysql.jdbc.Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "INSERT INTO tab_modelos (cod_modelo, des_modelo, cod_marca)";
            q += "VALUES(" + m.getCod_modelo() + ", '" + m.getDes_modelo()
                    + "', " + m.getMarca() + ")";
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //  **************************************************
    //  ********************* UPDATE *********************
    //  **************************************************
    // ---------------  CLIENTE
    public static void updateCliente(Cliente c) {
        com.mysql.jdbc.Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "UPDATE tab_clientes SET ";
            q += "nome = '" + c.getNome() + "', ";
            q += "telefone = " + c.getTelefone() + ", ";
            q += "endereco = '" + c.getEndereco() + "', ";
            q += "obs_clie = '" + c.getObs_cli() + "' ";
            q += "WHERE cpf = '" + c.getCpf() + "'";
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // ---------------  VEÍCULO
    public static void updateVeiculo(Veiculo v) {
        com.mysql.jdbc.Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "UPDATE tab_veiculos SET ";
            q += "placa = '" + v.getPlaca() + "',";
            q += "ano = " + v.getAno() + ",";
            q += "cor = '" + v.getCor() + "',";
            q += "modelo = " + v.getModelo() + ",";
            q += "obs_vei = '" + v.getObs_veic() + "',";
            q += "valIn = " + v.getValIn() + ", ";
            q += "cpf = '" + v.getClienteIn() + "'";
            q += "WHERE renavan = '" + v.getRenavan() + "'";
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // ---------------  MARCA
    public static void updateMarca(Marca m) {
        com.mysql.jdbc.Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "UPDATE tab_marcas SET ";
            q += "des_marca = '" + m.getDes_marca() + "'";
            q += "WHERE cod_marca = " + m.getCod_marca();
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // ---------------  MODELO
    public static void updateModelo(Modelo m) {
        com.mysql.jdbc.Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "UPDATE tab_modelos SET ";
            q += "des_modelo = '" + m.getDes_modelo() + "',";
            q += "cod_marca = " + m.getMarca() + " ";
            q += "WHERE cod_modelo = " + m.getCod_modelo();
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //  **************************************************
    //  ********************* DELETE *********************
    //  **************************************************
    public static void deleteRegistro(String chaveNome, String tabela, String chaveValor) {
        Connection conn = Conexao.getConnection();

        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "DELETE FROM " + tabela + " WHERE "
                    + chaveNome + " = " + chaveValor;
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
