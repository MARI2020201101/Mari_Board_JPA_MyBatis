# :small_blue_diamond:Mari_Board_JPA_MyBatis
***
## ver. 02
- 회원제 게시판
## 프로젝트 목적
- Spring data JPA를 활용하기
- Spring Security를 커스터마이징하기
- 피드백을 받고 지속적으로 개선하기
***
### 작성자가 아닐경우
![작성자가 아닐경우](https://github.com/MARI2020201101/Mari_Board_JPA_MyBatis/blob/master/user!%3Dwriter.png)

### 작성자 or 관리자일 경우
![작성자 or 관리자일 경우](https://github.com/MARI2020201101/Mari_Board_JPA_MyBatis/blob/master/user%3D%3Dwriter.png)
***
## 신경 쓴 점
- URL 하드코딩 대신 Controller의 메서드 별 독립적 접근제어 처리
- 다양한 경우의 수의 접근제어 설계 : 인증X , 권한X / 인증O, 권한X / 인증O, 권한O
- view에서의 접근제어
- get, post mapping 모두 접근제어
- 로그인 한 유저가 또 로그인 페이지를 부를경우 -> 다른 화면을 보여주기
- 권한이 없는 유저의 페이지 request -> access Error 페이지로 강제이동 시키기
- 로그아웃 시 세션 함께 삭제
- 필요없는 resources를 삭제하여 빌드 속도 개선 (38s -> 2s)
- 게시글 등록시 아이디를 임의로 조작하지 못하도록 세션에서 유저네임을 파라메터로 받기
## 피드백 후 개선한 점
- JPA는 물론, MyBatis또한 활용가능한 어플리케이션으로 개선.

  이기종 ORM의 장점을 둘 다 살려서 다양한 상황에 대처할 수 있도록 대비.

  JPA의 간결성 + xml을 통한 수정 배포의 용이성 구현.
- 어노테이션으로 postMapping 의 접근제어 + 자바코드로 db에서 해당 유저 정보를 한번 더 확인하여 보안 강화

