package agenda;

public interface BasicAgenda {

    void add(Contact contact);

    void removeByPhone(String phone);

    void removeByEmail(String email);

    int getSize();

    Contact search(String name);
}
