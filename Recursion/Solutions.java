//RECURSION

//47.	Print 1 to N using recursion

class Solution {
    public void printNos(int n) {
        if(n==0) return;
        printNos(n-1);
                System.out.print(n+" ");

    }
}

//48.	Factorial of N numbers

class Solution {
    static int factorial(int n) {
        if(n<1) return 1;
        return n*factorial(n-1);
    }
}

//49.	Fibonacci series using recursion

class Solution {
    public int nthFibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        
        return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
}

//50.	Power(x,n)  ( find the value of n raised to the power of its own reverse )

class Solution {
	static int reverse(int n) {
		int rem=0,rev=0;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		return rev;
	}

	static int power(int n, int x) {
		if(x==0) return 1;

		return n*power(n,x-1);
	}

	public int reverseExponentiation(int n) {
		return power(n, reverse(n));
	}
}

//51.	Print pattern


//52.	Recursive implementation of atoi


//53.	Pascal triangle

