package practice;

public class Palindrome {

	public boolean isPalindrome(int x) {
        int sum =0;
        int orig = x;
        while(x != 0){
            sum = sum *10 + x % 10;
            x/= 10;
        }
        System.out.println(sum);
        if(sum != orig){return false ;} 
            else {return true;}
    }
	
	public int reverse(int x) {
        int sum =0;
        while(x !=0){
            int x1 = x % 10;
            x/= 10;
            sum = sum * 10+ x1;
        }
        return sum;
        
    }
}
