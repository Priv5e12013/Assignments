package week3.day2;

public class FindCount {

	public static void main(String[] args) {
	       String sr = "Priyanka";
	       int count = 0;
	       sr.toCharArray();
	       for(int i=0; i<=sr.length()-1;i++) {
	    	   if(sr.charAt(i)=='a')
	    	   {
	    		   count++;
	    	   }
	       }
	       System.out.println("Occurence of a in the string: "+sr+" " +count);
	}

}
