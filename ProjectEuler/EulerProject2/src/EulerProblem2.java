
public class EulerProblem2 {
	public long fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else 
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}
	public static void main(String[] args) {
		long x= 0;
		EulerProblem2 E = new EulerProblem2();
		long fib =0;
		
		for (int i = 0; i <= 35; i++) {
			if((E.fibonacci(i))<4000000 && (E.fibonacci(i))%2==0) 
			{ System.out.print(E.fibonacci(i) + " ");
			x=x+E.fibonacci(i);
			}}
			System.out.println("the sum is"+ x);
	
	}
}
