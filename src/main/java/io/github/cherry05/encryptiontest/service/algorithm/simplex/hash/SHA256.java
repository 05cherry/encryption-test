package io.github.cherry05.encryptiontest.service.algorithm.simplex.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;

public class SHA256 {
    /**
     * @param input 해싱할 문자열
     * @return 해싱된 문자열을 16진수로 변환한 문자열
     * @throws NoSuchAlgorithmException
     */
    public String hash(String input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(input.getBytes());
        return bytesToHex_0(digest.digest());
    }

    /**
     * for 문으로 사용
     * @param hashedBytes 해싱된 바이트 배열
     * @return 16진수 문자열
     */
    private String bytesToHex_0(byte[] hashedBytes){
        StringBuilder builder = new StringBuilder();
        for (byte b : hashedBytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }

    /**
     * HexFormat 사용
     * @since Java 17+
     * @param hashedBytes 해싱된 바이트 배열
     * @return 16진수 문자열
     */
    private String bytesToHex_1(byte[] hashedBytes){
        return HexFormat.of().formatHex(hashedBytes);
    }

    /*
     * DatatypeConverter 사용
     * @since Java 8
     * @implNote  jakarta.xml.bind 모듈을 추가해야 함
     * @param hashedBytes 해싱된 바이트 배열
     * @return 16진수 문자열
     */
//    private String bytesToHex_2(byte[] hashedBytes){
//        return DatatypeConverter.printHexBinary(hashedBytes);
//    }
}
