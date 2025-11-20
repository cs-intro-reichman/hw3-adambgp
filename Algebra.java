// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		int ans = x1;
		for(int i=0 ; i< x2 ; i++){
               ans++;
		}
		return ans;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		int ans = x1;
		for(int i=0 ; i< x2 ; i++){
               ans--;
		}
		return ans;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int ans =0;
		for(int i=0 ; i< x2 ; i++){
              ans = plus(ans,x1);
		}
		return ans;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int ans = 1;
		if(n==0){
			return 1;
		}
		for(int i=0 ; i< n ; i++){
              ans = times(ans, x);
		}
		return ans;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int ans=0;
		int n= x1;
         if(x2==0){
			return 0;
		 }
		   while( n>=x2){
			n= minus(n,x2);
			ans++;
		   }
           return ans;
		}
	

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		 if(x2==0){
			return 0;
		 }
		 int ans= minus(x1,times(div(x1,x2),x2));
		return ans;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		if(x==0){
			return 0;
		 }
		 int ans= 1;
		 int stop_x;
		while (true) { 
			int ans2 = ans++;
			int res2= times(ans2,ans2);
			if (res2<x){
				ans = ans2;
			}
			if(res2>x){
				return ans;
			}
			if(res2==x){
				return ans2;
			}
			stop_x = res2;
		} 
            
	}
}