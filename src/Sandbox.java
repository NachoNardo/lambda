
public class Sandbox {

	public static void main(String[] args) {
		
			iCalc add = new Add();
			iCalc mult = new Multiply();
			
			iCalc calc = (x, y) -> {
				return x + y;
			};
			
			iCalc calc2 = (x, y) -> {
				return x * y;
			};
			
			System.out.println("Traditional way: ");
			System.out.println(add.execute(2, 2));
			System.out.println("Using lambda: ");
			System.out.println(calc.execute(2, 2));
			System.out.println("Traditional way: ");
			System.out.println(mult.execute(3, 3));
			System.out.println("Using lambda: ");
			System.out.println(calc2.execute(3, 3));
		
	}

}
