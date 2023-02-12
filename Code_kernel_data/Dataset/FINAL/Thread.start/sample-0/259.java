public class func{
public void deleteEntity(String entity,Integer entityId,InfoGluePrincipal principal,ProcessBean processBean){
    TrashcanController trashcanController = new TrashcanController(entity, entityId, false, principal, processBean);
    Thread thread = new Thread(trashcanController);
    thread.start();
}
}
