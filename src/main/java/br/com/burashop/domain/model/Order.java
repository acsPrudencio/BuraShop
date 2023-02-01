package br.com.burashop.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_order")
public class Order extends GenericModel{
    private Long idClient;
    private Long IdShoppingCart;
}
