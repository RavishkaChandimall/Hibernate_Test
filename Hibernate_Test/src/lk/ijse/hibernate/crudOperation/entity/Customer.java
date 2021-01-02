package lk.ijse.hibernate.crudOperation.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ABCD")
public class Customer {
    @Id
    @Column(name = "cusID")
    private String id;
    private String name;
    private String address;
    private double salary;
    @OneToMany(mappedBy = "customer")
    private List<Orders> orders = new ArrayList<>();


}
