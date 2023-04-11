package week3.day1;

public class Automation extends MultipleLanguage implements Language  {

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.python();
		auto.ruby();
		auto.Java();
		auto.Selenium();
		
	}
	public void Java() {
		System.out.println("I learning java");
	}
    public void Selenium() {
    	System.out.println("I Learning Selenium");
    	
    }
}
