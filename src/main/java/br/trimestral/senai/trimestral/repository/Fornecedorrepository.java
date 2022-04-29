package br.trimestral.senai.trimestral.repository;

import br.trimestral.senai.trimestral.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface Fornecedorrepository {
    @Repository
    public interface ClienteRepository extends JpaRepository<Fornecedor, Long> {

        public Fornecedor findBynome(String nome);
        public Fornecedor findByemail(String email);
        public List<Fornecedor> findBytelefone(String tefefone);
    }
}
