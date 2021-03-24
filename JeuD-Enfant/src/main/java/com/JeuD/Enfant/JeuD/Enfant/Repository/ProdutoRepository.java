package com.JeuD.Enfant.JeuD.Enfant.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JeuD.Enfant.JeuD.Enfant.Model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByTituloContainingIgnoreCase(String titulo);
}
