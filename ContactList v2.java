/**
 * Defines class ContactList and creates an array of contact, one object of the class declares 
 * different methods based on the use cases which includes adding a contact list,
 * printing all of the contact list, finding a specific contact list and open the existing 
 * contact list
 */
public class ContactList
{
   /**
    * Declares the private variables
    */
   private Contact [] friends;
   private static final int NUM_OF_CONTACTS = 30;
   /**
    * Defines the constructor method for class ContactList
    */
   public ContactList(){
      friends = new Contact [NUM_OF_CONTACTS];     
   }
   /**
    * Defines the addContact method and adds a new contact 
    */
   public void addContact (){
   }
   /**
    * Defines the printContact method and prints out all information of the contacts
    */
   public void printContact(){
   }
   /**
    * Defines the findContact method and prints out a specific contact by entering
    *  the last name of a contact
    */
   public void findContact(){      
   }
   /**
    * Defines the quitAndSaveContact method, this will quit the program and saves 
    * the contacts to disk that the user entered
    */
   public void quitAndSaveContact(){     
   }
   /**
    * Defines the importContact method, this will display the previous contacts that
    * the user entered and saved on disk
    */
   public void importContact(){      
   }
   /**
    * Defines the toString method, and returns a String that includes the elements in the array.
    */
   public String toString(){
      String resultString = new String();
      resultString = "Class ContactList is called!";
      return resultString;
   }

}
