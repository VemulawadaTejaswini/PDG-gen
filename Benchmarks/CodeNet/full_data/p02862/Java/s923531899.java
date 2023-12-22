function myin(){return require("fs").readFileSync("/dev/stdin", "utf8").trim();}
function myout(t){console.log(t);}//standard output
//[no]param
//0:何もしない  1:数値へ変換  2:半角SPで分割  3:改行で分割  4:半角SPで分割し、数値配列へ
//5:改行で分割し、数値配列へ  6:1文字に分割  7:1文字に分割し、数値配列へ
function myconv(i,no){switch(no){case 0:return i;case 1:return parseInt(i);case 2:return i.split(" ");case 3:return i.split("\n");case 4:return i.split(" ").map((a)=>Number(a));case 5:return i.split("\n").map((a)=>Number(a));case 6:return i.split("");case 7:return i.split("").map((a)=>Number(a));}}

function Main(input) {
  input = myconv(input,4);
  var x = input[0];
  var y = input[1];
  if(x > y){
     if(x / 2 > y){
        myout(0);
       return;
     }else if(x / 2 == y){
        myout(1);
       return;
     }
  }else if(y > x){
      if(y / 2 > x){
         myout(0);
        return;
         }else if(y / 2 == x){
          myout(1);
        return;        
       }
  }
	var tmpX = x;
	var tmpY = y;
	//原点に向かうべく、境界線のところ（y = 2x,またはy = x/2の座標）に帰れるか。帰れなかったら0
	var xLineCount = 0;
  var yLineCount = 0;
  while(true){
       tmpX -= 2;
      tmpY -= 1;
    yLineCount++;
      if(tmpY / 2 == tmpX){
         break;
      }else if(tmpX < 1 || tmpY < 1){
               myout(0);
        return;
       }
    }
   tmpX = x;
	 tmpY = y;
	while(true){
       tmpX -= 1;
      tmpY -= 2;
    xLineCount++;
      if(tmpX / 2 == tmpY){
         break;
      }else if(tmpX < 1 || tmpY < 1){
               myout(0);
        return;
       }
    }
  var mod = 1000000007;
  var factrial = new Array(xLineCount+yLineCount);
  factrial[0] = 1;
  var inverse = new Array(xLineCount+yLineCount);
  inverse[0] = 1;
  
  var factXY = 1;
  var factX = 1;
  var factY = 1;
  for(var i = 1; i <= xLineCount+yLineCount; i++){
    //factXY = (factXY * i) % mod;
    factrial[i] = (factrial[i-1] * i )%mod;
    inverse[i] = pow(factrial[i], mod-2,mod) % mod;
  }
  
  var output = nCk(666666,333333,mod);
  
  myout(output);
  
}

function nCk(n,k,M) {
        var ret = 1;
        var min = Math.min(k, n-k);
        for(var i = 1; i <= min; i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(var i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return ret;
    }

    //return a^b mod M O(logB)
    function pow(a,b,M) {
        var ret = 1;
        var tmp = a;
        while(b > 0) {
            if((b&1)==1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }

Main(myin());
