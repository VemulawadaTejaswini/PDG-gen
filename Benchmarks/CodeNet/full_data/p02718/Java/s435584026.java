import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int suma=0;
      	String populares=0;
		int n = sc.nextInt();
		int m = sc.nextInt();
      	int a[] = new int[n];
      	
		for(int i=0;i<=n;i++)
        {
          a[i]= sc.nextInt();
          suma+=a[i];
        }
      for(int i=0;i<=n;i++)
        {
          a[i]= sc.nextInt();
          if(a[i]>=suma/(4*m))
          {
            pupulares++;
          }
        }
      	if(populares>=m)
        {
          System.out.println(("Yes")); 
        }else
        {
          System.out.println(("No"));
        }
		
	}
}