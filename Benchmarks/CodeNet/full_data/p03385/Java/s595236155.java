import java.util.*;


class Main{

  public static void main(String args[]){

     Scanner s = new Scanner(System.in);
     String str =s.nextLine();

     int n = str.length();

      int arr[] = new int[3];

     for(int i=0;i<n;i++){
     	arr[str.charAt(i)-'a']++;
     }

if(arr[0]==1 && arr[1]==1 && arr[2]==1)
	System.out.println("YES");
else
	System.out.println("NO");

  }

}
