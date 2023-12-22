import java.util.*;

class Main{
 void main(String[]args){

  Scanner sc=new Scanner(System.in);
  
  int nagasa =sc.nextInt();
  int i[]=new int[nagasa];  //要素数
  for(int j=0; j<i.length; j++){
   i[j]=sc.nextInt();
}
  
   for(int a=0; a< i.length-1; a++) {
            for(int b=0; b < i.length-a-1; b++) {
            	if(i[b] < i[b+1]) {
            		int asc = i[b];
            		i[b] = i[b+1];
            		i[b+1] = asc;
            	}
            }
        }

  for(int n=0; n<i.length-1; n++){
     int x=i[2*n+1];
     int sum=0;
     sum +=x;
     System.out.println(sum);

}
}}