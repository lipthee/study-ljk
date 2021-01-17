package study_2gen;

import java.util.Scanner;

public class study2gen005 {

	 
    public static void main(String[] args) {

    	double a, b ;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	a = sc.nextInt() ;
    	
    	
    	b = sc.nextInt() ;
    	
    	
    	System.out.printf ("%.2f", (a*b/2));
    	// 솔직히 위에 %.2f가 잘 이해되지는 않았음 , 소수점 n자리까지 반올림하기 https://coding-factory.tistory.com/250
    	
    }
 
}