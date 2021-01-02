package lk.ijse.hibernate.crudOperation.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails {
    @EmbeddedId
    private OrderItem_PK orderItme_PK;
    private int qty;
    private double unitPrice;

    @ManyToOne
    @JoinColumn(name = "oid", referencedColumnName = "oid", insertable = false, updatable = false)
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "itemCode", referencedColumnName = "code", insertable = false, updatable = false)
    private Item item;
}
