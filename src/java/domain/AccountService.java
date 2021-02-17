/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
/**
 *
 * @author rcgam
 */
public class AccountService {
    public User login(String username, String password){
        if((username.contentEquals("adam") || username.contentEquals("betty")) && password.contentEquals("password")){
            return new User(username);
        }
        else
            return null;
    }
}
