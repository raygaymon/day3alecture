package sg.edu.nus.iss;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        String dirPath = args[0];
        String fileName = args[1];
        String directoryPath = dirPath + File.separator + fileName;

        File newDirectory = new File(dirPath);
        if (newDirectory.exists()) {
            System.out.println("File already exists at " + dirPath);
        } else {
            newDirectory.mkdir();
        }

        File newFile = new File(directoryPath);
        if (newFile.exists()) {
            System.out.println(fileName + "already exists");
        } else {
            newFile.createNewFile();
        }
    }
}
