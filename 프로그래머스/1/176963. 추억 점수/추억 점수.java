import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> yearningMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (String person : photo[i]) {
                // 현재 이름이 yearningMap에 있으면 점수를 더함
                sum += yearningMap.getOrDefault(person, 0);
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}