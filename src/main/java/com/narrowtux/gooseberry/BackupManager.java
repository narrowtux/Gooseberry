package com.narrowtux.gooseberry;

import com.narrowtux.gooseberry.model.Backup;
import com.narrowtux.gooseberry.model.GFolder;

import java.io.File;

public class BackupManager {
    private File source;
    private File target;
    private boolean followSymlinks = false; // TODO


    public BackupManager(File source, File target) {
        this.source = source;
        this.target = target;
    }

    public Backup doFullBackup() {
        return null;
    }

    public Backup doIncrementialBackup() {
        return null;
    }

    public Backup getLastBackup() {
        return null;
    }
}
