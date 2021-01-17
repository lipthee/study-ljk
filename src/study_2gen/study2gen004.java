package study_2gen;

import java.util.Scanner;

public class study2gen004 {

	 
    public static void main(String[] args) {

    	int a, b ;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	a = sc.nextInt() ;
    	
    	
    	b = sc.nextInt() ;
    	
    	
    	System.out.println (a + "+" + b + "=" + (a+b)
    			+ "\n" + a + "-" + b + "=" + (a-b)
    			+ "\n" + a + "*" + b + "=" + (a*b)
    			+ "\n" + a + "/" + b + "=" + (a/b)
    			+ "\n" + a + "%" + b + "=" + (a%b));
    	
    	
    }
 
}