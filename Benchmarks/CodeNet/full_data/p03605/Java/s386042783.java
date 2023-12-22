import java.io.*;
import java.util.Scanner;
import java.util.*;
class theater{
  public static void main(String args[]){
    int count = 0;
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] l = new int[N];
      int[] r = new int[N];
    for(int i=0;i<N;i++){

      l[i] = (scanner.nextInt());
      r[i] = (scanner.nextInt());
    }
    for(int i = 0;i<N;i++){
      count +=r[i]-l[i]+1;
    }
    System.out.print(count);
    scanner.close();
  }

  }
