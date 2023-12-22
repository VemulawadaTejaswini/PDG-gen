import java.util.*;
public class Main {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s=sc.nextLine();
    String t=sc.nextLine();
    char[] ss=s.toCharArray();
    char[] tt=t.toCharArray();

    boolean[] s_sort=new boolean[26];Arrays.fill(s_sort,false);//文字別出現回数
	for(int i=0;i<ss.length;i++)s_sort[(int)ss[i]-97]=true;
    boolean[] t_sort=new boolean[26];Arrays.fill(t_sort,false);
	for(int i=0;i<tt.length;i++)t_sort[(int)tt[i]-97]=true;
   
   //突き合わせ
   	for(int i=0;i<26;i++){
      if(t_sort[i] && !s_sort[i]){
          		System.out.println(-1);
          		System.exit(0);
       }
    }//とりあえず文字はあることを確認
   
   //単純数え上げ
   long r=-1L; int r_mod=0; int it=0;
   do{r++;
   	for(int is=0;is<ss.length;is++){
    	if(tt[it]==ss[is]){
          r_mod=is+1;
          it++;if(it==tt.length)break;
        }
    }
   }while(it<tt.length);
   
	System.out.println(r*ss.length+r_mod);
 }
}