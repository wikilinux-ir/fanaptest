package q3;

public class GreaterThan <T extends Number> implements UnaryPredicate<Integer>{

	private int compareWith ;
	
	public GreaterThan(int num) {
		
			compareWith = num;
	}
	
	


	public boolean test(Integer x) {

		if(x > compareWith ) return true;
		
		return false;
	}

	
	
	
	

}
