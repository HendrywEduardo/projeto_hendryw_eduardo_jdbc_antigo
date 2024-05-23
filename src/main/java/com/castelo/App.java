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
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("pedro");
        pessoa.setEndereco("rua abc");
        pessoa.setIdade(18);


        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setIdade(pessoa.getIdade());
        pessoaPojo.setEndereco(pessoa.getEndereco());


        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.cadastrarPessoa(pessoaPojo);



        
    }
}
