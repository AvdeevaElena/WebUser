package beans;

import java.io.IOException;

import static JsonLogic.pushJson.JsonZone;

public class User  {
    public String getUser(){return user;}
    public void setUser(String user){this.user = user;}
    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}
    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}


    private String user;
    private String password;
    private String email;





}