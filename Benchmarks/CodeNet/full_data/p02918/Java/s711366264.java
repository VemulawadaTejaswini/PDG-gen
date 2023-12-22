import java.util.*;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      char[] c = sc.next().toCharArray();
      int cntR = 0;
      int cntL = 0;
      int res = 0;
      char x = 'a';
      char y = 'a';
      for(int i = 0;i < n;i++){
      	if(c[i]=='R')cntR++;
        else cntL++;
      }
      if(cntR>=cntL){
        x = 'R';
        y = 'L';
      }else{
      	x = 'L';
        y = 'R';
      }
      for(int i = 0;i < n-1;i++){
      	if(c[i]=='R'&&c[i]==c[i+1])res++;
      }
      for(int i = 1;i < n;i++){
      	if(c[i]=='L'&&c[i]==c[i-1])res++;
      }
      
      for(int i = 0;i < c.length-1&&k > 0;i++){
        if(c[i]==x&&c[i+1]==y){
            res+=2;
            k--;
        }
        if(i==0&&x=='L')res--;
        if(i==n-1&&x=='R')res--;
      }
      
      if(c[0]=='L'&&x=='R'&&k > 0){
        k--;
        res++;
      }
      if(c[n-1]=='L'&&x=='L'&&k > 0){
        k--;
        res++;
      }
      System.out.println(res);
    }
}
