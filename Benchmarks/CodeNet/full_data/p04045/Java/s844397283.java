import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int price = sc.nextInt();
      	int dislikeNumsCount = sc.nextInt();
      	int payment=0;
      	List<Integer> nums = new ArrayList<>();
      	for (int i=0;i<10;i++){
        	nums.add(i);
        }
      	for(int i=0;i<dislikeNumsCount;i++){
          int dislikeNum = sc.nextInt();
          if(nums.contains(dislikeNum)){
          	nums.remove(nums.indexOf(dislikeNum));
          }
        }
 		if(price<10){
          	int onesDigit=0;
         	while(int i=0;i<nums.size();i++){
        		int onesDigit=nums.get(i);
          		if(onesDigit>price){
              	break;
        		}
        	}
            payment=onesDigit;
        }else if(price>=10 && price<100){
        	int tensDigit=0;
          	int onesDigit=0;
        	while(int i=0;i<nums.size();i++){
        		tensDgit=nums.get(i);
          		if(tenDigit*10>price){
              	break;
        		}
        	}
         	while(int i=0;i<nums.size();i++){
        		onesDigit=nums.get(i);
          		if(tensDigit*10+onesDigit>price){
              	break;
        		}
        	}
         	payment=tensDigit*10+onesDigit;
		}else if(price>=100 && price<1000){
        	int hundredsDigit=0;
        	int tensDigit=0;
          	int onesDigit=0;
           	while(int i=0;i<nums.size();i++){
              hundredsDigit=nums.get(i);
              if(hundredsDigit*100>price){
                break;
              }
       		}
        	while(int i=0;i<nums.size();i++){
        		tensDigit=nums.get(i);
          		if(hundredsDigit*100+tensDigit*10>price){
              	break;
        		}
        	}
         	while(int i=0;i<nums.size();i++){
        		onesDigit=nums.get(i);
          		if(hundredsDigit*100+tensDigit*10+onesDigit>price){
              	break;
        	}
            payment=hundredsDigit*100+tensDigit*10+onesDigit;
        }else if(price>=1000 && price<10000){
            int thousandsDigit=0;
        	int hundredsDigit=0;
        	int tensDigit=0;
          	int onesDigit=0;
            while(int i=0;i<nums.size();i++){
              thousandsDigit=nums.get(i);
              if(thousandsDigit*1000>price){
                break;
              }
       		}
           	while(int i=0;i<nums.size();i++){
              hundredsDigit=nums.get(i);
              if(thousandsDigit*1000+hundredsDigit*100>price){
                break;
              }
       		}
        	while(int i=0;i<nums.size();i++){
        		tenDgit=nums.get(i);
          		if(thousandsDigit*1000+hundredsDigit*100+tensDigit*10>price){
              	break;
        		}
        	}
         	while(int i=0;i<nums.size();i++){
        		onesDigit=nums.get(i);
          		if(thousandsDigit*1000+hundredsDigit*100+tensDigit*10+onesDigit>price){
              	break;
        	}
            payment=thousandsDigit*1000+hundredsDigit*100+tensDigit*10+onesDigit;
        }
       	System.out.println(payment);
   		sc.close();
	}
}