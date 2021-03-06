/**
 * 

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*
*
 */

package project_Euler;


public class CollatzSequence {

	public static void main(String[] args) {
		long count;
		long index = 0, max = 0, n;
		for(int i = 837799 ; i<= 999999 ; i++){
			n = i;
			count = 1;
			
		//	System.out.print(n + "\t");
		
			while(n > 1){
				if((n % 2) == 0)
					n = n / 2;
				
				else
					n = (3 * n) + 1;
				
			//	System.out.print(n + "\t");
				count++;
				
			}
			if(count>max){
				max = count;
				index = i;
			}
				
		//	System.out.println("Total number in sequence is : " + count);
			
		}	
		
		System.out.println("The biggest number of sequence is : " + max + " And its position is : " + index);
	}
}
