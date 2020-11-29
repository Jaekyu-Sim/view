
package shop;

public class Ordered extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String orderStatus;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductId() {
        return productId;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public Integer getQty() { return qty;
    }

    public void setStatus(String status) { this.orderStatus = orderStatus;}
    public String getStatus() { return orderStatus;}
}
