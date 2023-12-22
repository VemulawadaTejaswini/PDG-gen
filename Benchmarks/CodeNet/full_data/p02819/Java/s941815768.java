import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = 0;
        int c = 0;
        for(int i=a;i<=100003;i++){if(b>=a){break;}c=0;
        for(int j=1;j<=Math.sqrt(i);j++){if(i%j==0){c++;}
                              if(c==1 && j+1>Math.sqrt(i)){b=i;
                                                          }
                                        }
                                  }
		System.out.println(b);
	}
}
