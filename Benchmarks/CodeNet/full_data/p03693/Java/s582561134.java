import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[n];
    int temp;

    for(int i=0 ; i<n ; i++){
      data[i] = sc.nextInt();
    }

    for(int i=0 ; i<n-1 ; i++){
      for(int j=i+1 ; j<n ; j++){
        if(data[i] < data[j]){
          temp = data[i];
          data[i] = data[j];
          data[j] = temp;
        }
      }
    }

    int x = (data[0] - data[n-1]);
    System.out.println(x);
  }
}
