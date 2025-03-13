package io.github.cherry05.encryptiontest.service.algorithm.simplex;

import io.github.cherry05.encryptiontest.service.algorithm.simplex.hash.SHA256;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
@SpringBootTest
public class SHA512Test {

    @Autowired
    private SHA256 sha256;
    @Test
    void 해싱(){
        String input = "Twin, twin, twinYou and I we drifted apart";
        String output = sha256.encrypt(input);

        log.debug("input: {}", input);
        log.debug("output: {}", output);

        assertThat(output.length()).isEqualTo(64);
    }
}