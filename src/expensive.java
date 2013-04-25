public class expensive extends Advertsing_plans {
public static final float amount=1000;
	
	//set amount for cheap  plan 
   public expensive(){
	
	super.price=amount;
    }	
	

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "\nThis is a Royal plan offering only 1000 dollars for Your Ad-plan\n";
	}

}
