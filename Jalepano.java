package DecoratorPattern;

public class Jalepano extends DecoratorPizza{
 
	public Jalepano(Pizza pizaa) {
		super(pizaa);
		// TODO Auto-generated constructor stub
	}
	public String bake(){
		return pizza.bake()+" "+Jalpano();
	}
	public String Jalpano() {
		return "Jalpano";
	}

}
