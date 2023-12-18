public class Main {
    public static void main(String[] args){
    	Scanner std = new Scanner(System.in);
    	int x,i;
    	for(i=1;i <= 10000;i++){
    		x=std.nextInt();
    		if(x==0)
    		break;
        System.out.println("Case"+" "+i+":"+" "+x);
    	}
        std.close();
}
}
