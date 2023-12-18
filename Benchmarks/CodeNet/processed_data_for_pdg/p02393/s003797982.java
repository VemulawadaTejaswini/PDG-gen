public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int s,i,j;
        int[] n=new int[3];
        for(i=0;i<3;i++){
            n[i]=scan.nextInt();
        }
        for(i=0;i<2;i++){
        	for(j=i;j<3;j++){
        		if(n[i]>n[j]){
        			s=n[i];
        			n[i]=n[j];
        			n[j]=s;
        		}
        	}
        }
        for(i=0;i<3;i++){
            System.out.print(n[i]);
            if(i==2)break;
            System.out.print(" ");
        }
        System.out.println("");
    }
}
