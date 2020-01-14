package com.flyscale.fdkaac;

public class AudioEncoder {

	public native void encode(String pcmPath, int audioChannels, int bitRate, int sampleRate, 
			String aacPath);
	
}
