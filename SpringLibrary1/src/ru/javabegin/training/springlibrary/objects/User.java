package ru.javabegin.training.springlibrary.objects;
public class User
{
    private String username;
    private String password;


    public User(String username)
    {

        this.username = username;
    }


    public String getUsername()
    {
        return username;
    }


    public void setUsername(String username)
    {
        this.username = username;
    }
}
