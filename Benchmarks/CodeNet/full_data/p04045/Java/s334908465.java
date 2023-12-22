import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
	    List<String> inputs = Io.read();
	    int[] metas = parse(inputs.get(0).split(" "));
	    int target = metas[0];

	    int[] hateNums = parse(inputs.get(1).split(" "));
	    List<Integer> validNums = validNumsInitialize(hateNums);

	    Calculator calc = new Calculator(target);

	    Io.write(calc.calc(validNums));
    }

    private static int[] parse(String[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            result[i] = Integer.parseInt(arr[i]);
        }
        return result;
    }

    private static List<Integer> validNumsInitialize(int[] hateNums) {
        List<Integer> validNums = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        for (Integer num : hateNums) {
            validNums.remove(num);
        }

        return validNums;
    }
}

class Calculator {

    private int target;
    private int[] result;

    private int logNum;

    public Calculator(int target) {
        this.target = target;

        logNum = (int)Math.log10(target);
        result = new int[logNum + 2];
    }

    public int calc(List<Integer> validNums) {
        initialize(validNums);

        int before = getAnswer();
        int current = before;
        while(current >= target) {
            decrementTargetDigit(1, validNums);

            current = getAnswer();
            if (current < target) {
                break;
            }
            before = current;
        }

        return before;
    }

    private void initialize(List<Integer> validNums) {
        for(int i = logNum; i >= 0; i--) {
            int num = (int)(target % Math.pow(10, i + 1)) / (int)Math.pow(10, i);
            for (int valid : validNums) {
                if (valid >= num) {
                    result[i] = valid;
                    break;
                }
            }
            if (i == logNum && result[logNum] == 0) {
                if (validNums.get(0) > 0){
                    result[logNum + 1] = validNums.get(0);
                } else {
                    result[logNum + 1] = validNums.get(1);
                }
                break;
            }
        }
        while (getAnswer() < target) {
            incrementTargetDigit(1, validNums);
        }
    }

    private int getAnswer() {
        int ans = 0;
        for (int i = 0; i < result.length; i++) {
            ans += result[i] * Math.pow(10, i);
        }
        return ans;
    }

    private void decrementTargetDigit(int digitNum, List<Integer> validNums) {
        int num = result[digitNum - 1];
        int idx = validNums.indexOf(num);
        if (idx > 0) {
            result[digitNum - 1] = validNums.get(idx - 1);
        } else {
            if (digitNum == result.length - 1) {
                result[digitNum] = 0;
            } else if (digitNum >= result.length){
                result[digitNum - 1] = 0;
            } else {
                result[digitNum - 1] = validNums.get(validNums.size() - 1);
                decrementTargetDigit(digitNum + 1, validNums);
            }
        }
    }

    private void incrementTargetDigit(int digitNum, List<Integer> validNums) {
        int num = result[digitNum - 1];
        int idx = validNums.indexOf(num);
        if (idx < validNums.size() - 1) {
            result[digitNum - 1] = validNums.get(idx + 1);
        } else {
            result[digitNum - 1] = validNums.get(0);
            incrementTargetDigit(digitNum + 1, validNums);
        }
    }
}

class Io {

    /**
     * 標準入力から1行ずつ受け取る
     * @return
     * @throws IOException
     */
    public static List<String> read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputs = new ArrayList<String>();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals(""))
                break;

            inputs.add(line);
        }
        br.close();
        return inputs;
    }

    /**
     * 標準出力
     * @param line
     */
    public static void write(int line)
    {
        System.out.println(line);
    }
}