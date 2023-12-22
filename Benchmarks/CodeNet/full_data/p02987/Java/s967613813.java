import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char[] a = sc.next().toCharArray();
    int counter1 = 0;
    int counter2 = 0;
    char tmp = 'A';
    for(int i = 0;i < 3;i++){
      for(int j = i + 1;j < 4;j++){
        if(a[i] == a[j]){
          tmp = a[i];
          counter1++;
        }
        if(a[i] == a[j] && tmp != a[i]){
          counter2++;
        }
      }
    }
    if(counter1 == 1 && counter2 == 1){
      System.out.println("Yes");
    }else{
      System.out.println("No");      
    }
  }
}
