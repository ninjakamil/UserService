package SDA;

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

//        User user2 = new User();
//        user2.setName("heniu");
//        user2.setLastMame("kowal");
//        user2.setLogin("hkowal");
//        user2.setPassword("admin1");












    }




}
