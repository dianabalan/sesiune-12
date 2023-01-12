package agenda;

import java.util.Arrays;

public class Agenda implements BasicAgenda {

    private Contact[] contacts;
    private int size;

    public Agenda(int maxCapacity) {
        this.contacts = new Contact[maxCapacity];
        this.size = 0;
    }


    @Override
    public void add(Contact contact) {
        if (exists(contact)) {
            System.out.println("Contact: " + contact.toString() + " already exists!");
            return;
        }

        if (this.size == this.contacts.length) {
            this.contacts = Arrays.copyOf(this.contacts, 2 * this.size);
        }

        this.contacts[size++] = contact;

    }


    @Override
    public void removeByPhone(String phone) {

        int i;
        boolean found = false;

        for (i = 0; i < this.size; i++) {
            if (this.contacts[i].getPhone().equals(phone)) {
                found = true;
            }
        }
        // i va avea ultima valoarea la care a ajuns in for

        if (found) {
            //shift left by one element
            shiftLeftByOne(i);
        } else {
            System.out.println("Contact with phone number: " + phone + "does not exist!");
        }
    }

    @Override
    public void removeByEmail(String email) {
        int i;
        boolean found = false;

        for (i = 0; i < this.size; i++) {
            if (this.contacts[i].getEmail().equals(email)) {
                found = true;
            }
        }
        // i va avea ultima valoarea la care a ajuns in for

        if (found) {
            //shift left by one element
            shiftLeftByOne(i);
        } else {
            System.out.println("Contact with email: " + email + "does not exist!");
        }
    }


    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public Contact search(String name) {
        //homework
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(this.contacts, 0, this.size));
    }

    private void shiftLeftByOne(int i) {
        for (int j = i; j < size - 1; j++) {
            this.contacts[j] = this.contacts[j + 1];
        }

        this.size--;
        this.contacts[size] = null;
    }

    private boolean exists(Contact contact) {
        for (int i = 0; i < this.size; i++) {
            if (contacts[i].equals(contact)) {
                return true;
            }
        }
        return false;
    }
}
