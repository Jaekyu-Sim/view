package shop;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Orderlist_table")
public class Orderlist {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String orderStatus;
    private String productId;
    private Integer qty;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setOrderStatus(String orderStatus){ this.orderStatus = orderStatus;}
    public void setProductId(String productId){this.productId = productId;}
    public void setQty(Integer qty){this.qty = qty;}

    public String getOrderStatus(){return orderStatus;}
    public String getProductId(){return productId;}
    public Integer getQty(){return qty;}

}
