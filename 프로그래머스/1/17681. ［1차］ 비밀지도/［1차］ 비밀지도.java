class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        //arr1, arr2를 2진수 바꿈 
        //두개를 or연산으로 해서 리턴 
        for(int i=0; i < n; i++){
            String arr1Binary = Integer.toBinaryString(arr1[i]);
            String arr2Binary = Integer.toBinaryString(arr2[i]);
            answer[i] = BinaryOR(arr1Binary, arr2Binary, n);
        }
        return answer;
    }
    
    public String BinaryOR(String binaryString1, String binaryString2, int n){
        String decodeString = "";
        
        //최대 길이에 맞춰 0으로 formatting
        binaryString1 = String.format("%" + n + "s", binaryString1).replace(' ', '0');
        binaryString2 = String.format("%" + n + "s", binaryString2).replace(' ', '0');
        
        for(int i = 0; i < binaryString1.length(); i++){
            if(binaryString1.charAt(i) == '1' || binaryString2.charAt(i) == '1'){
                decodeString += "#";
            }
            else{
                decodeString += " ";
            }
        }
        return decodeString;
    }
}