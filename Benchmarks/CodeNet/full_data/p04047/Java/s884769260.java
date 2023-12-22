import java.util.*;
 
 class Main{
 void main(String[]args){
 
  Scanner sc=new Scanner(System.in);
  
  int n =sc.nextInt();
  int[] l=new int[n*2];  
  
  for(int i=0; i<l.length; i++){
   l[i]=sc.nextInt();
}

sc.close();
  Arrays.sort(l);
  
  int ans=0;
  for(int j=0; j<l.length; j+=2){
    ans +=Math.min(l[j],l[j+1]);
}
System.out.println(ans);


}}