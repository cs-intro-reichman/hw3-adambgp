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
		if(x2<0){
			for(int i=0 ; i< (-x2) ; i++){
               ans--;
		}
		}else{
		for(int i=0 ; i< x2 ; i++){
               ans++;
		}
	   }
		return ans;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		int ans = x1;
		if(x2<0){
			for(int i=0 ; i< (-x2) ; i++){
               ans++;
		}
		}else{
		for(int i=0 ; i< x2 ; i++){
               ans--;
		}
	    }
		return ans;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int ans =0;
	    int absx1;
		int absx2;
    if (x1 < 0) {
        absx1 = minus(0, x1); 
    } else {
        absx1 = x1;
    }
    if (x2 < 0) {
        absx2 = minus(0, x2); 
    } else {
        absx2 = x2;
    }
		for(int i=0 ; i< absx2 ; i++){
              ans = plus(ans,absx1);
		}
		if ((x1 < 0) && (x2 < 0)){
			return ans;
		}else if((x1 < 0) || (x2 < 0)){
			return minus(0, ans);
		}else{
			return ans;
		}
	    }
	

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int ans = 1;

		if(n==0){
			return 1;
		}else if(n<0 || x==0){
			return 0;
		}
		int absx;
			if(x<0){
				absx=minus(0, x);
			}else{
				absx=x;
			}
			for(int i=0 ; i< n ; i++){
              ans = times(ans, absx);
		}
		if(x<0&& mod(n, 2)!=0){
			return (minus(0, ans));
		}
		else{
		
		return ans;
		}
	  }
	

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int ans=0;
		
        int absx1;
		int absx2;
    if (x1 < 0) {
        absx1 = minus(0, x1); 
    } else {
        absx1 = x1;
    }
    if (x2 < 0) {
        absx2 = minus(0, x2); 
    } else {
        absx2 = x2;
    }
		int n= absx1;
		if(absx2==0){
			return 0;
		 }
		   while( n>=absx2){
			n= minus(n,absx2);
			ans++;
		   }
		   if ((x1 < 0) && (x2 < 0)){
			return ans;
		}else if((x1 < 0) || (x2 < 0)){
			return minus(0, ans);
		}else{
			return ans;
		}
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
    if (x < 0) return 0;
    else if (x == 0) return 0;
    else if (x == 1) return 1;
    else{
    int low = 1;
    int high = div(x, 2); 
    int ans = 1; 

    while (low <= high) {
        int mid = plus(low, div(minus(high, low), 2)); 
        int midSqrt = times(mid, mid);
        
        
        if (midSqrt < 0) {
            high = minus(mid, 1);
        }

       else if (midSqrt == x) {
            return mid; 
        } else if (midSqrt < x) {
            ans = mid;
            low = plus(mid, 1);
        } else {
            high = minus(mid, 1);
        }
    }
    
    return ans; 
}  
	}
}