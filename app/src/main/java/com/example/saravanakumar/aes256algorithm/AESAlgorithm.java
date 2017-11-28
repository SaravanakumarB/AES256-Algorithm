package com.example.saravanakumar.aes256algorithm;

import android.util.Base64;

import org.cryptonode.jncryptor.AES256JNCryptor;
import org.cryptonode.jncryptor.CryptorException;
import org.cryptonode.jncryptor.JNCryptor;

/**
 * Created by saravanakumar on 28/11/17.
 */

public class AESAlgorithm {
        private static JNCryptor cryptor = new AES256JNCryptor();
        public static String encryptData(String data, String key) {
            byte[] decryptedData = data.getBytes();
            try {
                byte[] encryptedData = cryptor.encryptData(decryptedData, key.toCharArray());
                return new String(encryptedData);
            } catch (CryptorException e) {
                e.printStackTrace();
            }
            return null;
        }

        public static String decryptData(String data, String key) {
            try {
                byte[] encryptedData = Base64.decode(data,0);
                byte[] decryptedData = cryptor.decryptData(encryptedData, key.toCharArray());
                return new String(decryptedData);
            } catch (CryptorException e) {
                e.printStackTrace();
            }
            return null;
        }
}
