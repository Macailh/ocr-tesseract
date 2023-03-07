package com.salvadorgerman.ocrtesseract.controller;

import com.salvadorgerman.ocrtesseract.service.TesseractOcrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class OcrController {

    @Autowired
    private TesseractOcrService tesseractOcrService;

    @PostMapping("/ocr")
    public String recognizeText(@RequestParam("file") MultipartFile file) throws IOException {
        return tesseractOcrService.recognizeText(file.getInputStream());
    }
}
