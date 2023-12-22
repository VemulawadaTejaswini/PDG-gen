import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[] names = new String[N];

    int counterM = 0;
    int counterA = 0;
    int counterR = 0;
    int counterC = 0;
    int counterH = 0;

    for(int i = 0; i < N; i++){
      String name = sc.next();
      names[i] = name;
    }

    for(int j = 0; j < N; j++){
      if(names[j].startsWith("M")){
        counterM++;
      }else if(names[j].startsWith("A")){
        counterA++;
      }else if(names[j].startsWith("R")){
        counterR++;
      }else if(names[j].startsWith("C")){
        counterC++;
      }else if(names[j].startsWith("H")){
        counterH++;
      }
    }

    //MAR
    long MAR = counterM * counterA * counterR;
    //MAC
    long MAC = counterM * counterA * counterC;
    //MAH
    long MAH = counterM * counterA * counterH;
    //MRC
    long MRC = counterM * counterR * counterC;
    //MRH
    long MRH = counterM * counterR * counterH;
    //MCH
    long MCH = counterM * counterC * counterH;
    //ARC
    long ARC = counterA * counterR * counterC;
    //ARH
    long ARH = counterA * counterR * counterH;
    //ACH
    long ACH = counterA * counterC * counterH;
    //RCH
    long RCH = counterR * counterC * counterH;

    long total = MAR + MAC + MAH + MRC + MRH + MCH + ARC + ARH + ACH + RCH;

    System.out.println(total);

  }
}