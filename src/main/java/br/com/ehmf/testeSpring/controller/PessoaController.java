package br.com.ehmf.testeSpring.controller;

import br.com.ehmf.testeSpring.model.Pessoas;
import br.com.ehmf.testeSpring.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    //service:
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @GetMapping("/listar")
    public List<Pessoas> listar(){
        return pessoaService.listAll();
    }

    @PostMapping("/adicionar")
    public void adicionar(@RequestBody Pessoas pessoa){
        pessoaService.addPessoa(pessoa);
    }

    @GetMapping("/{id}")
    public Pessoas getPessoaById(@PathVariable int id){
        return pessoaService.getPessoaById(id);
    }

}
