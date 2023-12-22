import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int na=scan.nextInt();
int[] nb=new int[na];

int i=0;
for(i=0;i<na;i++){
    nb[i]=scan.nextInt();
}

int sum=0;
int rul=0;
for(i=0;i<na;i++){
    if(i==0){
        sum=sum+1;
        rul=nb[i];
    }else if(rul>nb[i]){
        sum=sum+1;
        rul=nb[i];
    }
}

System.out.println(sum);
}
}