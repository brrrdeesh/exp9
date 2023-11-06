import java.io.*;

public class CopyFileWithSpaceRemoval {
    public static void main(String[] args) {
        String sourceFileName = "source.txt";  // Change to the name of your source file
        String targetFileName = "target.txt";  // Change to the name of your target file

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Remove unnecessary spaces between words
                line = line.replaceAll("\\s+", " ");  // Replace multiple spaces with a single space
                writer.write(line);
                writer.newLine();  // Write a new line
            }

            System.out.println("File copied with space removal.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
