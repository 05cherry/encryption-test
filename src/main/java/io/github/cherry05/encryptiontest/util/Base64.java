package io.github.cherry05.encryptiontest.util;

/**
 * @implNote 이미지나 첨부파일 등 이진데이터를 전송해야 할 때 많이 사용된다.
 *
 * 8비트의 이진데이터를 문자코드에 영향을 받지 않는 공통 ASCII 영역의 문자들로만 이루어진 일렬의 문자열로 바꾸는 인코딩 방식.
 * Base64는 64진법으로 64개의 문자를 사용하며, 일반적으로 62개의 영문자, 숫자, 그리고 '+'와 '/'를 사용한다.
 * 보통 문자는 8bit 로 구성되어있는데 Base64 로 암호화하기 위해서는 6bit 씩 끊어서 묶어야한다.
 * 묶는 과정의 편의를 위해 6과 8의 최소공배수인 24bit 로 끝어서 묶는다.
 *
 * 마지막 문자가 '=' 문자로 끝나거나, 64개의 문자만으로 구성되어 있다면 Base64 인코딩된 것으로 추측할 수 있다.
 *
 */
public class Base64 {
    public String encode(String text) {
        return java.util.Base64.getEncoder().encodeToString(text.getBytes());
    }

    public String decode(String encodedText) {
        byte[] decodedBytes = java.util.Base64.getDecoder().decode(encodedText);
        return new String(decodedBytes);
    }
}
