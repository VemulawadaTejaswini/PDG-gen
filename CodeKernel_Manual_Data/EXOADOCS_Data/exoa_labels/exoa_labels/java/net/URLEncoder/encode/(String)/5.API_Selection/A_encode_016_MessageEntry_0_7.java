public class A{
	//...
	public static void main(){
		String tmp=java.net.URLEncoder.encode(name)+com.crack.ProtocolConstant.TOKEN+java.net.URLEncoder.encode(email)+com.crack.ProtocolConstant.TOKEN+java.net.URLEncoder.encode(comment)+com.crack.ProtocolConstant.TOKEN+java.net.URLEncoder.encode(community)+com.crack.ProtocolConstant.TOKEN+java.net.URLEncoder.encode(area)+com.crack.ProtocolConstant.TOKEN+java.net.URLEncoder.encode(page)+com.crack.ProtocolConstant.TOKEN+java.net.URLEncoder.encode(String.valueOf(currentTime))+com.crack.ProtocolConstant.TOKEN+java.net.URLEncoder.encode(String.valueOf(state));
	}
}