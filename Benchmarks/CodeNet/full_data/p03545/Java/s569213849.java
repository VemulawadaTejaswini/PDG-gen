import java.util.Scanner;

public class Main{
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int suti = scan.nextInt();
      int a = 0,b = 0,c = 0,d = 0,check = 0;
      int roop[] = new int[4];

      for (roop[0] = 0;roop[0] <= 9 ;roop[0]++ ) {
        for (roop[1] = 0;roop[1] <= 9 ;roop[1]++ ) {
          for (roop[2] = 0;roop[2] <= 9 ;roop[2]++ ) {
            for (roop[3] = 0;roop[3] <= 9 ;roop[3]++ ) {
              check = 1000*roop[0] + 100*roop[1] + 10*roop[2] + roop[3];
              if(check == suti){
                a = roop[0];
                b = roop[1];
                c = roop[2];
                d = roop[3];
              }
            }
          }
        }
      }
      int kotae[] = new int[8];
      kotae[0] = a + b + c + d;
      boolean judge = false;
      if(kotae[0] == 7 && judge == false){
        System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + kotae[0]);
        judge = true;
      }
      kotae[1] = a + b + c - d;
      if(kotae[1] == 7 && judge == false){
        System.out.println(a + "+" + b + "+" + c + "-" + d + "=" + kotae[1]);
        judge = true;
      }
      kotae[2] = a + b - c + d;
      if(kotae[2] == 7 && judge == false){
        System.out.println(a + "+" + b + "-" + c + "+" + d + "=" + kotae[2]);
        judge = true;
      }
      kotae[3] = a + b - c - d;
      if(kotae[3] == 7 && judge == false){
        System.out.println(a + "+" + b + "-" + c + "-" + d + "=" + kotae[3]);
        judge = true;
      }
      kotae[4] = a - b + c + d;
      if(kotae[4] == 7 && judge == false){
        System.out.println(a + "-" + b + "+" + c + "+" + d + "=" + kotae[4]);
        judge = true;
      }
      kotae[5] = a - b + c - d;
      if(kotae[5] == 7 && judge == false){
        System.out.println(a + "-" + b + "+" + c + "-" + d + "=" + kotae[5]);
        judge = true;
      }
      kotae[6] = a - b - c + d;
      if(kotae[6] == 7 && judge == false){
        System.out.println(a + "-" + b + "+" + c + "-" + d + "=" + kotae[6]);
        judge = true;
      }
      kotae[7] = a - b - c - d;
      if(kotae[7] == 7 && judge == false){
        System.out.println(a + "-" + b + "-" + c + "-" + d + "=" + kotae[7]);
        judge = true;
      }
  }
}