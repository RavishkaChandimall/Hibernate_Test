package lk.ijse.hibernate.crudOperation.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {
    @Id
    private String code;
    private String description;
    private int qtyOnHand;
    private double unitPrice;

    @OneToMany(mappedBy = "item")
    private List<OrderDetails> orderDetails = new ArrayList<>();


    public Item() {
    }
}
