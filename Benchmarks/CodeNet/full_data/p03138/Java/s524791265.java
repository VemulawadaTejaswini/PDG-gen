public class Test2 {

    public static void main(String[] args) {
        int[] x = {1, 6, 3};
        System.out.println(findMaximumValue(x, 7));
    }

    static int findMaximumValue(int x[], int k) {
        int max = 0;
        int check = 0;
        int start = 0;
        while (start < k) {
            for (int i = 0; i < x.length; i++) {
                check = check + ((x[i] | start) & (~x[i] | ~start));

            }
            start++;
            if (check >= max) {
                max = check;
            }
            check = 0;
        }
        return max;
    }

}
