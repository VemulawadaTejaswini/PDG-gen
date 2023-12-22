import java.io.*;

public class Main {


    private static String solver(String input) {
        String[] intputArray = input.split("/");
        int year = Integer.parseInt(intputArray[0]);
        int month = Integer.parseInt(intputArray[1]);
        int day = Integer.parseInt(intputArray[2]);

        int dateNum = year * 10000 + month * 100 + day;
        if(dateNum <= 20190430){
            return "Heisei";
        }else{
            return "TBD";
        }
    }


    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String input = "";
        try {
            input = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(solver(input));

    }
}