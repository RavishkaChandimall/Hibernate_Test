package lk.ijse.hibernate.crudOperation.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Orders {
    @Id
    private String oid;
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderDetails> orderDetails = new ArrayList<>();

}
