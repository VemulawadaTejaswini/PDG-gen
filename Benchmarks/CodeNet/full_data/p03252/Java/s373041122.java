import java.util.*; 
public class Main {

  public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  String t=sc.next();
  int l=s.length();
  char x;
  int ind;
  boolean ans=true;
  char a[]=new char[27];
  char b[]=new char[27];
  for(int i=0;i<l;i++){
     x=s.charAt(i);
     ind=x-'a';
    if(a[ind]==0){
      a[ind]=t.charAt(i);
      
      if(b[(int)(t.charAt(i)-'a')]==1){
        ans=false;
        break;
      }
      b[(int)(t.charAt(i)-'a')]=1;
    }else if(t.charAt(i)!=a[ind]){
      ans=false;
    }
    
  }
  
  
  System.out.println(ans?"Yes":"No");
  
  }
  
}