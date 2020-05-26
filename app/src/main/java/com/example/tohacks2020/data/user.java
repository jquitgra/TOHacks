package com.example.tohacks2020.data;

public class user {
    private String username;
    private String password;
    private int[] objectID;
    private int[] accumulation;
    private int userID;

    public String getUserName()
    {
        return username;
    }

    public void setUserName(String userName)
    {
        this.username = userName;
    }

    public void setUserPassword(String password)
    {
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID){
        this.userID = userID;
    }

    public void UserData(String userName, String password)
    {
//        super();
        this.username = userName;
        this.password = password;
    }
}
