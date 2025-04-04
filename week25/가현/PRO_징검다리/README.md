## 1. 문제 설명

- 출발지점부터 도착지점까지의 거리(distance)와 그 사이에 놓여 있는 바위(rocks)가 주어집니다.
- 바위 중 일부를 제거했을 때, 출발지점부터 도착지점까지의 각 구간 거리의 최솟값을 최대화하려 합니다.

### 예시

`distance = 25` <br/>
`rocks = [2, 14, 11, 21, 17]`<br/>
`n = 2`

제거한 바위의 위치에 따라 가능한 거리의 최솟값:

- 바위 [21, 17] 제거 시: [2, 9, 3, 11] → 최소 거리 2
- 바위 [2, 14] 제거 시: [11, 6, 4, 4] → 최소 거리 4
- 최종 답: 4

## 2. 풀이 방법

이진 탐색을 활용

## 3. 풀이 단계

### 1. 입력 데이터 정렬

- 바위 배열 rocks를 오름차순으로 정렬합니다.
- 출발지점(0)과 도착지점(distance)을 포함한 전체 거리를 기준으로 처리합니다.

### 2. 탐색 범위 설정

- 가능한 거리의 최소값(low)은 1, 최대값(high)은 distance로 설정합니다.

### 3. 이진 탐색 반복

- mid를 현재 최소 거리 후보로 설정합니다.
- 각 바위를 순회하며, 인접 바위 간 거리가 mid보다 작으면 바위를 제거합니다.
- 제거된 바위의 개수(removed)가 n보다 크면 high를 줄이고, 작거나 같으면 low를 늘립니다.

### 4. 최적화된 거리 계산

removed ≤ n일 때의 mid 값을 저장하고 더 큰 최소 거리를 탐색합니다.

## 4. 시간 복잡도

- 바위 정렬: `O(len(rocks) * log(len(rocks)))`
- 이진 탐색: `O(log(distance))`
- 탐색 내 거리 계산: `O(len(rocks))`
- 총 시간 복잡도:
  `O(len(rocks) * log(len(rocks)) + len(rocks) * log(distance))`

```
* 일반적인 식으로 표현 시
바위 정렬: O(n log n)
이진 탐색과 거리 계산: O(n log m)
총 시간 복잡도: O(n log n + n log m),
여기서 n은 바위의 개수, m은 거리의 최대값입니다.
```
