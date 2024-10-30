import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);  //오름차순 정렬 후 큰 수부터 더함 
        int sum = 0;
        int answer = 0;
        
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) break;  // 예산 초과 시 종료
            answer++;
        }
        
        return answer;
    }
}