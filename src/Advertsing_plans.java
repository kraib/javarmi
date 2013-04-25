public abstract class Advertsing_plans {
float price;

//calculate price based on search engine
public float calculate_amount(Engine x){
	
	return x.calculate_plan(price);
	}
public abstract String description();
}
