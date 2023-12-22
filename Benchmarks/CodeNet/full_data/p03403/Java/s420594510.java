import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
        Scanner sn = null;
        int ans=0;
        try {
            sn = new Scanner(System.in);
            List<String> list = new ArrayList<String>();

            while (sn.hasNextLine()) {
                String str = sn.nextLine();
                if ("".equals(str)) {
                    break;
                }

                list.add(str);
            }
            String A=list.get(1);
            String[] list2=A.split(" ");

            ArrayList<Integer> hoge = new ArrayList<Integer>();
            ArrayList hoge2 = new ArrayList<Integer>();

            for(String a:list2){
            	hoge.add(Integer.parseInt(a));
            }
            for(int i=0;i<Integer.parseInt(list.get(0));i++){

            	for(int j=0;j<Integer.parseInt(list.get(0));j++){
                	ans = ans+Math.abs(hoge.get(j)-hoge.get(j+1));

            	}
            	System.out.println(ans);
            }

        } finally {
            if (sn != null) {
                sn.close();
            }
        }
    }


}
