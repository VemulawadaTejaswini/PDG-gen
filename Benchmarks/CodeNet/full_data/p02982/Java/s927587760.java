import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    double s = 0;
    double ss = 0;
    String[] array1 ;
    String[][] array2 = new String[n][d];
    int count =0;

    for(int i=0; i<n; i++){
      for(int j=0; j<d; j++){
        array2[i][j] = sc.next();
      }
    }

    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        for(int k=0; k<d; k++){
          s += Math.pow((Integer.valueOf(array2[i][k])-Integer.valueOf(array2[j][k])),2) ;
          //System.out.println(s);
        }
        ss = Math.sqrt(s);
        if(ss == (int)ss && ss != 0){
          count += 1;
        }
        s= 0;
      }
    }
    System.out.println(count/2);
  }
}