import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] solves = new int[3];
        int[] solve1 = new int[] {1, 2, 3, 4, 5};
        int[] solve2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] solve3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        solves[0] = countCorrectAnswers(answers, solve1);
        solves[1] = countCorrectAnswers(answers, solve2);
        solves[2] = countCorrectAnswers(answers, solve3);
        
        // 가장 많이 맞힌 수포자 수에 따라 배열 생성을 위해 정답자 카운트 
        int maxScore = Math.max(solves[0], Math.max(solves[1], solves[2]));
        int answerPerson = 0 ;
        for(int score : solves){
            if(score == maxScore)
                answerPerson ++;
        }
        
        // 가장 많이 맞힌 수포자를 answer 배열에 추가 
        answer = new int[answerPerson];
        int index = 0; // answer 배열 인덱스 관리 변수 
        for(int i = 0; i < solves.length; i++){
            if(solves[i] == maxScore)
                answer[index++] = i + 1;
        }
            
        
        return answer;
    }
    
    private int countCorrectAnswers(int[] answers, int[] solve){
        int[] answerResult = new int[answers.length];
        Arrays.fill(answerResult, Integer.MIN_VALUE);
        int count = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answerResult[i] < 0){ 
                if(answers[i] == solve[i % solve.length]){
                    answerResult[i] = 1;
                    count++;   
                }
                else
                    answerResult[i] = 0;
            }
        }
        
        return count;

    }
    
    
  
}