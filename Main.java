package DecoratorPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizza=new Jalepano(new CheeseBurstPizza(new BasePizza()));
		
		System.out.println(pizza.bake());

	}

}
