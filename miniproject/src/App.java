import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import BusBooking.*;

public class App {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C://Users//CHARAN//code//java//java project//miniproject//src//csvfiles//persondetails.csv"));
            String studLine;
            while ((studLine = reader.readLine()) != null) {
                person p = new person(studLine);
                queries.addPerson(p);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
