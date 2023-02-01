package br.com.burashop.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Data
@MappedSuperclass
public class GenericModel  implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 36)
    private UUID uuid;

    public GenericModel() {
        super();
        this.uuid = UUID.randomUUID();
    }
}
