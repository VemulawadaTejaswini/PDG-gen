public class Hello{
    public static void Main(){
        string str = System.Console.ReadLine();
        int X = int.Parse(str);
        //var N = int.Parse(System.Console.ReadLine());
        int ans = 0;
        
        while(X > 0){
            if(X>=500){
                X -= 500;
                ans += 1000;
            }else if(X>=5){
                X -= 5;
                ans += 5;
            }else{
                break;
            }
        }
        
        System.Console.WriteLine(ans);
    }
}