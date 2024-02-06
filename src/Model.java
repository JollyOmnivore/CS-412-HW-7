import javax.swing.*;
import java.util.ArrayList;

public class Model {

    ArrayList<String> data;


    public Model() {

        data = new ArrayList<>();


    }

    public ArrayList<String> getData() {
        return data;
    }

    public void adddata(String input){
        data.add(input);
    }
    public void removedata(String selected){
        data.remove(selected);
    }






}
