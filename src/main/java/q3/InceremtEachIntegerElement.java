package q3;

public class InceremtEachIntegerElement <T extends Number> implements UnaryFunction<Integer,Integer>{

	

	public Integer function(Integer x) {
		return ++x;
	}

	
}
