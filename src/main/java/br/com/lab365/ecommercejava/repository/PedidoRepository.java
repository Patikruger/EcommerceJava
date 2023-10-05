package br.com.lab365.ecommercejava.repository;

import br.com.lab365.ecommercejava.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {


    Object findByStatusOrderByDataPedidoDesc(Integer status);
}
