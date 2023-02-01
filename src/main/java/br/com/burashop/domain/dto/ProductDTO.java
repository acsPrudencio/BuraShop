package br.com.burashop.domain.dto;

import br.com.burashop.domain.enums.CategoryEnum;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private String name;
    private BigDecimal price;
    private CategoryEnum category;
    private BigInteger quantity;
}
