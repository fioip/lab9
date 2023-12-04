package example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class UtilClass {
    ObjectMapper objectMapper = new ObjectMapper();
    Object person;

    public void readFromFile(String path, Object value) {
        try {
            Person person = objectMapper.readValue(Paths.get("JSONFile.txt").toFile(), Person.class);
            System.out.println(person);

        }catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    public void writeToFile(String path, Object value) {
        try {
            objectMapper.writeValue(new File("C:\\Users\\cti22b107\\lab9\\src\\main\\java\\example\\JSONFile.txt"), person);
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}

