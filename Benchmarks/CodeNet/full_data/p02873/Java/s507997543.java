import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = System.console().readLine().trim();
//        String s = "<>>><<><<<<<>>><";
//        String s = "<>>";
//        String s = ">>><<<";
        // 0 < 1
        // 0 < 1 > 0
        // 0 < 1 > 0 > -1
        // 0 < 2 > 1 > 0
        int[] array = new int[s.length()+1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                array[i+1] = array[i] + 1;
            } else {
//                System.out.println("" + s.charAt(i) + "" + i + Arrays.toString(array));
                if (i > 0 && s.charAt(i-1) == '<') {
                    array[i+1] = 0;
                } else {
                    array[i + 1] = array[i] - 1;
                    if (array[i+1] < 0) {
                        for (int j = i+1; j > 0; j--) {

                            array[j]++;

                            if (s.charAt(j-1) == '>' && array[j-1] > array[j]) {
                                break;
                            }
                            if (s.charAt(j-1) == '<') break;

//                            if (s.charAt(j-2) == '<' && array[j-2] < array[j-1]) {
//                                break;
//                            }
//                    System.out.println("" + s.charAt(i) + "" + i + Arrays.toString(array));
                        }
                    }
                }
            }
//            System.out.println("" + s.charAt(i) + "" + i + Arrays.toString(array));
        }

//        System.out.print(array[0]);
//        for (int i = 0; i < s.length(); i++) {
//            System.out.print("" + s.charAt(i) + array[i+1]);
//        }
        System.out.println(Arrays.stream(array).sum());
    }
}
