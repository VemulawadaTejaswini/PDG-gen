public class Main {
	public static void main(String[] args) {
		String[] Lary= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] Sary= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int[] ansBox=new int[26];
        for(int i=0;i<26;i++) {
            ansBox[i]=0;
        }
        Scanner sc=new Scanner(System.in);
        String str;
        while(sc.hasNext()) {
            str=sc.nextLine();
            int n=str.length();
            for(int i=0;i<n;i++) {
                char a;
                a=str.charAt(i);
                for(int j=0;j<26;j++) {
                    if(Lary[j].equals(String.valueOf(a)) || Sary[j].equals(String.valueOf(a))) {
                        ansBox[j]++;
                    }
                }
            }
        }
        for(int i=0;i<26;i++) {
            System.out.println(Sary[i]+" : "+ansBox[i]);
        }
	}
}
