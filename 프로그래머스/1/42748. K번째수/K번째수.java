import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int a = 0; a < commands.length; a++){
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];  

            int[] slicedArray = Arrays.copyOfRange(array, i-1, j);
            
            Arrays.sort(slicedArray);
            answer[a] = slicedArray[k-1];

        }
        return answer;
    }
}