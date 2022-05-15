package com.fingerprint.fingerprintapi;

import com.fingerprint.fingerprintapi.source.com.musicg.fingerprint.FingerprintSimilarity;
import com.fingerprint.fingerprintapi.source.com.musicg.wave.Wave;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class FingerprintService {
    public static final FingerprintService INST = new FingerprintService();

    public Resp check(InputStream file) {
        Resp resp = new Resp();
        File folder = new File("d:\\Project\\copyright");
        Wave check = new Wave(file);
        AtomicBoolean isChecked = new AtomicBoolean(false);
//        ExecutorService executorService = Executors.newFixedThreadPool(2);

            for (File f : folder.listFiles()) {
//                executorService.execute(() -> {
                try {
                    Wave w = new Wave(new FileInputStream(f));
                    FingerprintSimilarity similarity = w.getFingerprintSimilarity(check);
                    if (similarity.getSimilarity() > 0.5) {
                        isChecked.set(true);
                        resp.setExisted(true);
                        resp.setName(f.getName());
//                    return resp;
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }


            }
//        });
//        }
//        executorService.shutdown();
//        try {
//            while (!executorService.awaitTermination(120, TimeUnit.SECONDS) || isChecked.get()) {
//                executorService.shutdownNow();
//                break;
//            }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        return resp;
    }
}
