package shouty;
import java.util.List;
import java.util.ArrayList;

 /**
 * Person
 */
public class Person {
  private int location;
  private List<String> messagesHeard = new ArrayList<String>();
  public void setLocation(int location) {
    this.location= location;
  }
  public int getLocation() {
    return this.location;
  }

  public void shout(String message) {
    
  }
  public List<String>  getMessagesHeard() {
    return this.messagesHeard;
  }
  public void hearMessage(String message){
    messagesHeard.add(message);
  }
}