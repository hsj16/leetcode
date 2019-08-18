package solution.string_to_integer_atoi_008;


public class StringToIntegerAtoi {


    public int myAtoi(String str) {
        long n = 0;
        boolean minus = false;
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        if (str.startsWith("-")) {
            minus = true;
            str = str.substring(1);
        }
        if (str.startsWith("+")) {
            str = str.substring(1);
        }
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a < '0' || a > '9') {
                throw new RuntimeException("int format error");
            }
            n = n * 10 + a - '0';
        }

        if (minus) {
            n = 0 - n;
        }

        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            throw new RuntimeException("int format error");
        }

        return (int) n;
    }
}