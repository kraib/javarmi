
public class Yahoo implements Engine {

	final int price_perclick=12;
	
	public float calculate_plan(float money) {
	
		return money/price_perclick;
	}

	


	
	public String description() {
	
		return "This best search engine for this edge(Yahoo)";
	}


	public void live_queries() {
	       int i = 1676876868;
	       int randomNum; 
	      
	         while (i>0){
	        	 randomNum = 1676 + (int)(Math.random()*1676); 
	          System.out.print("\r Live vistors on Yahoo "+i);
	          try {
	           i= i+randomNum;
	            Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
	           }
	           catch (InterruptedException e) {
	               //I don't think you need to do anything for your particular problem
	           }
	}


	}
}
