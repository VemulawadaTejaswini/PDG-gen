
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  static int mod = 1000000007;

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    long maxVal = cin.nextLong();

    int[] countZero = new int[Long.toBinaryString(Long.MAX_VALUE).length()];
    int[] countOne = new int[countZero.length];

////    int[] num = new int[n];
    for (int i=0;i<n;i++) {
      long num = cin.nextLong();
      char[] s = Long.toBinaryString(num).toCharArray();
      System.out.println(Arrays.toString(s));
      for (int j=0;j<countOne.length;j++) {
        if (j < s.length && s[s.length-j-1]=='0')
          countZero[j]++;
        else if (j < s.length && s[s.length-j-1]=='1')
          countOne[j]++;
        else if (j >= s.length)
          countZero[j]++;
      }
    }

    System.out.println(Arrays.toString(countOne));
    System.out.println(Arrays.toString(countZero));

    int mark = 0;
    String maxValString = Long.toBinaryString(maxVal);
    char[] maxValChar = new char[countOne.length];

    for (int i=0;i<maxValString.length();i++) {
      if (maxValString.charAt(i)=='1')
        maxValChar[maxValString.length()-1-i] = '1';
      else if (maxValString.charAt(i)=='0')
        maxValChar[maxValString.length()-1-i] = '0';
    }

//    StringBuilder res = new StringBuilder();
    long res = 0;
    for (int i=countOne.length-1;i>=0;i--) {
      if (countOne[i]!=0||countZero[i]!=0) {
        if (maxValChar[i]=='1'&&mark==0) {
          if (countOne[i]>=countZero[i]) {
//            res.append('0');
            res+=Math.pow(2,i) * countOne[i];
            mark = 1;
          }
          else {
            res+=Math.pow(2,i) * countZero[i];
//            res.append('1');
          }
        }
        else if (maxValChar[i]=='0'&&mark==0) {
          res+=Math.pow(2,i) * countOne[i];
        }
        else if (mark==1) {
          if (countOne[i]>=countZero[i]) {
//            res.append('0');
            res+=Math.pow(2,i) * countOne[i];
            mark = 1;
          }
          else {
            res+=Math.pow(2,i) * countZero[i];
//            res.append('1');
          }
        }

      }
    }

    System.out.println(res);

  }


}
