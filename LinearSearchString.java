public class LinearSearchString {
    public static void main(String[] args) {
        String name = "Raseen";
        char target = 's';
        System.out.println(search(name, target));
        System.out.println(searchInRange(name, target, 1, 4));
    }

    /*
     * this method return the index value of the given targeted character in the
     * range
     */
    static int searchInRange(String str, char target, int start, int end) {
        if (str.length() == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }

        return -1;
    }

    /*
     * This method return boolean values,if the target character is available then
     * returns "True" else "False"
     */
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}