package com.epam.mjc.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class FileReader {

    public Profile getDataFromFile(File file) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("D://mjcSchoolTrainingFromEpamProjects2/stage1-module6-io-task1/src/main/resources/Profile.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
             try {
                if (inputStream == null) {
                    inputStream.close();
                }
             } catch (IOException e) {
                e.printStackTrace();
             }
        }

        return new Profile();
    }
}
