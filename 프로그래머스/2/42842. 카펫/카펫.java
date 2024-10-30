class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = 0;
        int height = 0;
        int allRectangle = brown + yellow;
        double yellowSqrt = Math.sqrt(yellow); //sqrt는 double형을 반환
        
        if(yellowSqrt == (int)yellowSqrt){ //yellow가 정사각형인경우 
            width = (int)yellowSqrt + 2;
            height = (int)yellowSqrt + 2;
        }
        else{
            for(int i = yellow; i >= 1; i--){ // 정사각형이 아닌 경우 
                if(yellow % i == 0){
                    int yellowWidth = i;
                    int yellowHeight = yellow / i;
                    width = yellowWidth + 2;
                    height = yellowHeight + 2;
                    
                    if(width * height == brown + yellow)
                        break;
                }
            }
                
        }
        
        answer[0] = width;
        answer[1] = height;
        return answer;
    }
}