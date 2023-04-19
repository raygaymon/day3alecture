package sg.edu.nus.iss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPARATOR = "\n";
    public static final String FILE_HEADER = "S/n, staffNo, fullName, department, role, emailAddress, salary";

    public List<Employee> slaves = null;

    public List<Employee> createMoreSlaves() {
        slaves = new ArrayList<>();

        Employee slave1 = new Employee("73464536345","Darryl Ng","SS","Lecturer","darrylng@nus.edu.sg",20000);
        Employee slave2 = new Employee("45634563456","Dennis Ng","SS","Lecturer","dennisng@nus.edu.sg",20000);
        Employee slave3 = new Employee("678967896789","Dendon Ng","SS","Lecturer","dendonng@nus.edu.sg",20000);
        Employee slave4 = new Employee("4444444","Hu Tao","Wang Sheng Funeral Parlor","Director","deathisawesome@gmail.com",44444);
        Employee slave5 = new Employee("4356345634","Jesus","Christianity","God's son","crossessuck@heaven.com",0);
        Employee slave6 = new Employee("78978","Kafka","Star Rail Hunter","Hot Mommy","imsexyandiknowit@gmail.com",9000000);
        Employee slave7 = new Employee("5555555","Elon Musk","Twitter","Chief Idiot Officer","whatamievendoing@gmail.com",4);
        Employee slave8 = new Employee("69696969696969","Kimberley Aw","Rayson.co","Lieb","sheusesbingmore@gmail.com",69696969);

        slaves.add(slave1);
        slaves.add(slave2);
        slaves.add(slave3);
        slaves.add(slave4);
        slaves.add(slave5);
        slaves.add(slave6);
        slaves.add(slave7);
        slaves.add(slave8);

        return slaves; //back to their home country isit

    }

    public void writeToCSV(List<Employee> slaves, String fileName) throws IOException {
        
        //write file header to file
        FileWriter fw1 = new FileWriter(fileName);
        fw1.append(FILE_HEADER.toString());
        fw1.append(NEWLINE_SEPARATOR);

        //iterate through each employee and their record in the file
        //for loops with array, if want to extract individual items in the arraylist with getter add .get(i) before the getter
        //and after the arraylist name
        for (int i = 0; i < slaves.size(); i++) {
            fw1.append(i+1 + ". ");
            fw1.append(slaves.get(i).getStaffNo());
            fw1.append(COMMA_DELIMITER);
            fw1.append(slaves.get(i).getFullName());
            fw1.append(COMMA_DELIMITER);
            fw1.append(slaves.get(i).getDepartment());
            fw1.append(COMMA_DELIMITER);
            fw1.append(slaves.get(i).getRole());
            fw1.append(COMMA_DELIMITER);
            fw1.append(slaves.get(i).getEmailAddress());
            fw1.append(COMMA_DELIMITER);
            fw1.append(String.valueOf(slaves.get(i).getSalary()));
            fw1.append(NEWLINE_SEPARATOR);
            System.out.println("Employee " + slaves.get(i).getFullName()+ " has been recorded. Hired as: " + slaves.get(i).getRole());
        }

        //flush and close filewriter
        fw1.flush();
        fw1.close();

    }
}
    

