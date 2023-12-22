import java.util.*;
import java.util.Comparator;
 
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);       
        String n=sc.next();
        int k=sc.nextInt();
        long o=0;
        int l=n.length();
        int a0=Character.getNumericValue(n.charAt(0));
        if(k==1){
        	o=9*(l-1)+a0;
        }else if(k==2&&l>=2){
        	o+=(81*(l-1)*(l-2))/2;	//一桁目が0の場合
            o+=(l-1)*9*(a0-1);	//一桁目がa0未満
            int ind=l-1;	//二回目に0以外が出るindex
            for(int i=1;i<l;i++){
            	if(n.charAt(i)!='0'){
                	ind=i;
                  o+=(l-1-ind)*9+Character.getNumericValue(n.charAt(ind));
                    break;
                }
            }
            
        }else if(k==3&&l>=3){
          
          o+=(729*(l-1)*(l-2)*(l-3))/6;
          o+=81*(a0-1)*((l-1)*(l-2))/2;
          int ind1=l-1;	//二回目に0以外が出るindex
          int ind2=l-1;
            for(int i=1;i<l;i++){
            	if(n.charAt(i)!='0'){
                	ind1=i;
                    o+=(81*(l-1-ind1)*(l-2-ind1))/2;
          o+=(l-1-ind1)*(Character.getNumericValue(n.charAt(ind1))-1)*9;
                    for(int j=2;j<l;j++){
                    	if(n.charAt(j)!='0'){
                        	ind2=j;
                            o+=(l-1-ind2)*9+Character.getNumericValue(n.charAt(ind2));
                            break;
                        }
                    }
                    break;
                }
            }
          
          
        }
      System.out.println(o);
    }
}