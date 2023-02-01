package br.com.burashop.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_address")
public class Address extends GenericModel{
    @Column(length = 50)
    private String street;
    @Column(length = 30)
    private String district;
    private Integer number;
    @Column(length = 8)
    private String cep;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
