package io.github.ademilsonb.service;

import io.github.ademilsonb.domain.entity.Pedido;
import io.github.ademilsonb.domain.enums.StatusPedido;
import io.github.ademilsonb.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
