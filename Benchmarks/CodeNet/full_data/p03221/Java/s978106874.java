

import java.util.*;

class admin/* implements Comparable<admin>*/{
	
	int index;
	int pref;
	int city;
	
	public admin(int index, int pref, int city){
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
 
    ArrayList <admin> array= new ArrayList<>();
    ArrayList <String> ans= new ArrayList<>();
     
    int pref=0;
    int city=0;;
    
    
    for(int i=0; i<m;i++){
      pref= sc.nextInt();
      city = sc.nextInt();
      admin A =new admin(i,pref,city);
      array.add(A);
      
      }
    
    sc.close();
    
    
    array.sort((a,b)-> a.city - b.city ); /*ラムダ式*/
    array.sort((a,b)-> a.pref - b.pref ); /*ラムダ式*/
    
    
    
    int tmp = array.get(1).pref;
    int k=1;
    
    for(int i=0; i<m;i++){
    	if(tmp == array.get(i).pref){
    		array.get(i).city=k;
    		k++;
    	}else{
    		tmp = array.get(i).pref;
    		array.get(i).city=1;
    		k=2;
    	}
    }
    
    array.sort((a,b)-> a.index - b.index ); /*ラムダ式*/
    
    for(int i=0; i<m;i++){
    	System.out.println(String.format("%06d",array.get(i).pref)+String.format("%06d",array.get(i).city));
    }
 
  }
  }


