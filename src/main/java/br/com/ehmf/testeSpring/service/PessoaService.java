package br.com.ehmf.testeSpring.service;

import br.com.ehmf.testeSpring.model.Pessoas;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaService {

    //Repositorio
    List<Pessoas> pessoas = new ArrayList<>();

    //listar todos as pessoas:
    public List<Pessoas> listAll(){
        return pessoas;
    }

    //Adicionar pessoa:
    public void addPessoa(Pessoas pessoa){
        pessoas.add(pessoa);
    }

    //Pesquisar pessoa por id:
    public Pessoas getPessoaById(int id){
        return pessoas.stream().filter(pessoa -> pessoa.getId() == id).findFirst().orElse(null);
    }

}
