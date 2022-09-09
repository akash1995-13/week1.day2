package week1.day2;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] textSplit = text.split(" ");
		
		for (int i=0;i<textSplit.length;i++)
		{
			for(int j=0;j<textSplit.length;j++)
			{
				if(textSplit[i].equals(textSplit[j]))
				
					count++;
				
			}
				if(count>1) {
					text=text.replace(textSplit[i]," ");
					
				}
				count=0;
			
			}
			System.out.println(text);		
		}
	}

 
