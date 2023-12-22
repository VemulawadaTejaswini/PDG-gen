import java.util.*;
public class Main {
    public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
      	String p[] = new String[n];
      	int pcnt[] = new int[n];
      	int cnt = 0;
      	for(int i=0;i<p.length;i++){
          p[i] = sc.next();
          for(int t=0;t<i;t++){
            if( p[i]==p[t] ){
              pcnt[t]++;
              if( pcnt[t]>cnt ){
                cnt = pcnt[t];
              }
            }
          }
        }
      int num = 0;
        for(int i=0;i<pcnt.length;i++){
          if(pcnt[i]==cnt){
            num++;
          }
        }
      String ans[] = new String[num];
      int count = 0;
      for(int i=0;i<pcnt.length;i++){
          if(pcnt[i]==cnt){
            ans[count] = p[i];
            count++;
          }
      }
      for(int i=0;i<ans.length;i++){
        String tmp = ans[i];
        int tmpint = i;
        for(int j=i;j<ans.length;j++){
          if( tmp.compareTo(ans[j]) > 0 ){
            tmp = ans[j];
            tmpint = j;
          }
        }
        ans[tmpint] = ans[i];
        ans[i] = tmp;
      }
      for(int i=0;i<ans.length;i++){
        System.out.println(ans[i]);
      }
      
 
    }
}