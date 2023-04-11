package week3.day2;

public class Calculator {
	
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	public void add(int x, int y, int z) {
		System.out.println(x+y+z);
	}
    public void multiple(double x, double y) {
    	System.out.println(x*y);
    }
    public void multiple(float x, float y) {
    	System.out.println(x*y);
    }
	public static void main(String[] args) {
	     Calculator cal = new Calculator();
	     cal.add(10, 10);
	     cal.add(10, 10, 10);
	     cal.multiple(10, 10);
	     cal.multiple(10f, 10f);
		
	}

}
