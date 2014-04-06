package com.narrowtux.gooseberry.model.incremental;

import com.narrowtux.gooseberry.model.Backup;

public interface IncrementalBackup {
    /**
     * @return the backup this incremental backup relies on
     */
    public Backup getParent();
}
