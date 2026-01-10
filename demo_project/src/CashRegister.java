import java.util.LinkedHashMap;
import java.util.Map;

public class CashRegister {

    public static Map<String, Integer> change(int amountDue, int amountPaid) {

        // Calculate change (in cents)
        int change = amountPaid - amountDue;

        // Dictionary of denominations (key → name, value → value in cents)
        Map<String, Integer> register = new LinkedHashMap<>();
        register.put("R200", 20000);
        register.put("R100", 10000);
        register.put("R50",  5000);
        register.put("R20",  2000);
        register.put("R10",  1000);
        register.put("R5",   500);
        register.put("R2",   200);
        register.put("R1",   100);
        register.put("50c",  50);
        register.put("20c",  20);
        register.put("10c",  10);
        register.put("5c",   5);

        Map<String, Integer> changeDue = new LinkedHashMap<>();

        // Loop through each denomination
        for (Map.Entry<String, Integer> entry : register.entrySet()) {
            String bill = entry.getKey();
            int value = entry.getValue();

            // While the denomination fits into change
            while (change >= value) {
                changeDue.put(bill, changeDue.getOrDefault(bill, 0) + 1);
                change -= value;
            }
        }

        return changeDue;
    }

    public static void main(String[] args) {
        // Formula for basic statements: Data type [nameOfDataType] = [methodName(including params)]
        Map<String, Integer> result = change(99900, 200065);

        System.out.println(result);
    }
}

