object Main{
	def main(A:Array[String]){
		val s = new java.util.Scanner(System.in)
		val n,m=s.nextInt
		val u=new UF(n)
		val a=Seq.fill(m)((s.nextInt-1,s.nextInt-1)).reverse.map(o=>{
			if(u.isConnected(o _1,o _2))
				0
			else{
				val t=u.groupSize(o _1)*u.groupSize(o _2)
				u.connect(o _1,o _2)
				t
			}
		}).reverse.toArray
		(1 until m) foreach(i=>a(i)+=a(i-1))
		a foreach println
	}
}
class UF(n:Int){
	val a = Array.fill(n)(-1)
	def root(t:Int):Int =
		if(a(t) < 0) t
		else {
			val v = root(a(t))
			a(t) = v
			v
		}
	def connect(b:Int,c:Int) ={
		val d = root(b)
		val e = root(c)
		if(d == e)
			false
		else {
			def f(g:Int,h:Int) ={
				a(g) += a(h);
				a(h) = g;
			}
			if(a(d) > a(e)) f(e,d) else f(d,e)
			true
		}
	}
	def isConnected(a:Int,b:Int) = root(a) == root(b)
	def groupSize(t:Int) = -a(root(t))
}