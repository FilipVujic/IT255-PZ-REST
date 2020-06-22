/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author filip
 */
@Entity
@Table(name = "UserCart")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserCart.findAll", query = "SELECT u FROM UserCart u")
    , @NamedQuery(name = "UserCart.findByUserCartID", query = "SELECT u FROM UserCart u WHERE u.userCartID = :userCartID")
    , @NamedQuery(name = "UserCart.findByProductID", query = "SELECT u FROM UserCart u WHERE u.productID = :productID")
    , @NamedQuery(name = "UserCart.findByProductName", query = "SELECT u FROM UserCart u WHERE u.productName = :productName")
    , @NamedQuery(name = "UserCart.findByProductPrice", query = "SELECT u FROM UserCart u WHERE u.productPrice = :productPrice")
    , @NamedQuery(name = "UserCart.findByQuantity", query = "SELECT u FROM UserCart u WHERE u.quantity = :quantity")
    , @NamedQuery(name = "UserCart.findByUserID", query = "SELECT u FROM UserCart u WHERE u.userID = :userID")})
public class UserCart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userCartID")
    private Integer userCartID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "productID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "productName")
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "productPrice")
    private int productPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userID")
    private int userID;

    public UserCart() {
    }

    public UserCart(Integer userCartID) {
        this.userCartID = userCartID;
    }

    public UserCart(Integer userCartID, int productID, String productName, int productPrice, int quantity, int userID) {
        this.userCartID = userCartID;
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.userID = userID;
    }

    public Integer getUserCartID() {
        return userCartID;
    }

    public void setUserCartID(Integer userCartID) {
        this.userCartID = userCartID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userCartID != null ? userCartID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserCart)) {
            return false;
        }
        UserCart other = (UserCart) object;
        if ((this.userCartID == null && other.userCartID != null) || (this.userCartID != null && !this.userCartID.equals(other.userCartID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.UserCart[ userCartID=" + userCartID + " ]";
    }
    
}
