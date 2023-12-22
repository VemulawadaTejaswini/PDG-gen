import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int len = S.length();
        int flag  = 0;
        int flag2 = 0;
        int flag3 = 0;
        int kazu = 0;
      
      if(S.charAt(0)=='A'){flag=1;}
      for(int i = 2; i<len-1;i++){
        if(S.charAt(i)=='C'){flag2++;};
      }
      for(int j = 0;j<len;j++){
        if(S.charAt(j)>='a'&&S.charAt(j)<='z')
        {kazu++;}
      } if(kazu==len-2){flag3=1;}
      
      if(flag+flag2+flag3==3){System.out.print("AC");}
      else{System.out.print("WA");}

      
      

    }
}