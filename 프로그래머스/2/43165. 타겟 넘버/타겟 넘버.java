class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int index, int currentSum) {
        // 모든 숫자를 처리한 경우
        if (index == numbers.length) {
            // 현재 합이 타겟과 같으면 1 반환 (방법 하나 추가)
            return currentSum == target ? 1 : 0;
        }
        
        // 현재 숫자를 더하거나 빼는 두 가지 경우로 재귀 호출
        int add = dfs(numbers, target, index + 1, currentSum + numbers[index]);
        int subtract = dfs(numbers, target, index + 1, currentSum - numbers[index]);
        
        // 두 경우에서 얻은 결과를 합산
        return add + subtract;
    }
}