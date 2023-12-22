import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int li[] = new int[N];
    int count = 0;
    int[] binary = new int[N];
    for(int i=0;i<N;i++){
      li[i] = sc.nextInt();
      binary[i] = 0;
    }
    for(int j=0;j<N-1;j++){
      if(li[j]==li[j+1]){
        li[j] -= 1;
      }else if(li[j]>li[j+1]){
        if(binary[j]!= 0){
          li[j] += 1;
        }
        li[j] -= 1;
        if(li[j]>li[j+1]){
          count++;
          break;
        }else{
          binary[j+1] += 1;
        }
      }
    }
    String judge = count==0 ? "Yes" : "No";
      System.out.println(judge);
  }
}