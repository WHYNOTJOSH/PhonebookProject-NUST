import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Insert Contact Method
    public void insertContact(Contact newContact) {
        if (contacts.size() < 100) {  // Assuming a max size of 100 for the phonebook
            contacts.add(newContact);
            System.out.println("Contact inserted successfully: " + newContact);
        } else {
            System.out.println("Phonebook is full, cannot insert contact.");
        }
    }

    // Display all contacts method
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Phonebook is empty.");
        } else {
            System.out.println("Contacts in phonebook:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        // Adding some contacts to test
        phonebook.insertContact(new Contact("John Doe", "5551234567", "john@example.com"));
        phonebook.insertContact(new Contact("Jane Smith", "5559876543", "jane@example.com"));

        // Displaying all contacts
        phonebook.displayContacts();
    }
}
