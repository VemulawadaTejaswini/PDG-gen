//51
public class func{
	public void startNext(){
        if(!queue.isEmpty()){
            APIRequest next = queue.poll();
            active.add(next);
            Thread task = new Thread(next);
            task.start();
        }
}
}
