import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	char[] s = sc.next().toCharArray();
      	int a, z;
      	int i = 0;
      	int j = s.length-1;
      	while(true){
        	if(s[i] == 'A'){
              	a=i;
          		break;
            }
          	i++;
        }
      	while(true){
         	if(s[j] == 'Z'){
            	z=j;
              	break;
            }
          	j--;
        }
      	System.out.println(j-i+1);
    }
}