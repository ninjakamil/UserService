package SDA;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String lastMame;
    private String login;
    private String password;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }



    public String getLastMame(){
        return lastMame;
    }

    public void setLastMame(String lastMame){
        this.lastMame = lastMame;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastMame='" + lastMame + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



}
