import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	String s = sc.nextLine();
      	String t = sc.nextLine();
      	long count = 0;
      	int zz=0,j=0;
      	for(int i=0;i<t.length();i++){
          	String tsub = t.substring(i,i+1);
          	for(;;j=(j+1)%s.length()){
              	count++;zz++;
              	if(tsub.equals(s.substring(j,j+1))){
                	j++;
                  	z=0;
                  	break;
                }
              	if(zz==s.length()){
                	count = -1;
                  	break;
                }
            }
          	if(count==-1){break;}
        }
      	System.out.println(count);
    }
}