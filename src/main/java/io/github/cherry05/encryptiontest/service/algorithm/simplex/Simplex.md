단방향 알고리즘
=================


특정 클래스
-----
1. MessageDigest
2. (1) getInstance() : MD5, SHA-256, SHA512를 대입할 경우 대입한 메시지 다이제스트 오브젝트를 작성한다.
파라미터로 받는 알고리즘은 NoSuchAlgorithmException 때문에 try / catch로 감싸줘야 한다.
(2) update() : 데이터를 해시(다이제스트를 갱신)한다
(3) digest() : 바이트 배열로 해시를 반환하고 적은 데이터일 경우 digest에 직접 입력 가능하다.
2. 