package com.app.voiceagent.service;

import org.springframework.ai.audio.transcription.TranscriptionModel;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class SpeechToTextService {

    private final TranscriptionModel transcriptionModel;

    public SpeechToTextService( TranscriptionModel transcriptionModel) {
        this.transcriptionModel = transcriptionModel;
    }

    public String transcribe(Resource audio) {

        return transcriptionModel.transcribe(audio);
    }
}
