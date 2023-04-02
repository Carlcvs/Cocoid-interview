package codoidinterview;

public class Reversethestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//We can reverse a string by using the built-in reverse() method, or by using a for loop to iterate through the 
		//string in reverse order and build a new string.
		
		
		/*public void usingbuffer() {
		String given = "carl";
				
				StringBuffer string= new StringBuffer();
				string.append(given);
				
				System.out.println(string.reverse());	
			}*/
		
		String given="lewis";
		char[] alpha =given.toCharArray();
		String reversed="";
	    for(int i=alpha.length-1;i>=0;i--){
	    reversed =reversed+alpha[i];}
	    System.out.println(reversed);
	}

		

		
	}


