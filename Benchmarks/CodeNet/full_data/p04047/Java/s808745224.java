import java.util.*;
 
class Main{
 void main(String[]args){
 
  Scanner sc=new Scanner(System.in);
  
  int yousosu =sc.nextInt();
  int l[]=new int[yousosu];  
  
  for(int i=0; i<l.length; i++){
   l[i]=sc.nextInt();
}
  Arrays.sort(l);

  for(int j=0; j<l.length-1; j++){
    int ans=0;
    ans +=Math.min(l[j],l[j+1]);
    System.out.println(ans);
}



}}