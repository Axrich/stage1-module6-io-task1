package com.epam.mjc.io;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileReader {
    public Profile getDataFromFile(File file) {
        String line;
        Map<String, String> result = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            while ((line = reader.readLine()) != null) {
                String[] array = line.split(":");
                if (array.length == 2) {
                    result.put(array[0].trim(), array[1].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Profile(
            result.get("Name").trim(),
            Integer.parseInt(result.get("Age").trim()),
            result.get("Email").trim(),
            Long.parseLong(result.get("Phone").trim())
        );
    }
}
