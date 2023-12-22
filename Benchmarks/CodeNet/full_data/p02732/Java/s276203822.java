import java.util.*;

public class Main {
    public static void main(String[] args){
        ABC159D();
    }
    private static void ABC159D() {
        // no comment, no error check
        final int INPUT_LINES_CNT = 2;
        final String DATA_SPLIT_SPACE = " ";

        ArrayList<String> inputLines = getStdInMultiLines(INPUT_LINES_CNT);

        if (inputLines.size() == 0) {
            System.out.println(0);
            return;
        }

        try {
            List<String> inputLineList= 
            Arrays.asList((inputLines.get(1)).split(DATA_SPLIT_SPACE));

            int inputNum = Integer.valueOf(inputLines.get(0));
            if (3 <= inputNum && inputNum <= 2 * Math.pow(10, 5)) {
                for (int i = 0; i < inputNum; i++){
                    int outputNum = 0;
                    for (int j = 0; j < inputNum - 1; j++){
                        if (j == i) {
                            continue;
                        }
                        for (int k = inputNum - 1; k > j; k--){
                            if (k == i) {
                                continue;
                            }
                            if (Integer.valueOf(inputLineList.get(j)) == Integer.valueOf(inputLineList.get(k))) {
                                outputNum = outputNum + 1;
                            }
                        }
                    }
                    System.out.println(String.valueOf(outputNum));
                }
            }
        }
        catch (Exception ex) {
            System.out.println("");
        }

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

}
