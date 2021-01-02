package lk.ijse.hibernate.crudOperation.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderItem_PK implements Serializable {
    private String oid;
    private String itemCode;
}
