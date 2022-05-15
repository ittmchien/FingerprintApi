package com.fingerprint.fingerprintapi;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilesCache {
    public static List<File> FILE_LIST;
    public FilesCache() {
        FILE_LIST = new ArrayList<>();
        File folder = new File("d:\\Project\\copyright");
        FILE_LIST.addAll(Arrays.asList(Objects.requireNonNull(folder.listFiles())));
    }

}
