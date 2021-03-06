package com.gmail.quabidlord.pathmanager;

import java.nio.file.Paths;

public final class PathChecker {
    private final PathValidator pathValidator = new PathValidator();

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
}
