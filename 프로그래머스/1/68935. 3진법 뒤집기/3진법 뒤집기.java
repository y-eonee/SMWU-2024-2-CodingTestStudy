import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> thirdFormation = new ArrayList<>();
        
        while(n >= 3){
            thirdFormation.add(n % 3);
            n = n / 3;
        }
        thirdFormation.add(n); //마지막에 남은 수 추가 
        
        int digits = thirdFormation.size() - 1;
        for(int thirdNum : thirdFormation){
            int exponent = (int)Math.pow(3, digits); //10진법으로 다시 전환
            answer += thirdNum * exponent;
            digits--; //자릿수 하나 감소
        }
        
        return answer;
    }
}