import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ninzu = sc.nextInt();
    int[] iro = new int[8];
    int ziyu = 0;
    int a;
    int kazu = 0;
    for(int i=0; i<ninzu; i++){
      a = sc.nextInt()/400;
      switch(a){
        case 0:
          iro[0] = 1;
          break;
        case 1:
          iro[1] = 1;
          break;
        case 2:
          iro[2] = 1;
          break;
        case 3:
          iro[3] = 1;
          break;
        case 4:
          iro[4] = 1;
          break;
        case 5:
          iro[5] = 1;
          break;
        case 6:
          iro[6] = 1;
          break;
        case 7:
          iro[7] = 1;
          break;
        default:
          ziyu++;
          break;
      }
    }
    for(int o=0; o<8; o++){
      if(iro[o] == 1)
        kazu++;
    }
    if(kazu > 0){
      System.out.print(kazu + " ");
    }else{
      System.out.print(1 + " ");
    }
    kazu += ziyu;
    System.out.print(kazu);
  }
}