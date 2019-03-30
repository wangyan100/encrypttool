package org.tool;

import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;

public class BaseDeEnCryptUtil {
    public void encode(String plaintext){
        byte[] encodedBytes = Base64.encodeBase64("Test".getBytes());
        System.out.println(new String(encodedBytes));
    }

    public void decode(String ciphertext){
        byte[] decodedBytes = Base64.decodeBase64(ciphertext.getBytes());
        System.out.println("decodedBytes " + new String(decodedBytes));
    }
}


