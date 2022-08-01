//15
public class func{
	public void addProject(Collection<IProject> projects,String location){
    for(IContainer container : root.findContainersForLocationURI(new File(location).toURI())) {
      if(container instanceof IProject) {
        projects.add((IProject) container);
        break;
      }
    }
}
}
