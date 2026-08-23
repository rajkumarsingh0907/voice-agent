package com.app.voiceagent.service;

import org.springframework.ai.audio.tts.TextToSpeechModel;
import org.springframework.stereotype.Service;

@Service
public class TextToSpeechService {

    private final TextToSpeechModel textToSpeechModel;

    public TextToSpeechService( TextToSpeechModel textToSpeechModel) {
        this.textToSpeechModel = textToSpeechModel;
    }

    public byte[] generateSpeech(String text) {
        return textToSpeechModel.call(text);
    }

}
