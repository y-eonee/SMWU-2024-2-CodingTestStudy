public class Solution {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0; // cards1의 현재 위치
        int index2 = 0; // cards2의 현재 위치

        for (String word : goal) {
            // cards1의 현재 단어와 goal 단어가 일치하면 index1 증가
            if (index1 < cards1.length && word.equals(cards1[index1])) {
                index1++;
            }
            // cards2의 현재 단어와 goal 단어가 일치하면 index2 증가
            else if (index2 < cards2.length && word.equals(cards2[index2])) {
                index2++;
            }
            // 둘 다 일치하지 않으면 goal을 구성할 수 없음
            else {
                return "No";
            }
        }

        // 모든 단어를 성공적으로 사용하여 goal을 만들 수 있으면 "Yes" 반환
        return "Yes";
    }
}
