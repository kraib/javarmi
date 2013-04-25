public class cheap extends Advertsing_plans {
public static final float amount=100;
	
	//set amount for cheap  plan 
   public cheap(){
	
	super.price=amount;
    }	
	


	@Override
	public String description() {
		//to display
		return "\nThis is a cheep plan offering only 100 dollars for Your Ad-plan\n";
	}

}
