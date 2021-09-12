package com.bridgelabz.addressbook;

public class AddressBookMain {
	public static void main(String [] args) {
		System.out.println("welcome to address book");
		    AddressBook addressBook = new AddressBook();
		    addressBook.addContacts();
		    addressBook.display();
		    addressBook.edit();
		    addressBook.display();
		    addressBook.delete();
		    addressBook.display();
		    
		}
	}

