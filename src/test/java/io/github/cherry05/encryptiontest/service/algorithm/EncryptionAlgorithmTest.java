package io.github.cherry05.encryptiontest.service.algorithm;

import io.github.cherry05.encryptiontest.service.algorithm.duplex.TwoWayAlgorithm;
import io.github.cherry05.encryptiontest.service.algorithm.simplex.hash.SHA256;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class EncryptionAlgorithmTest {
    static Stream<EncryptionAlgorithm> provideAlgorithm() throws Exception {
        return Stream.of(
                new SHA256()
        );
    }

    @ParameterizedTest
    @MethodSource("provideAlgorithm")
    void testEncryption(EncryptionAlgorithm algorithm){
        String input = "Twin, twin, twinYou and I we drifted apart";
        String output = algorithm.encrypt(input);

        System.out.println("input: " + input);
        System.out.println("output: " + output);

        assertNotNull(output);
        assertNotEquals(input, output);

        if (algorithm instanceof TwoWayAlgorithm) { // 단방향 해시는 복호화 불가
            String decrypted = ((TwoWayAlgorithm) algorithm).decrypt(output);
            assertEquals(input, decrypted);
        }
    }
}
