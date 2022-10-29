package org.interview.interviewProject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 100, columnDefinition = "VARCHAR(100)", nullable = false)
    private String name;

    @Column(columnDefinition = "Double", nullable = false)
    private Long price;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<Orders> orders;


    public Product(String name, Long price, Set<Orders> orders) {
        this.name = name;
        this.price = price;
        this.orders = orders;
    }
}
