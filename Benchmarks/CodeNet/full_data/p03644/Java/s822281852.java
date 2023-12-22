import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int two[] = {1,2,4,8,16,32,64};
int max = 0;
for(int i = 0;i<7;i++){
if(two[i] > N) break;
max = i;
}


System.out.println(two[max]);

} 
}