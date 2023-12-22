import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class sampleA {
 public static void main(String[] args) throws IOException {
   try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
     int a = Integer.parseInt(br.readLine());
     int b = Integer.parseInt(br.readLine());

     if (b >= a) {
       System.out.println(a);
     } else {
       System.out.println(a-1);
     }
   }
 }
}