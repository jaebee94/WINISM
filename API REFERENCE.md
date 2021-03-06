[TOC]

# 1. USER

# 2.WINE

## 2.1 키워드 검색 (get/search/)

| Parameter | Type   | Description                    |
| --------- | ------ | ------------------------------ |
| keyword   | String | 검색어 (null일 경우 전체 검색) |
| page      | String | 페이지 (null일 경우 0페이지)   |

## 2.2 상세 검색(당도,산도,온도) - (post/search/)

## 2.3 상세 정보 (POST /search/detail)

| Parameter | Type    | Description   |
| --------- | ------- | ------------- |
| wid     | String  | 와인 id     |


`Response (Success)`

| Field   | Type    | Description |
| ------- | ------- | ----------- |
| wine | Object | 와인 정보(wine entity 확인) |
| image | String | 와인 사진 |

## 2.4 자동 완성 (POST /search/auto)

| Parameter | Type   | Description |
| --------- | ------ | ----------- |
| keyword   | String | 검색어      |


`Response (Success)`

| Field | Type | Description                        |
| ----- | ---- | ---------------------------------- |
| list  | List | 와인 정보(wine entity 확인) 리스트 |

## 2.5 와인 추천 (GET /recommend/contents)

`Request parameters`

| Parameter | Type   | Description |
| --------- | ------ | ----------- |
| userid    | String | 사용자 ID   |


`Response (Success)`

| Field | Type   | Description                 |
| ----- | ------ | --------------------------- |
| image | String | 사진 있을시 url 없을시 null |
| wine  | Object | 와인 object                 |

# 3. REVIEW



## 3.1 리뷰 작성 POST /review/register

`Request parameters`

| Parameter | Type    | Description   |
| --------- | ------- | ------------- |
| title     | String  | 리뷰 제목     |
| content   | String  | 리뷰 내용     |
| rating    | String  | 별점          |
| userid    | String  | 사용자 아이디 |
| winename  | String  | 와인 이름     |
| wid       | Integer | 와인 번호     |

`Response (Success)`

| Field   | Type   | Description |
| ------- | ------ | ----------- |
| success | String | 성공        |



## 3.2 사용자 리뷰 조회 POST /review/getbyid

`Request parameters`

| Field   | Type    | Description |
| ------- | ------- | ----------- |
| userid | String | 사용자 아이디        |

`Response (Success)`

| Parameter | Type   | Description   |
| --------- | ------ | ------------- |
| review     | Object | 리뷰 엔티티     |
| image     | String | 사진 url     |

## 3.3 와인 리뷰 조회 POST /review/getbywine

`Request parameters`

| Field   | Type    | Description |
| ------- | ------- | ----------- |
| wid | int | 와인 아이디 |


`Response (Success)`

| Parameter | Type   | Description   |
| --------- | ------ | ------------- |
| review     | Object | 리뷰 엔티티     |
| image     | String | 사진 url     |




## 3.4 리뷰 수정 POST /review/update

`Request parameters`

| Parameter | Type   | Description   |
| --------- | ------ | ------------- |
| rid     | int | 리뷰 고유번호     |
| title     | String | 리뷰 제목     |
| content   | String | 리뷰 내용     |
| rating    | String | 별점          |
| winename  | String | 와인 이름     |
| userid    | String | 사용자 아이디 |

`Response (Success)`

| Field   | Type   | Description |
| ------- | ------ | ----------- |
| success | String | 성공        |



## 3.5 리뷰 삭제 POST /review/delete

`Request parameters`

| Parameter | Type   | Description   |
| --------- | ------ | ------------- |
| rid     | int | 리뷰 고유번호     |

`Response (Success)`

| Field   | Type   | Description |
| ------- | ------ | ----------- |
| success | String | 성공        |

`Response (Fail)`

| Field   | Type    | Description |
| ------- | ------- | ----------- |
| fail | String | 이미 찜목록에 들어가있을경우 실패        |



# 4. FAVORITE LIST

## 4.1 찜 추가 POST /favorite/add

`Request parameters`

| Parameter | Type    | Description   |
| --------- | ------- | ------------- |
| uid     | String  | 사용자 아이디     |
| wid   | int  | 와인 아이디     |


`Response (Success)`

| Field   | Type   | Description               |
| ------- | ------ | ------------------------- |
| success | String | 있으면 빠지고 없으면 추가 |

## 4.2 찜 삭제 POST /favorite/remove

`Request parameters`

| Parameter | Type    | Description   |
| --------- | ------- | ------------- |
| fid   | int  | 찜 아이디     |
| uid     | String  | 사용자 아이디     |
| wid   | int  | 와인 아이디     |

`Response (Success)`

| Field   | Type   | Description |
| ------- | ------ | ----------- |
| success | String | 성공        |

## 4.3 찜 조회 POST /favorite/getbyid

`Request parameters`

| Parameter | Type    | Description   |
| --------- | ------- | ------------- |
| userid | String  | 사용자 아이디     |


`Response (Success)`

| Field   | Type    | Description |
| ------- | ------- | ----------- |
| wine | Object | 와인 정보 |
| image | String | 와인 사진 |




## 4.4 찜 확인 POST /favorite/check

`Request parameters`

| Parameter | Type    | Description   |
| --------- | ------- | ------------- |
| uid     | String  | 사용자 아이디     |
| wid | int | 와인 아이디 |

`Response (Success)`

| Field   | Type    | Description |
| ------- | ------- | ----------- |
| result | Boolean | true : 이미 찜 목록에 있음 false :  찜 목록에 없음 |








# ENTITY

## 1.WINE ENTITY

| Field   | Type    | Description |
| ------- | ------- | ----------- |
| wid | int | 와인 아이디 |
| koname | String | 와인이름(한글) |
| enname | String | 와인이름(영문) |
| komaker | String | 생산지(한글) |
| enmaker | String | 생산지(영문) |
| cost | String | 가격      |
| type | String | 와인 종류   |
| use | String | 용도      |
| laestdegree | String | 도수     |
| temperature | String | 음용온도     |
| capacity | String | 용량       |
| local | String | 생산국     |
| tannin | String | 타닌       |
| acidity | String | 산도       |
| sweetness | String | 당도       |
| body | String | 바디      |
| recommandation | String | 추천 음식    |
| grape | String | 포도 품종    |
| grade | String | 등급      |
| year | String | 생산연도     |



## 2.REVIEW ENTITY

| Parameter | Type   | Description                |
| --------- | ------ | -------------------------- |
| rid       | int    | 리뷰 고유번호              |
| title     | String | 리뷰 제목                  |
| content   | String | 리뷰 내용                  |
| rating    | String | 별점                       |
| winename  | String | 와인 이름                  |
| userid    | String | 사용자 아이디              |
| date      | String | 작성날짜(YYYY.MM.dd-HH.mm) |

















