package com.fingerprint.fingerprintapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;


@RestController
public class FileUploadController {
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/upload")
    public ResponseEntity<FileUploadResponse> uploadFile(@RequestParam("file") MultipartFile multipartFile) {
        long size = multipartFile.getSize();
        FileUploadResponse response = new FileUploadResponse();
        try {
            InputStream inputStream = multipartFile.getInputStream();
            Resp check = FingerprintService.INST.check(inputStream);
            response.setFileName(check.name);
            response.setIsExisted(check.isExisted);
            response.setSize(size);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
