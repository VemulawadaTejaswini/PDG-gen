public class A{
	//...
	public static void main(){
		return new String(_type)+ProtocolConstant.TOKEN+java.net.URLEncoder.encode(msg)+ProtocolConstant.TOKEN+_color.getRGB();
	}
}