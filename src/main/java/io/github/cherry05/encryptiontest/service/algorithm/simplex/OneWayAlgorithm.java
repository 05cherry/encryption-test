package io.github.cherry05.encryptiontest.service.algorithm.simplex;

import io.github.cherry05.encryptiontest.service.algorithm.EncryptionAlgorithm;

public interface OneWayAlgorithm extends EncryptionAlgorithm{
    @Override
    default String encrypt(String text){
        return hash(text);
    }
    String hash(String text);
}
