package io.github.ademilsonb.domain.repository;

import io.github.ademilsonb.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
