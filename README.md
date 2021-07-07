# Mari_Board_JPA_MyBatis
## 기능
- 회원제 게시판
## 프로젝트 목적
- Spring data JPA를 활용하기
- Spring Security를 커스터마이징하기
- 피드백을 받고 지속적으로 개선하기
## 신경 쓴 점
- url이 아니라, controller의 메서드 별로 보다 상세한 접근제어 처리
- view에서의 접근제어
- get, post mapping 모두 접근제어
- 로그인 한 유저가 또 로그인 페이지를 부를경우 -> 다른 화면을 보여주기
- 권한이 없는 유저의 페이지 request -> access Error 페이지로 강제이동 시키기
- 로그아웃 시 세션 함께 삭제
- 필요없는 resources를 삭제하여 빌드 속도 개선 (38s -> 2s)
## 피드백 후 개선한 점
- JPA는 물론, MyBatis또한 활용가능한 어플리케이션으로 개선.

보다 다양한 요구사항에 대처할 수 있으며, 이기종 ORM의 장점을 둘 다 살릴 수 있도록 구현.

JPA의 간결성 + xml을 통한 수정 배포의 용이성 구현.
- 어노테이션으로 postMapping 의 접근제어 + 자바코드로 db에서 해당 유저 정보를 한번 더 확인하여 보안 강화
