package samplepackage;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;

public class RomanNumerals {
    public static List<String> toRoman(int userValue) {

        //Define a object to store roman-numerical values
        Map<String, Integer> myRomans = new LinkedHashMap<>();
        myRomans.put("M", 1000);
        myRomans.put("CM", 900);
        myRomans.put("D", 500);
        myRomans.put("CD", 400);
        myRomans.put("C", 100);
        myRomans.put("XC", 90);
        myRomans.put("L", 50);
        myRomans.put("XL", 40);
        myRomans.put("X", 10);
        myRomans.put("IX", 9);
        myRomans.put("V", 5);
        myRomans.put("IV", 4);
        myRomans.put("I", 1);

        //Empty string for concatenating my romans
        List<String> myRoman = new ArrayList<>();


        for (Map.Entry<String, Integer> entry : myRomans.entrySet()) {
            String roman = entry.getKey();
            int number = entry.getValue();

            while (userValue <= 0 || userValue >= 3999) { // Standard roman numerals stop at 3999
               // throw new illegalArgumentException("Enter values between 1 and 3999");
                // if (!myRoman.contains(roman)) {
                //     myRoman.add(roman);
                // } else if (myRoman.contains(roman)) {
                //     myRoman.add(roman);
                // } if two branches of an if/else do the same thing, you DON'T need a condition.
                myRoman.add(roman); 
                userValue -= number;
            }
        }
        return myRoman;
    }

    //Display output
    public static void main(String[] args) {
        List<String> result = toRoman(3999);
        //String toStr = String.join(", ", result); Syntax to convert from List to string
        //StringBuilder result = new StringBuilder(); //Faster than string concatenation
        
        System.out.print("\n");
        System.out.println(String.join(",", result));
    }
}

/* Important notes learn't:
    - Calling .contains() on a List is O(n) Time Complexity
 */
