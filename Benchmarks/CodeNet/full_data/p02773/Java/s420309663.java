public class Main {
    public static void main(String[] args) {
            ArrayList<String> name = new ArrayList<>();
               ArrayList<Integer> count = new ArrayList<>();
                 ArrayList<String> ans = new ArrayList<>();
               
                  int max=0,n;
               Scanner input=new Scanner(System.in);
                 Scanner inputa=new Scanner(System.in);
                 n=inputa.nextInt();
                 
                 for (int i = 0; i < n; i++) {
                     int c;
                     String s=input.nextLine();
                     if(name.isEmpty()|| !(name.contains(s))){
                         name.add(s);
                         count.add(1);
                        c=1;
                     
                     }
                     else{
                     
                         
                          int k=name.indexOf(s);
                           c=count.get(k);
                          ++c;
                          
                         count.set(k,c);
                     
                     }
                     if(c>max)
                          max=c;
                     
            
                     
        }
                 
               
                         
                         
                     
                 for (int i = 0; i < count.size(); i++) {
                  if(count.get(i)==max){
                  ans.add(name.get(i));
                  }
                    
            
        }
               Collections.sort(ans);
                 
                
            
                     for (String i : ans) {
      System.out.println(i);
    }
              
    }
        
}
