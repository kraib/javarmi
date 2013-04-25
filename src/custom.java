import java.util.Scanner;

public class custom extends Advertsing_plans {

	float amount;

	//set amount for custom  plan 
   public custom(){
	  //set amount
	   set_amount();
	  
	  super.price=amount;
   }
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "\nThis is your Custom plan offering only "+price+" dollars for Your Ad-plan\n";
	}
   private void set_amount(){
	   //validation flag
	   boolean i=false;
	//validation loop
	   while(i==false){
		   try  
		   {
    System.out.print("Please Enter The amont of money in your Ad plan");
	Scanner scanner = new Scanner(System.in);
    amount= scanner.nextInt();
	i=true;
		   }
		   catch(NumberFormatException nfe){
			//not number entered
			   i=false;   
			   
		   }
	   }
//end of loop
	   
	 
	   
	   }
}
