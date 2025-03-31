public class dfaLogic {
    public static boolean checkString(char[] input) {
        if (input.length != 8) {
            return false;
        }

        int state = 0;
        for (char symbol : input) {
            if ((state == 0 && symbol == 'c') ||
                    (state == 1 && (symbol == 'a' || symbol == 'b')) ||
                    (state == 2 && symbol == 'c') ||
                    (state >= 3 && state <= 7 && (symbol == 'b' || symbol == 'c'))) {
                state++;
            } else {
                return false;
            }
        }
        return true;
    }
}
