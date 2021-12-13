package br.com.senior.pessoa.controller;

import br.com.senior.pessoa.entity.Pessoa;
import br.com.senior.pessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PessoaController {

    @Autowired
    private PessoaService servo;

    @PostMapping
    public ResponseEntity<Pessoa> addPessoa(@RequestBody Pessoa pessoa) {
        Pessoa newPessoa = servo.addPessoa(pessoa);
        return new ResponseEntity<>(newPessoa, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Pessoa> updatePessoa(@RequestBody Pessoa pessoa) {
        Pessoa newPessoa = servo.updatePessoa(pessoa);
        return new ResponseEntity<>(newPessoa, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> getAll() {
        List<Pessoa> pessoas = servo.findAllPessoa();
        return new ResponseEntity<>(pessoas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Pessoa>> getById(@RequestBody Long id) {
        List<Pessoa> pessoa = servo.findPessoaById(id);
        return new ResponseEntity<>(pessoa, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deletePessoa(@PathVariable("id") Long id) {
    servo.deletePessoa(id);
    }
}
