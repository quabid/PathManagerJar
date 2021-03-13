package com.gmail.quabidlord.pathmanager.core;

import java.nio.file.Paths;

import com.gmail.quobod.fileinterrogator.core.FileInterrogator;

public class PathChecker {
    private final PathValidator pathValidator = new PathValidator();
    private final FileInterrogator fi = new FileInterrogator();

    public PathChecker() {
        super();
    }

    public final boolean isFile(String path) {
        if (pathValidator.pathExists(path)) {
            return Paths.get(path).toFile().isFile();
        }
        return false;
    }

    public final boolean isDirectory(String path) {
        if (pathValidator.pathExists(path)) {
            return Paths.get(path).toFile().isDirectory();
        }
        return false;
    }

    public final boolean isAbsolute(String path) {
        if (pathValidator.pathExists(path)) {
            return Paths.get(path).toFile().isAbsolute();
        }
        return false;
    }

    public final boolean isHidden(String path) {
        if (pathValidator.pathExists(path)) {
            return Paths.get(path).toFile().isHidden();
        }
        return false;
    }

    public final boolean isReadable(String path) {
        if (pathValidator.pathExists(path)) {
            fi.setFilePath(path);
            return fi.isReadable();
        }
        return false;
    }

    public final boolean isWritable(String path) {
        if (pathValidator.pathExists(path)) {
            fi.setFilePath(path);
            return fi.isWritable();
        }
        return false;
    }

    public final boolean isExecutable(String path) {
        if (pathValidator.pathExists(path)) {
            fi.setFilePath(path);
            return fi.isExecutable();
        }
        return false;
    }

    public final void fileStatus(String path) {
        if (pathValidator.pathExists(path)) {
            fi.setFilePath(path);
            fi.fileStatus();
        }        
    }
}
