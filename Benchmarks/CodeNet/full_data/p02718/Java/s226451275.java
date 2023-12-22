import java.util.*;

public class Main {
    public static void main(String[] args){
        ABC161B();
    }
    private static void ABC161B() {
        // no comment, no error check
        final int INPUT_LINES_CNT = 2;
        final String DATA_SPLIT_SPACE = " ";

        ArrayList<String> inputLines = getStdInMultiLines(INPUT_LINES_CNT);

        if (inputLines.size() == 0) {
            System.out.println(0);
            return;
        }

        String outputStr = "No"; 

        try {
            List<String> inputLineList = Arrays.asList((inputLines.get(0)).split(DATA_SPLIT_SPACE));
            List<String> inputLineList2 = Arrays.asList((inputLines.get(1)).split(DATA_SPLIT_SPACE));

            int vote = Integer.valueOf(inputLineList.get(1));
            long sum = inputLineList2.stream()
                        .mapToLong(Integer::parseInt)
                        .sum();
            int cnt = 0;

            for (String s : inputLineList2) {
                if (Integer.valueOf(s) > sum / (4 * vote)) {
                    cnt++; 
                }
            }
            if (cnt >= vote) {
                outputStr = "Yes"; 
            }
        }
        catch (Exception ex) {
            outputStr = "Yes"; 
        }

        System.out.println(outputStr);
        return;
    }
    private static int getStdInNum() {
        String line1 = getStdInSingleLine();
        if (isNumber(line1)) {
            return Integer.parseInt(line1);
        }
        return 0;
    }

    private static ArrayList<String> getStdInMultiLines() {
        int cnt = 0; 
        int max = 0;

        Scanner cin = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (;cin.hasNext();) {
            list.add(cin.nextLine());
            if (cnt++ == 0) {
                max = Integer.parseInt((list.get(0)).split(" ")[0]);
            }
            else if (cnt == max + 1) {
                break;
            }
        }
        cin.close();
        return list;
    }
    private static ArrayList<String> getStdInMultiLines(int inputLinesCnt) {
        int cnt = 0; 

        Scanner cin = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (;cin.hasNext();) {
            list.add(cin.nextLine());
            if (++cnt == inputLinesCnt) {
                break;
            }
        }
        cin.close();
        return list;
    }

    private static String getStdInSingleLine() {
        Scanner cin = new Scanner(System.in);

        for (;cin.hasNext();) {
            cin.close();
            return cin.nextLine();
        }

        cin.close();
        return "";
    }

    private static boolean isNumber(String val) {
        try {
            Integer.parseInt(val);
            return true;
        }
        catch (NumberFormatException nfex) {
            return false;
        }
    }

    private static List<Integer> toArrayInteger(List<String> array) {
        try {
            List<Integer> list = new ArrayList<Integer>(array.size());
            for (int i = 0; i < array.size(); i++) {
                list.add(Integer.valueOf(array.get(i)));
            }
            return list;
        }
        catch (NumberFormatException nfex) {
            return new ArrayList<Integer>();
        }
    }
}
