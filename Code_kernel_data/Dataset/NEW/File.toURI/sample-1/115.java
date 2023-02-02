//115
public class func{
public void createPackage(File jarFile,List<IRobotSpecItem> selectedRobots,RobotProperties robotProps){
    checkDbExists();
    List<RobotItem> robotItems = getAllRobotItems(selectedRobots);
    TeamItem teamItem = getTeamItem(selectedRobots);
    String res = JarCreator.createPackage(jarFile, robotItems, teamItem, robotProps);
    refresh(jarFile.toURI().toString());
}
}
