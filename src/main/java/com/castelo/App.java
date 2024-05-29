package com.castelo;

import com.castelo.dao.PessoaDao;
import com.castelo.dao.PessoaPojo;
import com.castelo.modelo.Pessoa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("ana");
        pessoa.setEndereco("rua cristao");
        pessoa.setIdade(20);


        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setIdade(pessoa.getIdade());
        pessoaPojo.setEndereco(pessoa.getEndereco());


        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.cadastrarPessoa(pessoaPojo);

        */

        Pessoa pessoa = new Pessoa();
        pessoa.setId(3);
        pessoa.setNome("ana");
        pessoa.setEndereco("rua cristao");
        pessoa.setIdade(20);


        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setId(pessoa.getId());
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setIdade(pessoa.getIdade());
        pessoaPojo.setEndereco(pessoa.getEndereco());


        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.deletarPessoa(pessoaPojo);
        
         
         



    }
}
