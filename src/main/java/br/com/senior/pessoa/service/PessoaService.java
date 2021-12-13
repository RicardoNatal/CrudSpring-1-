package br.com.senior.pessoa.service;

import br.com.senior.pessoa.entity.Pessoa;
import br.com.senior.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PessoaService {

    @Autowired
    private PessoaRepository repo;

    public Pessoa addPessoa(Pessoa pessoa) {
        return repo.save(pessoa);
    }

    public Pessoa updatePessoa(Pessoa pessoa) {
        return repo.save(pessoa);
    }

    public List<Pessoa> findAllPessoa() {
        return repo.findAll();
    }

    public List<Pessoa> findPessoaById(Long id) {
        return repo.findPessoaById(id);
    }

    public void deletePessoa(Long id) {
        repo.deleteById(id);
    }
}
