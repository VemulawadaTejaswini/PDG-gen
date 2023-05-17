public class func{
public void notifyMemberJoin(final Member member){
        Thread th = new Thread(){
            public void run() {
                membershipManager.sendMemberJoinedToAll(member);
            }
        };
        th.start();
}
}
