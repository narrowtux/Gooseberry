package com.narrowtux.gooseberry.model;

import java.io.File;

/**
 * Represents a backup made at some point
 */
public interface Backup {
    /**
     * @return the date of creation of the backup
     */
    public long getDate();

    /**
     * @return if this backup is a full backup
     */
    public boolean isFullBackup();

    /**
     * @return the base folder of the backup
     */
    public GFolder getBase();

    /**
     * @return the base folder of the source of the backup
     */
    public File getSource();

    /**
     * @return the status of the backup
     */
    public Status getStatus();

    /**
     * Restores the backup to the given directory
     * @param to location to where this backup should be restored
     * @return an instance of the restore task, for further handling
     */
    public Restore restore(File to);
}
