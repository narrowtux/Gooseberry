package com.narrowtux.gooseberry.model;

import java.util.List;

/**
 * Represents a virtual file or a directory
 */
public interface GDirectoryEntry {
    /**
     * @return the name of this entry
     */
    public String getName();

    /**
     * @return the folder that contains this entry
     */
    public GFolder getParent();

    /**
     * @return a list of children, or null if not a folder
     */
    public List<GDirectoryEntry> getChildren();

    /**
     * @return the date when this entry has last been modified
     */
    public long getLastModified();
}
