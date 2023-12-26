class Main {
	public static void main(String[] args) {
		Scanner as = new Scanner(System.in);
        int n=as.nextInt();           
        LinkedList<Integer> list = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){         
            list.add(Integer.parseInt(as.next()));
        }
        for(int l=n-1;l>=0;l--){      
            if(l==0){
            	sb.append(list.removeLast());
            }
            else{
            	sb.append(list.removeLast()).append(" ");
            }
        }
        System.out.println(sb.toString());
	}
}
