package org.interview.interviewProject.model;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 500, columnDefinition = "VARCHAR(500)")
    private String description;

    @Column(length = 100, nullable = false, columnDefinition = "CHAR(100)" )
    private String email;

    @Column(length = 100, columnDefinition = "VARCHAR(100)")
    private String firstName;

    @Column
    private String lastName;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Orders> orders;


    public Customer(String description, String email, String firstName, String lastName, Set<Orders> orders) {
        this.description = description;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.orders = orders;
    }
}
