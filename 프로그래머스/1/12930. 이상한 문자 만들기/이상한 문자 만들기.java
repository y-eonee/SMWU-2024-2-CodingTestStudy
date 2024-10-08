import java.lang.StringBuilder;

class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        StringBuilder lowerToUpperSb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                lowerToUpperSb.append(' ');
                index = 0;
            }
            else{
                if(index % 2 == 0){
                    char lowerToUpper = s.charAt(i);
                    char upperChar = Character.toUpperCase(lowerToUpper);
                    lowerToUpperSb.append(Character.toString(upperChar));
                }
                else{
                    char UpperToLower = s.charAt(i);
                    char lowerChar = Character.toLowerCase(UpperToLower);
                    lowerToUpperSb.append(Character.toString(lowerChar));
                }
                index ++;
            }
        }
        answer = lowerToUpperSb.toString();
        return answer;
    }
}