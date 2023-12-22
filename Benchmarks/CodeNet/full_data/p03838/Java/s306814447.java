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

        long x = Long.parseLong(s.split(" ")[0]);
        long y = Long.parseLong(s.split(" ")[1]);
        long kaisu = 0;

        if ((x >= 0 && y >= 0 ) || ((x < 0) && (y < 0))){
       if(y > x){
       kaisu = y - x;
       } else {
       if (y == 0){
       kaisu = x - y + 1;
       } else {
       kaisu = x - y + 2;
       }
       }
        } else {
       x = x * -1;
       if(y > x){
       kaisu = y - x + 1;
       } else {
       if (y == 0){
       kaisu = x - y;
       } else {
       kaisu = x - y + 1;
       }
       }
        }
        System.out.println(kaisu);
    }
 }