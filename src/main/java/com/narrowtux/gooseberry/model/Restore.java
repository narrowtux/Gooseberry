package com.narrowtux.gooseberry.model;

import java.io.File;

public interface Restore {
    /**
     * @return the status of this restore
     */
    public Status getStatus();

    /**
     * @return the location to restore to
     */
    public File getTarget();

    /**
     * @return the backup that is being restored
     */
    public Backup getBackup();
}
