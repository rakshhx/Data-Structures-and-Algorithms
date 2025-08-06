//1. Odd or Even

class Solution {
    static boolean isEven(int n) {
        if(n%2==0) return true;
        else return false;
    }
}

//2. Last Digit in a Number

//3. Count the number of digits in n that divide n evenly

class Solution {
    static int evenlyDivides(int n) {
        int count =0;
        int num=0;
        int temp = n;
        while(n>0){
            num=n%10;
            if(num != 0){
            if(temp%num == 0) count=count+1;
            }
            n=n/10;
        }
        return count;
    }
}

//4. Reverse of a number

class Solution {
    public int reverseDigits(int n) {
        int temp = n;
        int rem =0;
        int rev=0;
        while (n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return rev;
    }
}

//5. Power of a number

class Solution {
    public int reverseExponentiation(int n) {
        int temp = n;
        int rem=0;
        int rev=0;
        while(n>0){
            rem = n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        int ans=1;
        for(int i=0;i<rev;i++){
            ans= ans*temp;
        }
        return ans;
    }
}

//6. Greatest Common Divisor

class Solution {
    public static int gcd(int a, int b) {
        while (b!=0){
            int temp =b;
            b=a%b;
            a = temp;
        }

        return a;
    }
}

//7. Print all divisors of a number 

class Solution {
    public static void print_divisors(int n) {
        for(int i=1; i<=n;i++){
            if(n%i ==0)  System.out.print(i+" ");
            continue;
        }
    }
}

//8. Prime Number

class Solution {
    static boolean isPrime(int n) {
        int count =0;
        for(int i=1; i<=n/2;i++){
            if(n%i==0) count=count+1;
        }
        if(count>=2) return false;
        else return true;
    }
}

//9. Armstrong Number

class Solution {
    static boolean armstrongNumber(int n) {
        int temp=n;
        int digit=0;
        int num=0;
        for(int i=0;i<3;i++){
            digit= n%10;
            num=num+(digit*digit*digit);
            n=n/10;
        }
        if(num==temp) return true;
        else return false;
    }
}

//10. Palindromes

class Solution {
    public boolean isPalindrome(int n) {
        int temp=n;
        int rev=0, rem=0;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if (rev== temp) return true;
        else return false;
    }
}

//11. Square root of a number

//12. Perfect Number

