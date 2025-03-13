package io.github.cherry05.encryptiontest.service.algorithm.duplex;

import io.github.cherry05.encryptiontest.service.algorithm.EncryptionAlgorithm;

public interface TwoWayAlgorithm extends EncryptionAlgorithm{
    String decrypt(String text);
}
