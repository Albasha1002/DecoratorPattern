package DecoratorPattern;

public class CheeseBurstPizza extends DecoratorPizza{

	
	
	public CheeseBurstPizza(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	public String bake() {
		return pizza.bake()+" "+addCheese();
	}
	public String addCheese() {
		return "add Cheesde";
	}

}
