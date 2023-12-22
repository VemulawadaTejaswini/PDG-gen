import java.util.*;
class Main {
  public static void main (String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    
		
     int n = sc.nextInt();
     String s = sc.next();
     int q = sc.nextInt();
     
     int[]k = new int [q];
     
     for(int i=0; i<q; i++){
       k[i]=sc.nextInt();
       }
     
     ArrayList<Integer> d = new ArrayList<>();
     ArrayList<Integer> m = new ArrayList<>();
     ArrayList<Integer> c = new ArrayList<>();
     
     
       
     for(int i=0; i<n; i++){
       if(s.charAt(i)=='D'){
          d.add(i);
       }else if(s.charAt(i)=='M'){
          m.add(i);
       }else if(s.charAt(i)=='C'){
          c.add(i);
       }
      }
      
      int ans =0;
      
    for(int j=0; j<q; j++){
     for(int indexm: m){
       //System.out.println(indexm);
       if(indexm==0)continue;
       if(indexm==n-1)break;
       
       ans = ans+find(d, c, indexm, k[j]);
       }
       //System.out.println(c.get(0));
       System.out.println(ans);
       ans=0;
     }
  }
  
  public static int find(List<Integer> d, List<Integer> c, int indexm, int k){
    
    int ans=0;
    for(int dnum : d){
      if(Math.abs(dnum-indexm)>=k)continue;
      if(dnum>=indexm)break;
         for(int cnum : c){
           if(cnum<= indexm)continue;
           if(Math.abs(cnum-dnum)>=k)break;
 
           ans++;
           //System.out.println("dnum "+ d+" cnum "+c+" ans "+ans);
         }
     }
     return ans;
   }
   
}