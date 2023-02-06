//33
public class func{
public void setCreationDate(Calendar creationDate){
        if (creationDate != null) {
            this.setCreation(creationDate.getTime());
        } else {
            this.setCreation(null);
        }
}
}
