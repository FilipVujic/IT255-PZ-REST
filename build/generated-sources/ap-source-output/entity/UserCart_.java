package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T16:35:50")
@StaticMetamodel(UserCart.class)
public class UserCart_ { 

    public static volatile SingularAttribute<UserCart, Integer> quantity;
    public static volatile SingularAttribute<UserCart, Integer> userCartID;
    public static volatile SingularAttribute<UserCart, Integer> userID;
    public static volatile SingularAttribute<UserCart, String> productName;
    public static volatile SingularAttribute<UserCart, Integer> productPrice;

}