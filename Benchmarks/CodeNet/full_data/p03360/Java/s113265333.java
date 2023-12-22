import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int k=sc.nextInt();

int max = a;
int cd=0;

if(b > max) {
	max = b;
	cd = 1;	
}

if(c > max){
	max =c;
	cd =2;
}

for(int i = 0; i < k; i++) {
max = max *2;
}

if(cd == 0){
  max = max+b+c;
} else if(cd ==1) {
	max= max+a+c;
} else if(cd == 2) {
	max =max+a+b;
}

System.out.println(max);

}
}
