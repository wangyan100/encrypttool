package com.dbsystel.cloudia;

public class EnDeCrypt {
	
	public static String encrypt(String seed,String plaintext) {
		org.jasypt.encryption.pbe.StandardPBEStringEncryptor encryptor = new org.jasypt.encryption.pbe.StandardPBEStringEncryptor();
		encryptor.setPassword(seed);
		return encryptor.encrypt(plaintext);
		
	}
	
	public static String decrypt(String seed,String ciphertext) {
		org.jasypt.encryption.pbe.StandardPBEStringEncryptor decryptor = new org.jasypt.encryption.pbe.StandardPBEStringEncryptor();
		decryptor.setPassword(seed);
		return decryptor.decrypt(ciphertext);
		
	}
	
	public static void main(String args[]) {
		System.out.println("encrypt <seed> <plaintext>");
		System.out.println("decrypt <seed> <ciphertext>");
		
		if(args[0].equalsIgnoreCase("encrypt")) {
			System.out.println("encrypted plaintext as below ");
			System.out.println(encrypt(args[1],args[2]));
		}
		
		if(args[0].equalsIgnoreCase("decrypt")) {
			System.out.println("decrypted ciphertext as below ");
			System.out.println(decrypt(args[1],args[2]));
		}
	}
}
