package agenda;

public class Contact {

    private String name;

    private String email;

    private String phone;

    public Contact(String name) {
        this.name = name;
    }

    public Contact(String name, String email, String phone) {
        this.name = name;

        setEmail(email);
        setPhone(phone);
    }

    public static boolean isEmailValid(String email) {
        String[] split = email.split("@");
        return email.contains("@") && split.length == 2 && split[1].contains(".");
    }

    public static boolean isPhoneValid(String phone) {

        for (int i = 0; i < phone.length(); i++) {
            char currentChar = phone.charAt(i);
            if (currentChar >= '0' && currentChar <= '9') {
                continue;
            } else {
                return false;
            }
        }

        return phone.length() == 10;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email: " + email);
        }
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        if (isPhoneValid(phone)) {
            this.phone = phone;
        } else {
            System.out.println("Invalid phone: " + phone);
        }
    }

    /*
    toString is from Object class - see javadoc
     */
    @Override
    public String toString() {
        return this.name + ";" + this.phone + ";" + this.email;
    }

    /*
    equals is from Object class
     */
    @Override
    public boolean equals(Object obj) {
        Contact contact = (Contact) obj;

        return (this.email != null && this.email.equals(contact.email)) || (this.phone != null && this.phone.equals(contact.phone));
    }
}
