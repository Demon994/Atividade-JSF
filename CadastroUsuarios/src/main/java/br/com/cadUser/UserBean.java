package br.com.cadUser;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class UserBean {
    private String username;
    private List<String> userList;

    public UserBean() {
        userList = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getUserList() {
        return userList;
    }

    public void addUsername() {
        if (username != null && !username.isEmpty()) {
            userList.add(username);
            username = ""; // Limpa o campo depois de adicionar
        }
    }
}