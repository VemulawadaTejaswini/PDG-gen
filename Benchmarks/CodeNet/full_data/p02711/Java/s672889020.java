import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
int a=0;
int b=sc.nextInt();
 String []c=String.valueOf(b).split("");
for(int i=0;i<c.length;i++){
    if(c[i].equals("7")){
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