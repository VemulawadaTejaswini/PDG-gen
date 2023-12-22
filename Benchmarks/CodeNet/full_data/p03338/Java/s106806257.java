import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        String s = sc.next();
        String[] split;
        char[] split2;
      	char[] split3;
      	int check1[] = new int[26];
        int check2[] = new int[26];
      	int i,j,t;	
        int count = 0;
        int end = 0;
      	
      	for(i = 2; i <= n;i++){
          
          
          
          split  = s.split("",i);
              StringBuilder sb = new StringBuilder();
          	  for(j=0;j < i - 1; j++){
              sb.append(split[j]);
              }

          split[0] = sb.toString();
          split[1] = split[i -1];
          
          
          split2 = split[0].toCharArray();
          split3 = split[1].toCharArray();
          
          for(j = 0 ; j < 26; j ++){
            check1[j] = 0;
            check2[j] = 0;
          }

          for(j=0;j < split[0].length(); j++){
            for(t = 97; t <=122;t++){
              if((int)split2[j] == t){
                check1[t - 97] = 1;
              }else{
                if(check1[t - 97] != 1){
                check1[t - 97] = 0;
                }
              }
            }
          }
          
          for(j=0;j < split[1].length(); j++){
			 for(t = 97; t <=122;t++){
              if((int)split3[j] == t){
                check2[t - 97] = 1;
              }else{
                if(check2[t - 97] != 1){
                check2[t - 97] = 0;
                }
              }
            }
          } 
          count = 0;
          for(j = 0;j<26;j++){
              if(check1[j] == 1 && check2[j] == 1){
                count += 1;
              }       
          }
          
          if(end < count){
            end = count;
          }
        }
        System.out.println(end);
    }
} 