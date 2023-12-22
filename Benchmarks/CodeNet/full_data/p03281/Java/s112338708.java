import java.util.*;
	class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0;

        for(int i=1;i<=n;i=i+2){
            int a = 0;
            for(int m=1;m<=i;m++){
                
                if(0==i%m){
                    a++;
                }
                if(a==8){
                    j++;
                }
            }
        }
        System.out.println(j);
    }
}