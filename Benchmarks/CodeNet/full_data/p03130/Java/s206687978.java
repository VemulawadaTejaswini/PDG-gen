import java.util.Scanner;

public class Main{
  static int count1 = 0;
  static int count2 = 0;
  static int count3 = 0;
  static int count4 = 0;

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<6;i++){
    int N = sc.nextInt();

    switch(N){
      case 1:
        count1++;
        break;
      case 2:
        count2++;
        break;
      case 3:
        count3++;
        break;
      case 4:
        count4++;
        break;
    }
  }

  if(count1==2 || count2==2 || count3==2 || count4==2){
    if(count1==1 || count2==1 || count3==1 || count4==1){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
  else{
    System.out.println("NO");
  }


  }
}