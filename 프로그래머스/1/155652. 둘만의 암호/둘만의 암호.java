class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(char charS : s.toCharArray()){
            int count = 0;
            while(count < index){
                charS++;
                if(charS > 122){
                    charS = (char)(charS - 122 + 96); //z 이상의 값인 경우 변환
                }
                if(!skip.contains(String.valueOf(charS))){
                    count++;
                }
            }
            
            answer += charS;
        }
        return answer;
    }
}