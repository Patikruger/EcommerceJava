package br.com.lab365.ecommercejava.repository;

import br.com.lab365.ecommercejava.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {


}
