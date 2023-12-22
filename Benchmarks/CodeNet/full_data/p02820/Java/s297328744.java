import java.util.Scanner;

public class Main{
  public static void main(String[] args){

  Scanner scan=new Scanner(System.in);
  int N=scan.nextInt();
  int K=scan.nextInt();
  int R=scan.nextInt();
  int S=scan.nextInt();
  int P=scan.nextInt();
  String T=scan.next();
  long point=0;
  long maxpoint=0;
  char[] method=new char[N];
  char[] pair=new char[N];
  int check=0;
  char[] correct=new char[N];
  
  for(int h=0;h<=T.length()-1;h++){
    pair[h]=T.charAt(h);
  }
  
  for(int i=0;i<=Math.pow(3,N)-1;i++){
    if(i%3==0){
      method[0]='r';
    }
    else if(i%3==1){
      method[0]='s';
    }
    else{
      method[0]='p';
    }
   for(int j=1;j<N;j++){
     if((i/(Math.pow(3,j)))%3==0){
       method[j]='r';
     }
     else if((i/(Math.pow(3,j)))%3==1){
       method[j]='s';
     }
     else if((i/(Math.pow(3,j)))%3==2){
       method[j]='p';
     }
   }   
    
    for(int m=K;m<N;m++){
      if(method[m]==method[m-K]){
        check=1;
        break;
      }
      else{
      }
    }
    
    if(check==0){
      for(int n=0;n<N;n++){
        if((method[n]=='r')&&(pair[n]=='s')){
          point+=R;
        }
        else if((method[n]=='s')&&(pair[n]=='p')){
          point+=S;
        }
        else if((method[n]=='p')&&(pair[n]=='r')){
          point+=P;
        }
      }
    }
        
    if((maxpoint<point)&&(check==0)){
       maxpoint=point;
       correct=method;
       }
        point=0;
        check=0;
    }
    System.out.println(maxpoint);
    System.out.println(correct);
  }
}