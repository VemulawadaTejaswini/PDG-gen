import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int res = 0;
        int 
        for(int a=0; a<=1000; ++a){
            for(int b=0; b<=1000; ++b){
                for(int c=0; c<=50; ++c){
                    for(int d=0; d<=25; ++d){
                        for(int e=0; e<=20; ++e){
                            int total = a * 100 + b * 103 + c * 102 + d * 104 + e * 105;
                            if(total == X){
                                res=1;
                            }

                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}
