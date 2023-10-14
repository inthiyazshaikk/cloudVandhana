import java.util.Scanner;

public class RomToInt {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	String s1=scan.next();
    	
        System.out.println(romanToInt(s1));
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = getValue(s.charAt(i));

            if (i < s.length() - 1) {
                int nextVal = getValue(s.charAt(i + 1));

                if (currentVal < nextVal) {
                    result -= currentVal;
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    private static int getValue(char romanSymbol) {
        switch (romanSymbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
