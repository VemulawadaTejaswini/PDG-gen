import java.util.Scanner;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
 int N = scan.nextInt();
 int work[] = new int[N];
  for (int i = 0; i < N-1; i++){
    int a = scan.nextInt();
    work[a-1] += 1;
  }
  for (int j = 0; j < N  ; j++){
    System.out.println(work[j]);
    }
 }
}