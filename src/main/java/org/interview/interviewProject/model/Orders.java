package org.interview.interviewProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne()
    private Customer customer;

    @ManyToOne()
    private Product product;

    @Column(columnDefinition = "Decimal", nullable = false)
    private Integer count;

    public Orders(Customer customer, Product product, Integer count) {
        this.customer = customer;
        this.product = product;
        this.count = count;
    }
}
