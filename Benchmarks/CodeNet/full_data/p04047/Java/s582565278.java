import java.util.*;

class Main{
 void main(String[]args){

  Scanner sc=new Scanner(System.in);
  
  int nagasa =sc.nextInt();
  int i[]=new int[nagasa];  //要素数
  for(int j=0; j<i.length; j++){
   i[j]=sc.nextInt();
}
  
  Arrays.sort(i,Comparator.reverseOrder());

  for(int n=0; n<i.length-1; n++){
     int x=i[2*n+1];
     sum +=x;
     System.out.println(sum);

}
}}