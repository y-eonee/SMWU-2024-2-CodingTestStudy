import java.util.ArrayList;
import java.util.List;

class Solution{
    public int solution(String t, String p) {
        int answer = 0;
        int lengthOfp = p.length();
        List<String> partsOfString = new ArrayList<>();

        for (int i = 0; i <= t.length()-lengthOfp; i++) {
            partsOfString.add(t.substring(i, i + lengthOfp));
        }

        for (int i = 0; i<partsOfString.size();i++){
            if(Long.parseLong(partsOfString.get(i)) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }

}