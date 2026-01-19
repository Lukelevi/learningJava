package samplepackage;
import java.util.HashMap;

public class DictionariesHash {
    public static void main(String[] args) {
        HashMap<String, Integer> employeeId = new HashMap<>();
        
        //Inserting values inside my Dictionary
        employeeId.put("David", 86534);
        employeeId.put("Mike", 87332);    
        employeeId.put("Samuel", 89665);

        int result = employeeId.get("Mike");

        System.out.print("\n");
        System.out.print(result);

    }
}
