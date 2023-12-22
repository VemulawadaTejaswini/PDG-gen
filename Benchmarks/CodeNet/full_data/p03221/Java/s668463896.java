

import java.util.*;

class admin{
	
	int index=0;;
	int pref=0;
	String city=null;
	
	public admin(int index, int pref, String city){
		this.index = index;
		this.pref = pref;
		this.city=city;
	}
	
	
	
}

class Main {



  public static void main (String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt(); //県の数
    int m = sc.nextInt(); //市の数
 
    admin[][] ad = new admin[n][10000];
    
    ArrayList <admin> array= new ArrayList<>();
    ArrayList <String> ans= new ArrayList<>();
     
    int p=0;
    String c=null;
    
    
    for(int i=0; i<m;i++){
      p= sc.nextInt();
      c = sc.next();
      admin A =new admin(i,p,c);
      array.add(A);
      
      }
    
    sc.close();
    
    
    array.sort((a,b)-> a.city.compareTo(b.city) ); /*ラムダ式*/
    array.sort((a,b)-> a.pref - b.pref ); /*ラムダ式*/
    
    
    
    int tmp = array.get(1).pref;
    int k=1;
    
    for(int i=0; i<m;i++){
    	if(tmp == array.get(i).pref){
    		array.get(i).city=String.format("%06d",k);
    		k++;
    	}else{
    		tmp = array.get(i).pref;
    		array.get(i).city=String.format("%06d",1);
    		k=2;
    	}
    }
    
    array.sort((a,b)-> a.index - b.index ); /*ラムダ式*/
    
    for(int i=0; i<m;i++){
    	System.out.println(String.format("%06d",array.get(i).pref)+array.get(i).city);
    }
 
  }
  }


