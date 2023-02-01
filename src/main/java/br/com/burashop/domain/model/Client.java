package br.com.burashop.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_client")
public class Client extends GenericModel{
    private String nome;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @Column(length = 11)
    private String cpf;
}
