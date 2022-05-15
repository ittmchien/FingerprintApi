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


import com.fingerprint.fingerprintapi.source.com.musicg.fingerprint.FingerprintSimilarity;
import com.fingerprint.fingerprintapi.source.com.musicg.wave.Wave;

public class FingerprintRecognitionDemo {

	public static void main(String[] args) {

//		String songA = "audio_work/songs/canon_d_major.wav";
//		String songB = "audio_work/songs/fing_fing_ha.wav";
//		String songC = "audio_work/songs/forrest_gump_theme.wav";
//		String songD = "audio_work/songs/imagine.wav";
//		String songE = "audio_work/songs/top_of_the_world.wav";
//		String song = "./lyrics.wav";
//		String songl = "./lyrics1.wav";
//		String song1 = "./audio-test.wav";
//		String song2 = "./audio-test2.wav";
//		String song3 = "./audio-test5.wav";
//		String song4 = "./audio-test6.wav";
//		String song5 = "./audio-test7.wav";
		String mnmmv = "./mnm-mv.wav";
		String mnmly = "./mnm-ly.wav";
		String mnmco = "./mnm-cover.wav";
//		String att = "./att-mv.wav";
//		String attco = "./att-cover.wav";
//		String huong = "./huong.wav";
//		String huongremix = "./huongremix.wav";



		// create a wave object
//		Wave waveA = new Wave(songA);
//		Wave waveB = new Wave(songB);
//		Wave waveC = new Wave(songC);
//		Wave waveD = new Wave(songD);
//		Wave waveE = new Wave(songE);
//		Wave wave = new Wave(song);
//		Wave wavel = new Wave(songl);
//		Wave wave1 = new Wave(song1);
//		Wave wave2 = new Wave(song2);
//		Wave wave3 = new Wave(song3);
//		Wave wave4 = new Wave(song4);
//		Wave wave5 = new Wave(song5);
		Wave w1 = new Wave(mnmmv);
		Wave w2 = new Wave(mnmly);
		Wave w3 = new Wave(mnmco);
//		Wave w4 = new Wave(att);
//		Wave w5 = new Wave(attco);
//		Wave w6 = new Wave(huong);
//		Wave w7 = new Wave(huongremix);

//		String recordedClip = "audio_work/songs/top_of_the_world_rec.wav";
//		String recordedClip1 = "./mv.wav";
//		Wave waveRec = new Wave(recordedClip);
//		Wave waveRec1 = new Wave(recordedClip1);

		FingerprintSimilarity similarity;

//		similarity = w7.getFingerprintSimilarity(w6);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ huong+" with similarity " + similarity.getSimilarity());
		similarity = w2.getFingerprintSimilarity(w1);
		System.out.println("clip is found at "
				+ similarity.getsetMostSimilarTimePosition() + "s in "
				+ mnmly+" with similarity " + similarity.getSimilarity());

		similarity = w3.getFingerprintSimilarity(w1);
		System.out.println("clip is found at "
				+ similarity.getsetMostSimilarTimePosition() + "s in "
				+ mnmco+" with similarity " + similarity.getSimilarity());

		similarity = w3.getFingerprintSimilarity(w2);
		System.out.println("clip is found at "
				+ similarity.getsetMostSimilarTimePosition() + "s in "
				+ mnmmv+" with similarity " + similarity.getSimilarity());

//		similarity = w3.getFingerprintSimilarity(w2);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ mnmco+" with similarity " + similarity.getSimilarity());

//		similarity = wave.getFingerprintSimilarity(waveRec1);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ song+" with similarity " + similarity.getSimilarity());
//
//		similarity = wavel.getFingerprintSimilarity(waveRec1);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ songl+" with similarity " + similarity.getSimilarity());
//
//		similarity = wave.getFingerprintSimilarity(wavel);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ song+" with similarity " + similarity.getSimilarity());

//		similarity = wave1.getFingerprintSimilarity(wave2);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ song1+" with similarity " + similarity.getSimilarity());

//		similarity = wave3.getFingerprintSimilarity(wave4);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ song3+" with similarity " + similarity.getSimilarity() + song4);
//
//		similarity = wave3.getFingerprintSimilarity(wave5);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ song3+" with similarity " + similarity.getSimilarity() + song5);
//
//		similarity = wave4.getFingerprintSimilarity(wave3);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ song4+" with similarity " + similarity.getSimilarity() + song3);
//
//		similarity = wave4.getFingerprintSimilarity(wave5);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ song4+" with similarity " + similarity.getSimilarity() + song5);
//
//		similarity = wave5.getFingerprintSimilarity(wave3);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ song5+" with similarity " + similarity.getSimilarity() + song3);
//
//		similarity = wave5.getFingerprintSimilarity(wave4);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ song5+" with similarity " + similarity.getSimilarity() + song4);

//		// song A:
//		similarity = waveA.getFingerprintSimilarity(waveRec);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ songA+" with similarity " + similarity.getSimilarity());
//
//		// song B:
//		similarity = waveB.getFingerprintSimilarity(waveRec);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ songB+" with similarity " + similarity.getSimilarity());
//
//		// song C:
//		similarity = waveC.getFingerprintSimilarity(waveRec);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ songC+" with similarity " + similarity.getSimilarity());
//
//		// song D:
//		similarity = waveD.getFingerprintSimilarity(waveRec);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ songD+" with similarity " + similarity.getSimilarity());
//
//		// song E:
//		similarity = waveE.getFingerprintSimilarity(waveRec);
//		System.out.println("clip is found at "
//				+ similarity.getsetMostSimilarTimePosition() + "s in "
//				+ songE+" with similarity " + similarity.getSimilarity());
	}
}