package com.epam.mjc.io;
import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class FileReader {

    String line = null;
    Map<String, String> result = new HashMap<>();
    String[] array = {};
    public Profile getDataFromFile(File file) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D://mjcSchoolTrainingFromEpamProjects2/stage1-module6-io-task1/src/main/resources/Profile.txt"))))
            {
                 while ((line = reader.readLine()) != null) {
                 array = line.split(":");
                 result.put(array[0], array[1]);
            }
                System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Profile(result.get("Name"), Integer.parseInt(result.get("Age").trim()), result.get("Email"), Long.parseLong(result.get("Phone").trim()));
    }

}
