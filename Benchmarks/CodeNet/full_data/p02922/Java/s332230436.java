import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int i = 1;
int n =0;
while(true){
i --;
i += a;
n++;
        if (i>b){
                        break;
}
}
System.out.println(n);



        sc.close();
    }
}
