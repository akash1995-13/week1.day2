package week1.day2;

public class Changeoddindexofuppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test ="nevergiveup";
		 char[] chars = test.toCharArray();{
			 for(int i=0;i< chars.length;i++)
			 {
				 char c = chars[i];
				 if(i % 2 != 0) {
					 c=Character.toUpperCase(c);
					 
				 }
				 System.out.print(c); 
		 }

		 }	 

		}

	}

 
