class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        //answer = (M-1)+((N-1)*M);
        answer = (M*N)-1;
        return answer;
    }
}