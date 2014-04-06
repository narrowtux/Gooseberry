package com.narrowtux.gooseberry.model;

import java.util.List;

/**
 * A virtual folder
 */
public interface GFolder extends GDirectoryEntry {
    /**
     * @return a list of files inside the directory
     */
    public List<GFile> getFiles();

    /**
     * @return a list of folders inside the directory
     */
    public List<GFolder> getDirectories();
}
