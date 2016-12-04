/**
 * Tests class main TestContactList by reading users' input and calls specific 
 * methods in class ContactList 
 */
public class TestContactList
{
   public static void main(String[] args)
   {
      /**
       * Calls the toString() from class ContactList.
       */
      ContactList contactList;
      contactList = new ContactList();
      System.out.println(contactList.toString());

      Contact contact;
      contact = new Contact();
      /**
       * Calls the get methods from class Contact.
       */
      System.out.println(contact.getFirstName());
      System.out.println(contact.getLastName());
      System.out.println(contact.getStreetAddress());
      System.out.println(contact.getEmailAddress());
      System.out.println(contact.getPhoneNumber());
      System.out.println(contact.getNotes());
      /**
       * Calls the toString() from class Contact.
       */
      System.out.println(contact.toString());
      System.out.print("Reached the end of main()!!");
   }
 

   /**
    * this will print out the details of different use cases
    */
   public static void read()
   {

      System.out.print(" ");
   }
}
/*------------------OUTPUT-----
Class ContactList is called!
First
Last
Street
Email
911
Notes
First Name: First Last Name: Last
Street Address: Street
Email Address: Email
Phone Number: 911
Notes: Notes
Class Contact is called!
Reached the end of main()!!
*/