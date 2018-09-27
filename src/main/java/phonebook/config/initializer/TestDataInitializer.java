package phonebook.config.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import phonebook.model.Person;
import phonebook.model.Role;
import phonebook.model.User;
import phonebook.repos.MessageRepo;
import phonebook.repos.UserRepo;

import java.util.Collections;
import java.util.Set;

public class TestDataInitializer {

    @Autowired
    private MessageRepo messageRepo;

    @Autowired
    private UserRepo userRepo;


    private void init() throws Exception {

        User user = new User("admin", "admin", true);
        Set<Role> roles = Collections.singleton(Role.ADMIN);
        user.setRoles(roles);
        userRepo.save(user);

        Person person_1 = new Person();
        person_1.setName("Дмитрий");
        person_1.setSurname("Петров");
        person_1.setPatronymic("Петрович");
        person_1.setMobilePhone("856654556");
        person_1.setPhone("41513");
        person_1.setAddress("Проспект");
        person_1.setE_mail("google@gmail.com");
        person_1.setTag("программист");

        messageRepo.save(person_1);



        Person person_2 = new Person();
        person_2.setName("Дмитрий");
        person_2.setSurname("Петров");
        person_2.setPatronymic("Петрович");
        person_2.setMobilePhone("856654556");
        person_2.setPhone("41513");
        person_2.setAddress("Проспект");
        person_2.setE_mail("google@gmail.com");
        person_2.setTag("программист");

        messageRepo.save(person_2);

        Person person_3 = new Person();
        person_3.setName("Дмитрий");
        person_3.setSurname("Петров");
        person_3.setPatronymic("Петрович");
        person_3.setMobilePhone("856654556");
        person_3.setPhone("41513");
        person_3.setAddress("Проспект");
        person_3.setE_mail("google@gmail.com");
        person_3.setTag("программист");

        messageRepo.save(person_3);

        Person person_4 = new Person();
        person_4.setName("Дмитрий");
        person_4.setSurname("Петров");
        person_4.setPatronymic("Петрович");
        person_4.setMobilePhone("856654556");
        person_4.setPhone("41513");
        person_4.setAddress("Проспект");
        person_4.setE_mail("google@gmail.com");
        person_4.setTag("программист");

        messageRepo.save(person_4);

        Person person_5 = new Person();
        person_5.setName("Дмитрий");
        person_5.setSurname("Петров");
        person_5.setPatronymic("Петрович");
        person_5.setMobilePhone("856654556");
        person_5.setPhone("41513");
        person_5.setAddress("Проспект");
        person_5.setE_mail("google@gmail.com");
        person_5.setTag("программист");

        messageRepo.save(person_5);

    }
}
