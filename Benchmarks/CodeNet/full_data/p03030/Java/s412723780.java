import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    int[] p = new int[n];
    int[] data = new int[n];
    String temp_string;
    int temp_int;
    int temp_data;


    for(int i = 0;i < n;i++) {
      s[i] = sc.next();
      p[i] = sc.nextInt();
      data[i] = i+1;
    }

    for(int i = 0;i < n-1;i++) {
      for(int k = 0;k < n-i-1;k++){


        if(s[k].compareTo(s[k+1]) > 0) {
          temp_string = s[k];
          s[k] = s[k+1];
          s[k+1] = temp_string;

          temp_int = p[k];
          p[k] = p[k+1];
          p[k+1] = temp_int;

          temp_data = data[k];
          data[k] = data[k+1];
          data[k+1] = temp_data;

        } else if(s[k].compareTo(s[k+1]) == 0) {
          if(p[k] < p[k+1]) {
            temp_int = p[k];
            p[k] = p[k+1];
            p[k+1] = temp_int;

            temp_data = data[k];
            data[k] = data[k+1];
            data[k+1] = temp_data;
          }
        }


      }
    }

    for(int i = 0;i < n;i++) {
      System.out.println(data[i]);
    }

  }

}
