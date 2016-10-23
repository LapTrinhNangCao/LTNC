package mta.th12a.tuanhiep.model;
// Generated Oct 10, 2016 7:18:39 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ProductStores generated by hbm2java
 */
@Entity
@Table(name="PRODUCT_STORES"
    ,schema="dbo"
    ,catalog="LTNC_THOITRANG"
)
public class ProductStores  implements java.io.Serializable {


     private int productStoreId;
     private Integer productId;
     private Integer productColorId;
     private Integer productSizeId;
     private Integer quantity;
     private Double purchasePrice;
     private Double price;
     private Double sale;
     private String dayTrading;
     private String note;
     private Boolean isActive;

    public ProductStores() {
    }

	
    public ProductStores(int productStoreId) {
        this.productStoreId = productStoreId;
    }
    public ProductStores(int productStoreId, Integer productId, Integer productColorId, Integer productSizeId, Integer quantity, Double purchasePrice, Double price, Double sale, String dayTrading, String note, Boolean isActive) {
       this.productStoreId = productStoreId;
       this.productId = productId;
       this.productColorId = productColorId;
       this.productSizeId = productSizeId;
       this.quantity = quantity;
       this.purchasePrice = purchasePrice;
       this.price = price;
       this.sale = sale;
       this.dayTrading = dayTrading;
       this.note = note;
       this.isActive = isActive;
    }
   
     @Id 

     @GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
    @Column(name="Product_Store_ID", unique=true, nullable=false)
    public int getProductStoreId() {
        return this.productStoreId;
    }
    
    public void setProductStoreId(int productStoreId) {
        this.productStoreId = productStoreId;
    }

    
    @Column(name="Product_ID")
    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    
    @Column(name="Product_Color_ID")
    public Integer getProductColorId() {
        return this.productColorId;
    }
    
    public void setProductColorId(Integer productColorId) {
        this.productColorId = productColorId;
    }

    
    @Column(name="Product_Size_ID")
    public Integer getProductSizeId() {
        return this.productSizeId;
    }
    
    public void setProductSizeId(Integer productSizeId) {
        this.productSizeId = productSizeId;
    }

    
    @Column(name="Quantity")
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    
    @Column(name="Purchase_Price", precision=53, scale=0)
    public Double getPurchasePrice() {
        return this.purchasePrice;
    }
    
    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    
    @Column(name="Price", precision=53, scale=0)
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    
    @Column(name="Sale", precision=53, scale=0)
    public Double getSale() {
        return this.sale;
    }
    
    public void setSale(Double sale) {
        this.sale = sale;
    }

    
    @Column(name="Day_Trading", length=10)
    public String getDayTrading() {
        return this.dayTrading;
    }
    
    public void setDayTrading(String dayTrading) {
        this.dayTrading = dayTrading;
    }

    
    @Column(name="Note", length=200)
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    
    @Column(name="IsActive")
    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }




}


