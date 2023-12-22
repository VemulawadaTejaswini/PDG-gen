import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b[] = new int[a];
    int counter = 0;
    for(int i = 0;i < b.length;i++){
      b[i] = sc.nextInt();
    }
    for(int x = 0;x <b.length-2;x++){
         for(int y = x+1;y <b.length-1;y++){
               for(int z = y+1;z <b.length;z++){
                 if(b[x]<b[y]+b[z] && b[y]<b[x]+b[z] && b[z]<b[x]+b[y]){
                   counter++;
                 }
               }
         }
    }
    System.out.println(counter);
  }
}