import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
int a=0;
int b[] =new int[3];
for(int i=0;i<3;i++){
b[i]=sc.nextInt();
}
for(int i=0;i<3;i++){
    if(b[i]==7){
        a=1;
        i=3;
    }
}
if(a==1){
    System.out.println("Yes");
}else{
       System.out.println("No"); 
}
}
}