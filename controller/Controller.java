package controller;

import service.DataService;
import data.User;

public class Controller {
    private DataService dataServ = new DataService();
    public void createUser(User user, String type){
        dataServ.createUser(user, type);
    }
    public void read(String type){
        System.out.println(dataServ.read(type));
    }


}
