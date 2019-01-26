package SDA;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args){
        UserService1 service = new UserService1();
        User user = new User();
        user.setName("jan");
        user.setLastMame("nowak");
        user.setLogin("jnowak");
        user.setPassword("admin");

        service.addUser(user);

        service.printAll();
















    }




}
