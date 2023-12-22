import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    int tmp = 0;
    int count = 0;
    for(int i=0;i<N;i++){
      tmp = tmp^sc.nextInt();
      count = (count+1)%3;
    }
    if(count==0&&tmp==0){
        System.out.println("Yes");
    }else{
      System.out.println("No");
    }
	}
}
