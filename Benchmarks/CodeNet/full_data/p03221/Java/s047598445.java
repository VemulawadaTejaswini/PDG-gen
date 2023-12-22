import java.util.*;
class Main {
  public static void main (String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt(); //県の数
    int m = sc.nextInt(); //市の数
 
//ArrayList <String> array= new ArrayList<>();

    int []pref = new int [m];
    int []city = new int [m];
    int []num = new int [m];
    
    
    String []ans = new String [m];
    
    int index =0;
  
    
    for(int i=0; i<m;i++){
      pref[i] = sc.nextInt();
      city[i] = sc.nextInt();
      num[i] =i;
      index =i;
      //array[i] =String.format("%06d",pref)+String.format("%06d",city));
      for(int j =index-1; 0<=j; j--){
        if(pref[index]<=pref[j]){
          if(city[index]<city[j]){
            int preftmp = pref[j];
            pref[j] = pref[index];
            pref[index] = preftmp;
            int citytmp = city[j];
            city[j] = city[index];
            city[index] = citytmp;
            int numtmp = num[j];
            num[j] = num[index];
            num[index] = numtmp;
            index=j;
            }
          }
      }
    }
    
    int count=0;
       
      for(int i=0; i<m; i++){
        if(i==0){
           count=1;
           
         } else if(pref[i]!=pref[i-1] ){
           count=1;
           
         }else{
          count++;;
          }
          ans[num[i]]=String.format("%06d",pref[i])+String.format("%06d",count);
          
      
     }
    
    
    for(int i=0; i<m; i++){
      System.out.println(ans[i]);
      }


  }
}