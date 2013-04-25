import java.util.Scanner;

public class display {
Engine engine;
Advertsing_plans  plan;

	public static void main (String[] args){
		//select engines
	display c = new display();
		c.choose_engine();
		//select plan
		c.choose_plan();
		//display clicks
       System.out.print("You will get "+c.plan.calculate_amount(c.engine)+" clicks for your plan"+c.plan.description()); 
	   
       //show live queries
       c.engine.live_queries();
	}
	
	
	public void choose_engine(){
	    //prompt user to enter the search engine
		System.out.println("Select The Search engine to advertise on \n a for Yahho \n b for Google \n c for Bing");
		Scanner scanner = new Scanner(System.in);
	    String Choice = scanner.nextLine();
	   //set search engine
	    select_engine(Choice);
	    //message to show search engine description
	    System.out.println(engine.description());
        	
	}
	//set the search engine
	public void  select_engine(String choice){
		if(choice.equals("a"))
			engine = new Yahoo();
	    else if(choice.equals("b"))
		    engine = new Google();
	    else if(choice.equals("c"))
		    engine = new Bing();
	    else {
	    	
	    	System.out.println("Invalid Choice"+choice);
	    	System.exit(0);
	    }
	}
	
	public void choose_plan(){
	    //prompt user to enter add plan
		System.out.println("Select The Advertisment Plan to use \n a for Cheep($100) \n b for Expensive($1000) \n c for Custom");
		Scanner scanner = new Scanner(System.in);
	    String Choice = scanner.nextLine();
	    select_plan(Choice);
	}
	public void  select_plan(String choice){
		if(choice.equals("a"))
			plan = new cheap();
	    else if(choice.equals("b"))
		    plan = new expensive();
	    else if(choice.equals("c"))
		    plan = new custom();
	    else {
	    	
	    	System.out.println("Invalid Choice");
	    	System.exit(0);
	    }
	}
}
