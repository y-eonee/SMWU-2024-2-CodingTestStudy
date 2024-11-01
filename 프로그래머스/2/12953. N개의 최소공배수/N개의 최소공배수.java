import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        Arrays.sort(arr);
        int maxNum = arr[arr.length-1]; 
        
        for(int i = 2; i <= maxNum; i++){
            boolean canDevide = false;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] != 1 && arr[j] % i == 0){
                    arr[j] = arr[j] / i; //i를 나눈 값으로 배열을 업데이트
                    canDevide = true;
                }
            }
            
            if(canDevide){
                answer *= i;
                i--; //i로 나누어떨어지면 계속 나눌수 있게 함 
            }
                    
        }
        
        for(int num : arr){
            answer *= num;
        }
        
        return answer;
    }
}