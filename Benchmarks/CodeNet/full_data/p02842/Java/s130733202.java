import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();

int[] mon=new int[46298];
int i=0;
for(i=0;i<46298;i++){
mon[i]=(int)(((double)i)*1.08);
}

i=0;
int dif=0;
for(i=0;i<46298;i++){
    if(num==mon[i]){
    System.out.println(i);
    break;
    }else{
    dif=dif+1;
    }
}
if(dif==46298){
System.out.println(":(");
}
  
  
}
}