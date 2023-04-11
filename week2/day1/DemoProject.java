package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoProject {

	public static void main(String[] args) {
		ChromeDriver Chrome = new ChromeDriver();
		Chrome.get("https://www.facebook.com/login");
		
		EdgeDriver ed = new EdgeDriver();
		ed.get("http://leaftaps.com/opentaps/control/main");

	}

}
