# task
  test first commit
  // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        // Implement your solution here
        int pairs = 0;
        int counts = 0;
        int startPoint = 0;

        // Get the sum without start heading WEST
        for(int i=0; i<A.length; i++){
            if(A[i]==1)continue;
            startPoint = i;
            for(int j=i; j<A.length; j++)
                if(A[j]==1) counts++; 
            break;         
        }
    
        for(int i=startPoint; i<A.length; i++){
            if(A[i]==0) { 
                pairs+=counts; 
                if(pairs > 1000000000) return -1;
                continue; 
            }
            counts--;
        }

        return pairs;                
    }
}
