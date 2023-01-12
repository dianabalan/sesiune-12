package agenda;

import java.util.Scanner;

public class AgendaTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BasicAgenda agenda = new Agenda(4);

        int option = -1;

        while (option != 0) {
            displayMenu();

            System.out.println("Choose option: ");
            option = Integer.parseInt(scanner.nextLine()); //"4" -> 4

            switch (option) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Input name: ");
                    String name = scanner.nextLine();


                    Contact contact = new Contact(name);


                    while (contact.getEmail() == null) {
                        System.out.println("Input email: ");
                        String email = scanner.nextLine();

                        contact.setEmail(email);
                    }

                    while (contact.getPhone() == null) {
                        System.out.println("Input phone: ");
                        String phone = scanner.nextLine();

                        contact.setPhone(phone);
                    }

                    agenda.add(contact);
                    System.out.println("Contact successfully added!");

                    break;
                case 2:
                    System.out.println("Input email: ");
                    String email = scanner.nextLine();
                    agenda.removeByEmail(email);
                    System.out.println("Contact successfully removed");
                    break;
                case 3:
                    System.out.println("Input phone: ");
                    String phone = scanner.nextLine();
                    agenda.removeByPhone(phone);
                    System.out.println("Contact successfully removed");
                    break;
                case 4:
                    System.out.println("Number of contacts: "+ agenda.getSize());
                    break;
                case 5:
                    System.out.println(agenda);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }


    }

    private static void displayMenu() {
        System.out.println("-----------------MENU------------------");

        System.out.println("1. Add contact");
        System.out.println("2. Remove contact by email");
        System.out.println("3. Remove contact by phone");
        System.out.println("4. Display number of contacts");
        System.out.println("5. Display agenda contacts");
        //homework: option 6. Search by name
        System.out.println("0. Exit");

        System.out.println("---------------------------------------");
    }
}
