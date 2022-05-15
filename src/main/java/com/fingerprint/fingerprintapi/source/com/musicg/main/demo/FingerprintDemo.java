/*
 * Copyright (C) 2012 Jacquet Wong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fingerprint.fingerprintapi.source.com.musicg.main.demo;


import com.fingerprint.fingerprintapi.source.com.musicg.wave.Wave;

public class FingerprintDemo{
	
	public static void main (String[] args){
		float counttrue=0;
		float countfalse=0;
		String filename = "./mnm-cover.wav";
		String filename2 = "./mnm-ly.wav";

		// create a wave object
		Wave wave = new Wave(filename);

		// get the fingerprint
		byte[] fingerprint=wave.getFingerprint();

		Wave wave2 = new Wave(filename2);

		// get the fingerprint
		byte[] fingerprint2=wave2.getFingerprint();

		// dump the fingerprint
//		FingerprintManager fingerprintManager=new FingerprintManager();
//		fingerprintManager.saveFingerprintAsFile(fingerprint, "out/"+filename+".fingerprint");
		
		// load fingerprint from file
//		byte[] loadedFp=fingerprintManager.getFingerprintFromFile("out/"+filename+".fingerprint");
		
		// fingerprint bytes checking
		float fingerprintLength = Math.min(fingerprint.length, fingerprint2.length);

		for (int i=0; i<fingerprintLength; i++){
			System.out.println(fingerprint[i]+" vs "+fingerprint2[i]);
			if(fingerprint[i]==fingerprint2[i]){
				counttrue++;
			}
			else{
				countfalse++;
			}
		}
		System.out.printf(" "+counttrue);
		System.out.printf(" "+countfalse);
	}
}