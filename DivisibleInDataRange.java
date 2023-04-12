class Solution {
    public int solution(int A, int B, int K) {
        // Implement your solution here

        int upper = B/K;
        int lower = A%K==0?(A/K-1):A/K;
    
        
        return upper - lower;     
    }
}

public class DivisibleInDataDange{
}
