package exp.customexception;

public class Myown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new Customexception("myown");
		} catch (Exception e) {
			System.out.println("caught");
		}
	}

}
