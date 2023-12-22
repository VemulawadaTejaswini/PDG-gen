import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),f=0,bf=1;
    char[] ch=sc.next().toCharArray();
    for(int i=0;i<n;i++){
      if(ch[i]=='a'){
        if(f<=a+b){
          System.out.println("Yes");
          f++;
        }else{
          System.out.println("No");
        }
      }else if(ch[i]=='b'){
        if(f<=a+b&&bf<=b){
          System.out.println("Yes");
          f++;
          bf++;
        }else{
          System.out.println("No");
        }
      }else{
        System.out.println("No");
      }
    }
  }
}