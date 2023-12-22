import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;

 public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s = "";

        try {
            s = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long x = Long.parseLong(s);
        long kaisu = 0;
        long ten = 0;
        int flg = 0;

        while (ten < x){
       if (flg == 0){
       ten = ten + 6;
       flg = 1;
       } else {
       ten = ten + 5;
       flg = 0;
       }
       kaisu++;
        }

        System.out.println(kaisu);
    }
 }