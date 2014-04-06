package com.narrowtux.gooseberry.model;

import java.io.InputStream;

/**
 * A virtual file, consisting of a base file and n incremental patch files
 *
 * To read the virtual file as if it were a real file, use open and read from the returned input stream.
 */
public interface GFile extends GDirectoryEntry {
    /**
     * Opens the virtual file for reading
     * @return an input stream for the virtual file
     */
    public InputStream open();
}
