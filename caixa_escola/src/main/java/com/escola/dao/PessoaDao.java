package com.escola.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.escola.conexao.Conexao;

public class PessoaDao {
    
    /* public void cadastrarPessoa(PessoaPojo pessoaPojo) {

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

            System.out.println("Dados inseridos com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println( "Ocorreu um erro com os dados.");
        }
    } */


    public void deletarPessoa(PessoaPojo pessoaPojo) {

        Conexao conexao = new Conexao();

        String sql = "DELETE FROM pessoa WHERE id = (?)";

        PreparedStatement ps = null;


        try {

            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, pessoaPojo.getId());
            
           

            ps.execute();
            ps.close();

            System.out.println("Dados deletados com sucesso!");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

           
        
    }
        
    



}


    



