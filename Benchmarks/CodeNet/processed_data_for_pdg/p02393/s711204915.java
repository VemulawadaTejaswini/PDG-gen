public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] l = {a,b,c};
        for(int i = 0 ;i<l.length-1;i++){
            for(int j = l.length-1 ;j > i;j--){
                	if(l[j]<l[j-1]){
                	  int t=l[j];
                	  l[j]=l[j-1];
                	  l[j-1]=t;
                	}
            }
        }
        System.out.println(l[0]+" "+l[1]+" "+l[2]);
    }
}
