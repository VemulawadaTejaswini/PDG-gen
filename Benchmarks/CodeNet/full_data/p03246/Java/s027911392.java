import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //1.値の取得    
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nums[] = new int[num];
        for(int i=0; i<num; i++){
            nums[i] = Integer.parseInt(sc.next());
        }
        int finalans =0;
        
        ArrayList<ArrayList<Integer>> od1 = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> ev1 = new ArrayList<ArrayList<Integer>>();
        
        //2.「get_OE」メソッドで、偶数or奇数の数字群について、各数の個数を洗い出しています。
        //[od1/ev1].get().get(0)は実際の数字
        //[od1/ev1].get().get(1)はその出現回数
        od1 = get_OE(num,nums,0);
        ev1 = get_OE(num,nums,1);
        
        ArrayList<Integer> chknum = new ArrayList<Integer>();
        chknum = check_1(num,od1,ev1);
        ////System.out.println("::::::::::::"+chknum.get(2));
        if(chknum.size()>0){    finalans = chknum.get(2);   }
        //
        //奇数の場合
        // if(chknum.get(0)==0){
        //     od1 = check_1_fix(num,od1,ev1,chknum);
        // }else{
        //     ev1 = check_1_fix(num,od1,ev1,chknum);
        // }
        //元の数列も値をTemp値に書き換える
        if(chknum.size()>0){
            nums = check_1_fix2(num, nums, chknum.get(0), chknum);
        }
        
        //<Temp>状況が変化したかチェック
        od1 = get_OE(num,nums,0);
        ev1 = get_OE(num,nums,1);
        
        int odfix=0; int evfix=0;
        evfix = check_2(num,nums,0);
        odfix = check_2(num,nums,1);
        finalans = finalans+odfix+evfix;
        System.out.println(finalans);
    }
    
    
    // OorEは奇数なら「0」を、偶数なら「1」を入力する
    public static ArrayList<ArrayList<Integer>> get_OE(int a_num, int[] a_nums, int OorE){
        
        //最終的にreturnする入れ物
        ArrayList<ArrayList<Integer>> rec = new ArrayList<ArrayList<Integer>>();

        //1.偶数/奇数の数字についてチェック
        for(int i=OorE; i<a_num; i+=2){
            //フラグの初期化処理
            boolean tempflg=false;
            int tempposi=0;
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            //1.新しい数があったらカウントアップ
            //System.out.print("---i="+i);
            if(i==OorE){
                tmp.add(a_nums[i]);
                tmp.add(1);
                rec.add(tmp);
                ////System.out.println("------初回新規  No "+a_nums[i]+" Total: "+1);
            }else{
                for(int j=0; j<rec.size(); j++){
                    //if分岐：既存の数字である場合、それ以外は新規の数字の場合
                    if(rec.get(j).get(0)==a_nums[i]){
                        tempflg = true;
                        tempposi = j;
                    }
                }
                //フラグを見て、カウンタを更新
                if(tempflg == true){
                    rec.get(tempposi).set(1, rec.get(tempposi).get(1)+1 );
                    ////System.out.println("------　既存　  No "+rec.get(tempposi).get(0)+" Total: "+rec.get(tempposi).get(1));
                } else{
                    tmp.add(a_nums[i]);
                    tmp.add(1);
                    rec.add(tmp);
                    ////System.out.println("------　新規　  No "+a_nums[i]+" Total: "+1);
                }
            }            
        }
        for(int i=0; i<rec.size(); i++){
            for(int j=0; j<rec.get(i).size(); j++){
                //System.out.print(rec.get(i).get(j)+" ");
            }
            //System.out.println("");
        }
        
        return rec;
    }
    
    //注意：実行する時は「result.size()>0」に注意して実行する
    public static int[] check_1_fix2(int a_num, int[] a_nums, int OorE, ArrayList<Integer> result){
        
        //OorE(実際はresult.get(0))とresult.get(1)の値を見て、a_numsの値を更新する
        //１．奇数の場合
        for(int i=OorE; i<a_num; i+=2){
            if(a_nums[i]==result.get(1)){
                a_nums[i] = 100001;
            }
        }
        return a_nums;
    }
    
    // //取得したResultの値をベースに数字の修正を行う。
    // //具体的には、最頻値が偶数＆奇数でバッティングした場合、少ない方の最頻値をTemp数に書き換える
    // //これを行う事で、通常のフローでチェックを行う事ができる
    // public static ArrayList<ArrayList<Integer>> check_1_fix(int a_num, ArrayList<ArrayList<Integer>> a_od, ArrayList<ArrayList<Integer>> a_ev, ArrayList<Integer> result){
        
    //     //奇数の場合
    //     if(result.get(0)==0){
    //         for(int i=0; i<a_od.size(); i++){
    //             //奇数のライナップで最頻値と一致する場合はTemp数に書き換え
    //             if(a_od.get(i).get(0)==result.get(1)){
    //                 a_od.get(i).set(0,100001);
    //             }
    //         }
    //         return a_od;
    //     }
    //     //偶数の場合
    //     else{
    //         for(int i=0; i<a_ev.size(); i++){
    //             //偶数のライナップで最頻値と一致する場合はTemp数に書き換え
    //             if(a_ev.get(i).get(0)==result.get(1)){
    //                 a_ev.get(i).set(0,100001);
    //             }
    //         }
    //         return a_ev;
    //     }
        
    // }
    
    //1.例外パターン：eとoに同じ数が含まれている
    //1-1.被ってる数と最頻値が同じ場合
    //get_OEについて、偶数と奇数の結果を比べる
    public static ArrayList<Integer> check_1(int a_num, ArrayList<ArrayList<Integer>> a_od, ArrayList<ArrayList<Integer>> a_ev ){
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        //偶数側のMAXを調査
        int ev_max=0; int ev_num=0;
        for(int i=0; i<a_ev.size(); i++){
            if(ev_num < a_ev.get(i).get(1)){
                ev_max = a_ev.get(i).get(0);
                ev_num = a_ev.get(i).get(1);
            }
        }

        //奇数側のMAXを調査
        int od_max=0; int od_num=0;
        for(int i=0; i<a_od.size(); i++){
            ////System.out.println("==== "+od_max+"==== "+a_od.get(i).get(1));
            if(od_num < a_od.get(i).get(1)){
                od_max = a_od.get(i).get(0);
                od_num = a_od.get(i).get(1);
            }
        }
        ////System.out.println("**** "+od_max+"**** "+od_num+"**** "+ev_max+"**** "+ev_num);
        
        //もし最大値が同じの場合、更に大小を比べてどちらを直すか決める
        if(ev_max == od_max && ev_num >= od_num){
            result.add(0);  //少数派の奇数側で修正が必要
            result.add(od_max);
            result.add(od_num);
        }else if(ev_max == od_max && ev_num < od_num){
            result.add(1);
            result.add(ev_max);
            result.add(ev_num);           
        }
        
        for(int i=0; i<result.size(); i++){
            //System.out.print(" --@@@ "+result.get(i));
        }
        //System.out.println("");
        
        return result;
    }
    
    //1-2.被っている数と最頻値が異なる場合
    //2.通常パターン：eとoの数字が異なる場合　→　最頻値に合わせるでOK
    public static int check_2(int a_num, int[] a_nums, int OorE){
        int a_fixnum=0;
        ArrayList<Integer> rec = new ArrayList<Integer>();
        ArrayList<Integer> reccnt = new ArrayList<Integer>();
        
        //1.偶数の数字についてチェック
        for(int i=OorE; i<a_num; i+=2){
            //フラグの初期化処理
            boolean tempflg=false;
            int tempposi=0;
            //1.新しい数があったらカウントアップ
            //System.out.print("---i="+i);
            if(i==OorE){
                rec.add(a_nums[i]);
                reccnt.add(1);
                //System.out.println("------初回新規  No "+a_nums[i]+" Total: "+1);
            }else{
                for(int j=0; j<rec.size(); j++){
                    //if分岐：既存の数字である場合
                    //else分岐：新規の数字である場合
                    if(rec.get(j)==a_nums[i]){
                        tempflg = true;
                        tempposi = j;
                    }
                }
                //フラグを見て、カウンタを更新
                if(tempflg == true){
                    reccnt.set(tempposi,reccnt.get(tempposi)+1);
                    //System.out.println("------　既存　  No "+a_nums[i]+" Total: "+reccnt.get(tempposi));
                } else{
                    rec.add(a_nums[i]);
                    reccnt.add(1);
                    //System.out.println("------　新規　  No "+a_nums[i]+" Total: "+1);
                }
            }
        }
        //2.Maxの数を取得する
        for(int j=0; j<rec.size(); j++){
            //もし偶数間or奇数間で複数種類の数字がある場合は、最小を取る
            //一方で偶数間or奇数間で数字がそれぞれ1種類しかない場合は修正の必要がないため、0をセットする
            if(reccnt.get(j)>a_fixnum && reccnt.size()>1){
                a_fixnum = reccnt.get(j);
            }
            else if(reccnt.size()==1){
                a_fixnum = 0;
            }
        }
        ////System.out.println("*************"+a_fixnum+"  ********"+a_nums.length);
        if(reccnt.size()>1){
            a_fixnum = (a_nums.length/2) - a_fixnum; 
        }
        //System.out.println("---修正量: "+a_fixnum);
        return a_fixnum;
    }
}
