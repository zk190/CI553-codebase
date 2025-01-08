package catalogue;


import java.io.Serializable;
import java.util.Collections;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket 
{
  
  
// overide the add method - write new add method which is in basket.java
	 @Override
	  public boolean add( Product pr )
	  {    
		 for(Product prInList: this ) {
			 if(prInList.getProductNum().equals(pr.getProductNum())) {
             int quantity = pr.getQuantity()+prInList.getQuantity();//update quantity 
             prInList.setQuantity(quantity); //update quantity 
             return (true); 
			 } //update quantity if this product number is equal to this product number
		 } // aceess products in the pr list
	    return super.add( pr );     // Call add in ArrayList + superclass 
	  }
}

