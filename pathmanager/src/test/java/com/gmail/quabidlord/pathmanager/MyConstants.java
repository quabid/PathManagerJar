package com.gmail.quabidlord.pathmanager;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.nio.file.FileSystems;

public class MyConstants {
    public final String OS = System.getProperty("os.name").toLowerCase();
    public final String OS_ARCH = System.getProperty("os.arch").toLowerCase();
    public final String OS_VERSION = System.getProperty("os.version").toLowerCase();
    public final String FILESEPARATOR = FileSystems.getDefault().getSeparator();
    public final String LINESEPARATOR = System.getProperty("line.separator");
    public final String USRDIR = System.getProperty("user.dir") + FILESEPARATOR;
    public final String USRHOME = System.getProperty("user.home") + FILESEPARATOR;
    public final String destinationPath = USRDIR + "serialized.ser";
    public final String cleanupSerializedPath = USRDIR + "pathmanager" + FILESEPARATOR + "serialized.ser";
    public final String cleanupTest1Path = USRDIR + "pathmanager" + FILESEPARATOR + "test1.txt";
    public final String testFile1 = USRDIR + "test1.txt";
    public final String testFile2 = USRDIR + "test2.txt";
    public final PrintStream printer = new PrintStream(System.out);

    public final void createFile() {
        TestObject obj = new TestObject(testFile1, testFile2);
        try {
            FileOutputStream fos = new FileOutputStream(testFile1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            // ioe.printStackTrace();
            return;
        }

    }

    public final void createFile(String destinationPath,String data) {
        TestObject to = new TestObject();
        if (null == data || data.length() == 0) {
            to.setDatum("Bullshit file data");
        } else {
            to.setDatum(data);
        }
        try {
            FileOutputStream fos = new FileOutputStream(destinationPath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(to);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            // ioe.printStackTrace();
            return;
        }

    }

    public final void createFile(String destinationPath,String[] data) {
        TestObject to = new TestObject();
        if (null == data || data.length == 0) {
            to.setDatum("Bullshit file data");
        } else {
            to.setDatum(data);
        }
        try {
            FileOutputStream fos = new FileOutputStream(destinationPath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(to);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            // ioe.printStackTrace();
            return;
        }

    }

    class TestObject {
        String[] datum = new String[2];

        public TestObject(String d1, String d2) {
            super();
            datum[0] = d1;
            datum[1] = d2;
        }

        public TestObject() {
            super();
        }

        public final void setDatum(String strData) {
            switch (datum.length) {
                case 0:
                    datum[0] = strData;
                    break;

                default:
                    int size = datum.length;
                    datum[size] = strData;
                    break;
            }
        }

        public final void setDatum(String[] strData) {
            switch (datum.length) {

                default:
                    datum = strData;
                    break;
            }
        }
    }

}
