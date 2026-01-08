import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {
    public static Map<String, Integer> calChange(int amountDue, int amountPaid) {

        int change = amountDue - amountPaid;

        Map<String, Integer> cashReg = new LinkedHashMap<>();
        cashReg.put("R200", 20000);
        cashReg.put("R100", 10000);
        cashReg.put("R50",  5000);
        cashReg.put("R20",  2000);
        cashReg.put("R10",  1000);
        cashReg.put("R5",   500);
        cashReg.put("R2",   200);
        cashReg.put("R1",   100);
        cashReg.put("50c",  50);
        cashReg.put("20c",  20);
        cashReg.put("10c",  10);
        cashReg.put("5c",   5);

        Map<String, Integer> receit = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : cashReg.entrySet()) {
            String bill = entry.getKey();
            int value = entry.getValue();

            while (change >= value) {
                receit.put(bill, receit.getOrDefault(bill, 0) + 1);
                change -= value;
            }
        }
        return receit;

    }

    public static void main(String[] args) {
        // Formula for basic statements: Data type [nameOfDataType] = [methodName(including params)]
        Map<String, Integer> result = calChange(20000, 5000);

        System.out.print("\n");
        System.out.print(result);
    }

}