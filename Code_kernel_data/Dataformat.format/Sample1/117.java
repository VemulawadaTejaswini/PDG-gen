//116
public class func{
	public void getUserVisibleName(Workspace workspace,boolean isFrontend){
        return "Snapshot - " + getSnapshotSiteName(workspace) + " - " + df.format(getCreated(workspace));
}
}
