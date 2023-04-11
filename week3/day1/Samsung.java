package week3.day1;

public class Samsung extends AndroidTv implements Android {

	public static void main(String[] args) {
		Samsung sam = new Samsung();
		sam.openApp();
		sam.watchVedio();
		
	}
	public void watchVedio() {
		System.out.println("playing vedios");

}
}