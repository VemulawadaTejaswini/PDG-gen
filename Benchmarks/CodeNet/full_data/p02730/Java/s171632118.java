import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S=sc.next();
    int N=S.length();
    String Moto[]=S.split("");
    String Hantai[]=new String[N];
    String H2[]=new String[(N-1)/2];
    String H3[]=new String[(N+5)/2];
    boolean first=true;
    boolean second=true;
    boolean third=true;
    if(N%2==0){
      System.out.println("No");
      return;
    }
    for(int i=0;i<N;i++){
      Hantai[i]=Moto[N-1-i];
    }
    for(int i=0;i<(N-1)/2;i++){
      H2[i]=Moto[(N-1)/2-1-i];
    }
    for(int i=0;i<(N+5)/2;i++){
      H3[i]=Moto[N-1-i];
    }
    for(int i=0; i<N-1; i++){
      if(!(Moto[i].equals(Hantai[i]))) {first=false;
        break;}
      }
      for(int i=0;i<(N-1)/2-1;i++){
        if(!(Moto[i].equals(H2[i]))) {second=false;
          break;}

        }
        for(int i=0;i<(N+5)/2-1;i++){
          if(!(Moto[i].equals(H3[i]))) {third=false;
            break;}
          }
          if(first&&second&&third){
            System.out.println("Yes");
          }else{
            System.out.println("No");
          }
        }
      }
