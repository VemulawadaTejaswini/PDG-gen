import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
 
public class Main {
  
    private static final int MAX_INPUT_LIMIT_COUNT = 2;
 
    private static final int YEAR = 2019;
 
    private static final int ARR_INDEX_MONTH = 0;
    private static final int ARR_INDEX_DAY = 1;
  
  public static void main(String[] args) {
 
        List<String> inputList = readInputList();
 
        byte maxDayFlag = 0;
 
        int[] arr = readYearAndMonth(inputList.get(0));
 
        Calendar cal = convertCalender(arr);
        if (cal.getActualMaximum(Calendar.DAY_OF_MONTH) == arr[ARR_INDEX_DAY])
            maxDayFlag = 1;
 
        System.out.println(maxDayFlag);
  }
 
    private static List<String> readInputList() throws IOException {
 
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
 
            List<String> inputList = new ArrayList<>();
 
            for (int i = 0; i < MAX_INPUT_LIMIT_COUNT; i++) {
                inputList.add(br.readLine());
            }
 
            return inputList;
    }
 
    private static int[] readYearAndMonth(String inputStr) {
        int[] yearAndMonthArr = new int[2];
        String[] strArr = inputStr.split("\\s");
 
        yearAndMonthArr[ARR_INDEX_MONTH] = Integer.valueOf(strArr[ARR_INDEX_MONTH]);
        yearAndMonthArr[ARR_INDEX_DAY] = Integer.valueOf(strArr[ARR_INDEX_DAY]);
 
        return yearAndMonthArr;
    }
 
    private static Calendar convertCalender(int[] yearAndMonthArr) {
        return new Calendar.Builder()
                .setLenient(true)
                .set(Calendar.YEAR, YEAR)
                .set(Calendar.MONTH, yearAndMonthArr[ARR_INDEX_MONTH] - 1)
                .set(Calendar.DAY_OF_MONTH, yearAndMonthArr[ARR_INDEX_DAY])
                .build();
    }
 
}