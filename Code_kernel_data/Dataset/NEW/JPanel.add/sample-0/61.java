//61
public class func{
public void buildActionsPanel(){
        TestAccessTokenAction actTestAccessToken = new TestAccessTokenAction();
        pnl.add(new SideButton(actTestAccessToken));
        this.addPropertyChangeListener(actTestAccessToken);
}
}
