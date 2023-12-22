import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = k / 2;
        int counter = 0;
        if(k%2==0){
            for(int a=m; a<=n; a+=m){
                for(int b=m; b<=n; b+=m){
                    for(int c=m; c<=n; c+=m){
                        if((a+b)%k!=0){
                            break;
                        }
                        else if((b+c)%k==0 && (c+a)%k==0){
                            counter++;
                        }
                    }
                }
            }
        }
        else{
            for(int a=k; a<=n; a+=k){
                for(int b=k; b<=n; b+=k){
                    for(int c=k; c<=n; c+=k){
                        if((a+b)%k!=0){
                            break;
                        }
                        else if((b+c)%k==0 && (c+a)%k==0){
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}