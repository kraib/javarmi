
public class Bing implements Engine {
	final int price_perclick=8;
	@Override
	public float calculate_plan(float money) {
		//to calculate money
		return money/price_perclick;
	}



	@Override
	public String description() {
		//to display information about the engine
		return "This best search engine for this edge(Bing)";
	}



	@Override
	public void live_queries() {
	       int i = 1676876868;
	       int randomNum; 
	
	         while (i>0){
	        	 randomNum = 1676 + (int)(Math.random()*1676); 
	          System.out.print("\r Live vistors on Bing"+i);
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