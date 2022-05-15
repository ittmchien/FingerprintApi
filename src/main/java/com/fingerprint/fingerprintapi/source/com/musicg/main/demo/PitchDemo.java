package com.fingerprint.fingerprintapi.source.com.musicg.main.demo;

import com.fingerprint.fingerprintapi.source.com.musicg.wave.extension.Spectrogram;
import com.fingerprint.fingerprintapi.source.com.musicg.processor.TopManyPointsProcessorChain;
import com.fingerprint.fingerprintapi.source.com.musicg.wave.Wave;
import com.fingerprint.fingerprintapi.source.com.musicg.wave.extension.Spectrogram;

public class PitchDemo{
	
	public static void main(String[] args){
		
		String filename = "audio_work/cock_a_1.wav";

		// create a wave object
		Wave wave = new Wave(filename);
		Spectrogram spectrogram = new Spectrogram(wave);
		
		TopManyPointsProcessorChain processorChain=new TopManyPointsProcessorChain(spectrogram.getNormalizedSpectrogramData(),1);
		double[][] processedIntensities=processorChain.getIntensities();
		
		for (int i=0; i<processedIntensities.length; i++){
			for (int j=0; j<processedIntensities[i].length; j++){
				if (processedIntensities[i][j]>0){
					System.out.println(i+": "+processedIntensities[i][j]);
				}
			}
		}
	}
}