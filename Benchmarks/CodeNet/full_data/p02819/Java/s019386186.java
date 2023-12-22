import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = a;
        int c = 0;
        for(int i=b;i<=100003;i++){c=0;
        for(int j=1;j<=Math.sqrt(i);j++){if(i%j==0){c++;}
                              if(c==1 && j+1>Math.sqrt(i)){b=i;break;
                                                          }
                                        }
                                  }
		System.out.println(b);
	}
}
