package com.gmail.quabidlord.pathmanager;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PathRemoverTests {
    PathRemover pathRemover = new PathRemover();
    MyConstants constants = new MyConstants();
    
    @Test
    public void shouldReturnTrue() throws InterruptedException {
        constants.createFile();
        Thread.sleep(1700);
        assertTrue(pathRemover.removePath(constants.testFile1));
        assertFalse(pathRemover.removePath(constants.testFile1));
    }
}
