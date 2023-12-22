import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int City = sc.nextInt();
    int Temperature= sc.nextInt();
    int Target_Temperature= sc.nextInt();
    int Citys[]=new int[City];
    int Adjust=1;
    for(int i=0;i<City;i++){
     Citys[i]=sc.nextInt();
     Citys[i]=Temperature-(int)(Citys[i]*0.006);
    }
    
    for(int i=0;i<City;i++){
      Citys[i]=Math.abs(Citys[i]-Target_Temperature);
      if(i>0&&Citys[i]<Citys[i-1]){
      	Adjust=i+1;
      }
    }
    System.out.println(Adjust);
  }
}