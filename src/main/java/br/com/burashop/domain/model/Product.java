package br.com.burashop.domain.model;

import br.com.burashop.domain.enums.CategoryEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Data
@Table(name = "tb_product")
public class Product extends GenericModel{
    @Column(length = 50)
    private String name;
    @Column(length = 10)
    private BigDecimal price;
    @Column(length = 20)
    private CategoryEnum category;
    private BigInteger quantity;
}
