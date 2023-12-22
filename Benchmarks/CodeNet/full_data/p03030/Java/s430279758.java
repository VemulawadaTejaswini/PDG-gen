import java.util.*;

class MyClass {
    private int number;
	private String city;	
	private int point;

	public MyClass (int number,String city,int point){
        this.number=number;
		this.city=city;
		this.point=point;
	}

    public int getnumber(){
        return number;
    }

	public String getcity(){
		return city;
	}

	public int getpoint(){
		return point; 
	}
}

class MyComp implements Comparator<MyClass>{
	public int compare(MyClass  c1,MyClass  c2){
		if((c1.getcity().compareTo(c2.getcity()))==0){
            return(Integer.compare(c2.getpoint(),c1.getpoint()));

        }else{
            return (c1.getcity().compareTo(c2.getcity()));
        }
            
        }
            
		}


public class Main {
	public static void main(String[] args) {
		ArrayList<MyClass> foo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = 0;
        String S = "";
        int P = 0;

        N = sc.nextInt();
        for(int i=1;i<=N;i++){
            S = sc.next();
            P = sc.nextInt();
            foo.add(new MyClass(i,S,P));
        }

        Collections.sort(foo,new MyComp());

        for(MyClass c : foo){
        	System.out.println(c.getnumber());
        }
    }
}