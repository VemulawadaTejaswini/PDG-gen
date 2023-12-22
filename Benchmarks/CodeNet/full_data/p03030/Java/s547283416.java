import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Restrunt> a = new ArrayList<>();
        
        
        for(int i =0;i <N;i++){
          	String name = sc.next();
          	int point = sc.nextInt();
          	Restrunt restrunt = new Restrunt(i + 1,name,point);
            a.add(restrunt);
        }
      
        
        Collections.sort(a, new RestruntComparator());

      	for(int j=0;j<a.size();j++){
                  System.out.println(a.get(j).no);
				}
      
    }
    
public static class Restrunt {
    
     private final int no;
     private final String name;
     private final int point;
     
     public Restrunt(int no, String name, int point){
         this.no = no;
         this.name = name;
         this.point = point;
     }
          
     public int getPoint(){
         return this.point;
     }
     
     public String getName(){
         return this.name;
     }
     
     public int setNo(){
         return this.no;
     }

}

public static class RestruntComparator implements Comparator<Restrunt> {

	@Override
	public int compare(Restrunt r1, Restrunt r2) {
		 if((r1.name).compareToIgnoreCase(r2.name) < 0){
		     return -1;
		 }else if((r1.name).compareToIgnoreCase(r2.name) > 0){
		     return 1;
		 }else{
		     return r1.point > r2.point ? -1 : 1;
		 }
	}
}

}