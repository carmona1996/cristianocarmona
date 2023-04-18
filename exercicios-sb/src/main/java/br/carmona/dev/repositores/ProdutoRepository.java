package br.carmona.dev.repositores;

import org.springframework.data.repository.CrudRepository;


import br.carmona.dev.entities.Produto;


public interface ProdutoRepository 
extends CrudRepository<Produto, Integer> {

}
