package com.bridgelabz;
import java.util.*;

public class AddressBookManager {
    Map<String, LinkedList> addressbook = new HashMap<String, LinkedList>();
    Scanner scanner = new Scanner(System.in);


    public void createAddressBook() {
        System.out.println("Enter the name of a AddressBook: ");
        String addressBookName = scanner.next();
        if (addressbook.containsKey(addressBookName))
            System.out.println("AddressBook is already present");
        else
            addressbook.put(addressBookName, new LinkedList<ContactPerson>());
        System.out.println(addressbook.keySet());
    }




    public boolean addContact(String addressBookName, ContactPerson obj) {
        if (addressbook.containsKey(addressBookName) == false) {
            throw new RuntimeException("AddressBook not present");
        }
        System.out.println(obj + "AddressBook name: " + addressBookName);
        addressbook.get(addressBookName).add(obj);
        return true;
    }

    public boolean editContact(String addressBookName, ContactPerson obj) {
        if (addressbook.containsKey(addressBookName) == false) {
            throw new RuntimeException("AddressBook not present");
        }
        System.out.println(obj + "AddressBook name: " + addressBookName);
        addressbook.get(addressBookName).add(obj);
        return true;
    }

    public List getContactByAddressBook(String addressBookName) {
        List contacts = addressbook.get(addressBookName);
        contacts.forEach(contact -> System.out.println(contact));
        return contacts;
    }


}
