package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    
    public List<Employee> readCSV (String fileName) throws FileNotFoundException, IOException {

        BufferedReader br1 = null;
        String line = "";
        List<Employee> bitches = new ArrayList<>();

        //BufferedReader reads line by line, filereader reads character by character
        br1 = new BufferedReader(new FileReader(fileName));

        line = br1.readLine();

        //read each line of CSV record
        while ((line = br1.readLine()) != null) {
            String [] lineData = line.split(CSVWriter.COMMA_DELIMITER);
            if (lineData.length > 0) {
                Employee bitch = new Employee (lineData[0], lineData[1], lineData[2], lineData[3], lineData[4], Integer.parseInt(lineData[5]));
                bitches.add(bitch);
            }
            System.out.println("Employee " + lineData[1] + " read successfully.");
        }
        //format into employee object
        //add employee object into list of employees
        //close br

        br1.close();
        
        return bitches;
    }
}
