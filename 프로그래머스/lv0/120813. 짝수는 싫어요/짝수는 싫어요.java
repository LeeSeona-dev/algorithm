import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        
        // for(int i = 0; i<n ; i++){
        //     if(i<=n && i%2==1){
        //         answer[i] = i ;
        //     }
        // }
         for(int i = 0; i < n ; i++){
            if(i%2 == 0){
                answer[i] = i+1;
            }
        }
        // 0 값 제거
        answer = Arrays.stream(answer).filter(num -> num != 0).toArray();
        
        return answer;
    }
}