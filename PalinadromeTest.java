package codoidinterview;

public class PalinadromeTest {

		// TODO Auto-generated method stub
		public static void palinadrometest(int number) {
			int reverse=0;
			int sum=0;
			int t;
			t=number;
			
			while(number>0) {
				reverse=number%10;
				sum=(sum*10)+reverse;
				number=number/10;
				
			}
			if(t==sum) {
				System.out.println("the number is palindrome");
			}	else {
					System.out.println("the number is not palindrome");
				}
			}
		

		public static void main(String[] args) {
			// TODO Auto-enerated method stub
			palinadrometest(343);
		}
		
		



	}

	
