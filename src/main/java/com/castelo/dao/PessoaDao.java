package com.castelo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.castelo.conexao.Conexao;

public class PessoaDao {


    public void cadastrarPessoa(PessoaPojo pessoaPojo) {

        Conexao conexao = new Conexao();

        String sql = "insert into pessoa(nome, endereco, idade) value (?, ?, ?)";

        PreparedStatement ps = null;


        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps.setString(1, pessoaPojo.getNome());
            ps.setString(2, pessoaPojo.getEndereco());
            ps.setInt(3, pessoaPojo.getIdade());

            ps.execute();
            ps.close();

            System.out.println("Ddos inseridos com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println( "Ocorreu um erro com os dados.");
        }

    }

}
