package study_2gen;

import java.util.Scanner;

public class study2gen003 {

	 
    public static void main(String[] args) {

    	int a, b, c ;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	a = sc.nextInt() ;
    	
    	
    	b = sc.nextInt() ;
    	
    	c = a ;
    	a = b ;
    	b = c ;
    	
    	
    	System.out.println ("입력\n" + a + " " + b + "\n출력\n" + a + " " + b);
    	
    	
    }
 
}