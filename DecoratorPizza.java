package DecoratorPattern;

public abstract class DecoratorPizza implements Pizza{
	Pizza pizza;
	
	public DecoratorPizza(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String bake() {
		// TODO Auto-generated method stub
		return pizza.bake();
	}

}
