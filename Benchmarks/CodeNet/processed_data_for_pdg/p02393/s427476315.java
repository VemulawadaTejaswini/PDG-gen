public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	if(x>y){
	    if(z>x){
                System.out.printf("%d %d %d\n",y,x,z);
	    }	else if (y>z) {
                System.out.printf("%d %d %d\n",z, y, x );
	    }else System.out.printf("%d %d %d\n",y ,z ,x);
	}else if(z>y){
	    System.out.printf("%d %d %d\n",x, y, z);
	}else if(x>z){
	    System.out.printf("%d %d %d\n",z, x, y);
	}else System.out.printf("%d %d %d\n",x ,z, y);
    }
}  
