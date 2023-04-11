package week3.day2;

public class FindCharCount {

	public static void main(String[] args) {
		   String sr = "Testleaf";
	       int count = 0;
	       sr.toCharArray();
	       for(int i=0; i<=sr.length()-1;i++) {
	    	   if(sr.charAt(i)=='e')
	    	   {
	    		   count++;
	    	   }
	       }
	       System.out.println("Occurence of e in the string: "+sr+" " +count);
	}

	}

