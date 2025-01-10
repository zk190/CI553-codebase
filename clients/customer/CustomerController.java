package clients.customer;

/**
 * The Customer Controller
 * from lines 34 we wrote a method to get name and then return a number
 */

public class CustomerController
{
  private CustomerModel model = null;
  private CustomerView  view  = null;

  /**
   * Constructor
   * @param model The model 
   * @param view  The view from which the interaction came
   */
  public CustomerController( CustomerModel model, CustomerView view )
  {
    this.view  = view;
    this.model = model;
  }

  /**
   * Check interaction from view
   * @param pn The product number to be checked
   */
  public void doCheck( String pn )
  {
    model.doCheck(pn); //calls model 
  }

  public void doCheckByName( String name)
  {
	  NameToNumber nameToNumber = new NameToNumber();
	  String pn= nameToNumber.getNumberByName(nameToNumber, name); //before we check by number we get the name need to create object of this helper class
	  model.doCheck(pn);
  }
  /**
   * Clear interaction from view
   */
  public void doClear()
  {
    model.doClear();
  }

  
}

