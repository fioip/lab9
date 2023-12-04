package example;

public class JSONFile {
    public static void main(String[] args) {
        UtilClass util = new UtilClass();
        Person person = new Person("Fiona", 19);

        util.writeToFile("C:\\Users\\cti22b107\\lab9\\src\\main\\java\\example\\JSONFile.txt", person);
        util.readFromFile("C:\\Users\\cti22b107\\lab9\\src\\main\\java\\example\\JSONFile.txt", person);

    }
}
