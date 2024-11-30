package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    public static List<String[]> read(String file) {
        List<String[]> list = new LinkedList<String[]>();
         String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (( dataRow = br.readLine()) !=null) {
            String[] dataRecord = dataRow.split(",");
            list.add(dataRecord);}
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }

   return list; }

}
