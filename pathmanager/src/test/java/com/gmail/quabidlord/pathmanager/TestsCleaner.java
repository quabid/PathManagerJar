package com.gmail.quabidlord.pathmanager;

import java.io.PrintStream;

public class TestsCleaner {
    final static MyConstants constants = new MyConstants();
    final static PathValidator pathValidator =new PathValidator();
    final static PathRemover pathRemover = new PathRemover();
    final static PrintStream printer = new PrintStream(System.out);

    public static void main(String[] args) {       
        if (pathValidator.pathExists(constants.cleanupSerializedPath)) {
            printer.println("About to delete file " + constants.cleanupSerializedPath + "."); 
            pathRemover.removePath(constants.cleanupSerializedPath);
            printer.println("File " + constants.cleanupSerializedPath + " deleted.");
        } /* else {
            printer.println("Cannot find file " + constants.cleanupSerializedPath + ".");
        }  */    

        if (pathValidator.pathExists(constants.cleanupTest1Path)) {
            printer.println("About to delete file " + constants.cleanupTest1Path + "."); 
            pathRemover.removePath(constants.cleanupTest1Path);
            printer.println("File " + constants.cleanupTest1Path + " deleted.");
        } /* else {
            printer.println("Cannot find file " + constants.cleanupTest1Path + ".");
        } */
    }
}
