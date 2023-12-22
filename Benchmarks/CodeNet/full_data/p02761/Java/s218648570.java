
Beta

  paiza.IO
Java Split Button!	
Main.java 
Success  

17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
                result[0] = -1;
                break;
            }else{
                if(result[s[i] - 1] != 0 && result[s[i] - 1] != c[i]){
                    result[0] = -1;
                    break;
                }else{
                    result[s[i] - 1] = c[i];
                }
            }
        }
        if(result[0] == -1){
            System.out.println(result[0]);
        }else{
            switch(N){
                case 1:
                    System.out.println(result[0]);
                    break;
                case 2:
                    System.out.println(result[0] * 10 + result[1]);
                    break;
                case 3:
                    System.out.println(result[0] * 100 + result[1] * 10 + result[2]);
                    break;
            }
        }
    }
}
  実行 (Ctrl-Enter) Split Button!              
出力
入力
コメント 0
(0.07 sec)
 
30
 