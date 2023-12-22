import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      	ArrayList<String> o=new ArrayList<>();
        int n=sc.nextInt();
      ArrayList<String> s=new ArrayList<>();
        for(int i=0;i<n;i++){
            s.add(sc.next());           
        }
      Collections.sort(s);
      int m=0;
      int now=0;
      String bs="";
    	for(int i=0;i<n;i++){     
        	String as=s.remove(0);
          //System.out.println(as+" " +now);
          if(as.equals(bs)){
          	now++;
            if(i==n-1){
            	if(now==m){
            	o.add(bs);
              
                }else if(now>m){  

                    o.clear();
                    o.add(bs);
                    m=now;
                }
            }
          }else {
          	if(now==m){
            	o.add(bs);
              
            }else if(now>m){  
              
            	o.clear();
              	o.add(bs);
              	m=now;
            }
            now=0;
          }
          
          bs=as;
          
        }
      Collections.sort(o);
   
      while(o.size()>0){
      	System.out.println(o.remove(0));
      }
    }
    
}