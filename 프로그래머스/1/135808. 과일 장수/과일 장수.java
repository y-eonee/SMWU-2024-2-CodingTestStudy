import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        //score 배열 오름차순 정렬
        Arrays.sort(score); 
        
        int count=0; // m번마다 이익 계산 실행을 위한 변수 
        for(int i = score.length -1; i >= m-1; i--){ //최대 이익을 위해 뒤에서부터 실행 
            if(count % m == 0){ 
                answer += (score[i-m+1] * m);//상자 내 최저 점수 * m 
            }
            count++;
        }
        return answer;
    }
}