
public class EulerProblem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean isPalindrome (int number)
		 {
		        int palindrome = number; 
		        int reverse = 0;

		        while (palindrome != 0) 
		        {
		            int remainder = palindrome % 10;
		            reverse = reverse * 10 + remainder;
		            palindrome = palindrome / 10;
		        }

		       if (number == reverse)
		       {
		            return true;
		        }
		        return false;
		    }
	}

}
