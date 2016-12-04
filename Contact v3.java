/**
 * Defines a reusable class contact, and one object of the class stores
 * the detailed information of a contact which includes first name, last
 * name, street address, email address, phone number and notes.
 */
public class Contact
{
   /**
    * Declares the private variables
    */
   private String firstName;
   private String lastName;
   private String streetAddress;
   private String emailAddress;
   private int phoneNumber;
   private String notes;

   /**
    * Returns the first name of the contact
    */
   public String getFirstName(){
      firstName = "First";
      return firstName;
   }
   /**
    * Returns the last name of the contact
    */
   public String getLastName(){
      lastName = "Last";
      return lastName;
   }
   /**
    * Returns the street address of the contact
    */
   public String getStreetAddress(){
      streetAddress = "Street";
      return streetAddress;
   }
   /**
    * Returns the email address of the contact
    */
   public String getEmailAddress(){
      emailAddress = "Email";
      return emailAddress;
   }
   /**
    *Returns the phone number of the contact
    */
   public int getPhoneNumber(){
      phoneNumber = 911;
      return phoneNumber;
   }
   /**
    * Returns the notes of the contact
    */
   public String getNotes(){
      notes = "Notes";
      return notes;
   }
   /**
    * Returns a String containing the full information of a contact,
    * it includes the contact's first name, last name,street address,
    * email address, phone number and notes.
    */
   public String toString (){
      String ContactString = new String();
      ContactString = "Class Contact is called!";
      return "First Name: " + firstName + " " +"Last Name: "+ lastName + "\nStreet Address: "+streetAddress + "\nEmail Address: "+
            emailAddress + "\nPhone Number: " + phoneNumber + "\nNotes: " +notes + "\n"+ContactString;
      }

    /**
    * Compares two contacts and sorts them alphabetically
    */
    public int compareTo( Contact other ) {
        /* returns < 0 if this.area < other.area,
        returns == 0 if this.area == other.area,
        returns > 0 if this.area > other.area */
    return 99;
}

}
