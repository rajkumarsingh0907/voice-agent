package com.app.voiceagent.controller;

import com.app.voiceagent.dto.VoiceResponse;
import com.app.voiceagent.service.VoiceAgentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/voice")
public class VoiceController {

    private final VoiceAgentService voiceAgentService;

    public VoiceController( VoiceAgentService voiceAgentService) {
        this.voiceAgentService = voiceAgentService;
    }

    @PostMapping( value = "/chat", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public VoiceResponse chat(@RequestPart("audio") MultipartFile audio) throws IOException {
        return voiceAgentService.process( audio.getResource());
    }
}
