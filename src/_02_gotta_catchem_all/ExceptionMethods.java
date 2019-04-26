package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public double divide(int x, int y) {
		
		if(y == 0) {
			throw new IllegalArgumentException();
		}
		
		return x/y;
	}
	
	public String reverseString(String s) {
		
		if(s.length() == 0) {
			throw new IllegalStateException();
		}
		
		String x = "";
		for (int i = s.length()-1; i >= 0; i--) {
			x+= s.substring(i, i+1);
		}
		
		
		return x;
	}
	
	
}
