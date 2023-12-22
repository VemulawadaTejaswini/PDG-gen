import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String S = sc.next();
    char before = S.charAt(0);
    int tmpind =0;
    int tmpcnt =1;
    int renketsu[] = new int[n];
    for(int i=1;i<n;i++){
      if(before==S.charAt(i)){
        tmpcnt=tmpcnt+1;
        
      }else{
        renketsu[tmpind]=tmpcnt;
        tmpind=tmpind+1;
        tmpcnt=1;
        before=S.charAt(i);
      }
      
    }
    
    if(tmpcnt!=1){
      renketsu[tmpind]=tmpcnt;
    }
    int s[] = new int[n+1];
    int tmp=0;
    s[0]=renketsu[0];
    for(int i=0;i<tmpind;i++){
      s[i+1]=s[i]+renketsu[i+1];
    }
    
    int answer = 0;
    for(int i=0;i<n-k-2;i++){
       if(answer<=s[i+k+2]-s[i]){
         answer=s[i+k+2]-s[i];
       }
    }
    if(answer<=s[k+2]){
      answer = s[k+2];
    }
    System.out.println(answer);
    
        
          
        
  }
}