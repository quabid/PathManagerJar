package com.gmail.quabidlord.pathmanager;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PathValidatorTests {
    MyConstants constants = new MyConstants();
    PathValidator pathValidator = new PathValidator();

    @Test
    public void fileExistsShouldAnswerTrue() {
        constants.createFile();    
        assertTrue(pathValidator.pathExists(constants.testFile1));
        assertFalse(!pathValidator.pathExists(constants.testFile1));
    }
}
