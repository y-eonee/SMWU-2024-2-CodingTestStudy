#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

char* solution(const char* cards1[], size_t cards1_len, const char* cards2[], size_t cards2_len, const char* goal[], size_t goal_len) {
    // 두 카드 뭉치의 인덱스 초기화
    size_t index1 = 0;
    size_t index2 = 0;

    // goal 배열을 순회하며 확인
    for (size_t i = 0; i < goal_len; i++) {
        // 현재 goal 단어가 cards1의 다음 단어와 일치하면 cards1 인덱스 증가
        if (index1 < cards1_len && strcmp(goal[i], cards1[index1]) == 0) {
            index1++;
        }
        // 현재 goal 단어가 cards2의 다음 단어와 일치하면 cards2 인덱스 증가
        else if (index2 < cards2_len && strcmp(goal[i], cards2[index2]) == 0) {
            index2++;
        }
        // 둘 다 일치하지 않으면 만들 수 없음
        else {
            char* answer = (char*)malloc(3);
            strcpy(answer, "No");
            return answer;
        }
    }

    // 모든 단어를 성공적으로 사용하여 goal을 만들 수 있으면 "Yes" 반환
    char* answer = (char*)malloc(4);
    strcpy(answer, "Yes");
    return answer;
}