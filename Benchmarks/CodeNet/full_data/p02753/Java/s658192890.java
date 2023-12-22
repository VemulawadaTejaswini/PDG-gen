import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner sc = new Scanner(System.in);
		 String name=sc.next();
		 int k=0;
		 for(int i=0;i<3;i++){
			 for(int j=i;j<3;j++){
				 if(!(String.valueOf(name.charAt(i)).equals(String.valueOf(name.charAt(j))))){
					 k++;
				 }
			 }
		 }
		 if(k==0){
			 System.out.print("No");
		 }else{
			 System.out.print("Yes");
		 }
	}

}
