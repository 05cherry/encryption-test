단방향 알고리즘
=================


## 특정 클래스

### 1. MessageDigest
    - JAVA 에서 단방향 해시 함수 값을 구할 때 사용한다.
    - 비밀번호 및 특정 정보를 암호화하여 저장하고 싶을 때
    - 파일의 유효성을 해시 값을 통해 확인하고 싶을 때
   1. getInstance() : `MD5, SHA-256, SHA512`를 대입할 경우 대입한 MessageDigest Object 를 작성한다.
   파라미터로 받는 알고리즘은 NoSuchAlgorithmException 때문에 try / catch 로 감싸줘야 한다.
   2. update() : 데이터를 해시(다이제스트를 갱신)한다
   3. digest() : 바이트 배열로 해시를 반환하고 적은 데이터일 경우 digest 에 직접 입력 가능하다.
### 2. 
