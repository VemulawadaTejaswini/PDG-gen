
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Main{
	
	public int index;
	public int value;
	public String name;
	
	
	
	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	Main(int value,String name,int index){
		this.value=value;
		this.name=name;
		this.index=index;
	}
	

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	String[] S=new String[N];
	List list=new ArrayList();
	int[] P=new int[N];
	int[] sr=new int[N];
	for(int i=0;i<N;i++) {
		S[i]=sc.next();
		P[i]=sc.nextInt();
		Main main=new Main(P[i],S[i],i+1);
		list.add(main);
	}
	Collections.sort(list, new Comparator<Main>() {
	    public int compare(Main v1, Main v2) {
	        return v1.name.compareTo(v2.name);
	    }
	});
	
	Collections.sort(list, new Comparator<Main>() {
	    public int compare(Main v1, Main v2) {
	        if(v1.name.equals(v2.name)) {
	        	
	        	return v2.value-v1.value;
	        }
	        return 0;
	    }
	});
	
	for(int i=0;i<N;i++) {
		System.out.println(((Main)list.get(i)).getIndex());
	}
	
	


	}
	

	
}
	