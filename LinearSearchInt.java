public class LinearSearchInt {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 5, -7, 4, 7, 9 };
        int target = -7;
        System.out.println(Search(arr, target));
        System.out.println(SearchInRange(arr, target, 1, 4));
    }

    /*
     * This method return boolean values,if the target value is available then
     * returns "True" else "False"
     */
    public static boolean Search(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return true;
            }
        }

        return false;
    }

    /*
     * this method return the index value of the given targeted element in the range
     */
    public static int SearchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
