import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int st=sc.nextInt();
    int[] ten={0,sc.nextInt(),sc.nextInt(),sc.nextInt()};
    String t=sc.next();
    int flag;
    int ans=0;
    for(int i=0;i<st;i++){
      flag=0;
      for(int j=i;j<n;j+=st){
        if(flag==tete(t.charAt(j))){
          flag=0;
        }else{
          flag=tete(t.charAt(j));
        }
        ans+=ten[flag];
      }
    }
    System.out.println(ans);
  }
  static int tete(char c){
    if(c=='r'){
      return 3;
    }else if(c=='s'){
      return 1;
    }else if(c=='p'){
      return 2;
    }else{
      return -1;
    }
  }
}