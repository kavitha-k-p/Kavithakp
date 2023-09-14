package github;

import java.util.Scanner;

public class evenandodd {

	
	
		public static void main(String[] args) {
		    Scanner in= new(System.in);
		    
			System.out.print("Enter the value of n: ");
			int n = in.nextInt();
			
			int sum=0, num = 1;
			
			for(int count=1; count<=n; ){
			    //if num is even then increment 'count'
			    if(num%2 == 0){
			        sum += num;
			        count++;
			    }
			    num++;
			}
			
			System.out.println("Sum: "+sum);
		}
	}



	    