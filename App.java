package sg.edu.nus.iss;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        String dirPath = args[0];
        String fileName = args[1];
        String directoryPath = dirPath + File.separator + fileName;

        File newDirectory = new File(dirPath);
        if (newDirectory.exists()) {
            System.out.println("Path already exists at " + dirPath);
        } else {
            newDirectory.mkdir();
        }

        File newFile = new File(directoryPath);
        if (newFile.exists()) {
            System.out.println(fileName + " already exists you idiot\n");
        } else {
            newFile.createNewFile();
        }

        CSVWriter csvwriter = new CSVWriter();
        List<Employee> slaves = csvwriter.createMoreSlaves();
        csvwriter.writeToCSV(slaves, directoryPath);
        System.out.println("okay done");

        CSVReader csvreader = new CSVReader();
        // reader need to include directory path variable
        List<Employee> bitches = csvreader.readCSV(directoryPath);
        System.out.println("okay I'm done reading my eyes hurt but i don't have eyes I'm a compyooter");

        Console cons = System.console();
        String login = cons.readLine("Password please: ").toLowerCase();
        if (login.equals("boobies")) {
            String prompt = cons.readLine("Welcome Rayson. Who are you looking for today?");
            if (prompt.equals("Kafka")) {
                System.out.println("Bork bork woof woof yummy mummy mmmmm");
                System.out.println(slaves.get(5).toString());
            } else {
                boolean name = false;
                for (int i = 0; i < slaves.size(); i++) {
                    if (prompt.equals(slaves.get(i).getFullName())) {
                        name = true;
                        System.out.println(slaves.get(i).toString());
                    } 
                }
                
                if (name == false) {
                    System.out.println("Who TF you looking for sia");
                }
                        
            }
        
        }
    }

}


