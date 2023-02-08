package com.example.usermanagementsystem.service;

import com.example.usermanagementsystem.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static List<User> userList=new ArrayList<>();
    private static int id=1000;

    static {
        userList.add(new User(++id,"Raj Kumar Vishwakarma","rajkv","Surat,India","777527129"));
        userList.add(new User(++id,"Yash Khare","yashk","Hyderabad,India","7745727129"));
        userList.add(new User(++id,"Ashwani Verma","ashv","Bhopal,India","8979527129"));
        userList.add(new User(++id,"Prem Tiwari","premlkt","Jabalpur,India","8895527129"));
        userList.add(new User(++id,"Amit Rai","amitkrai","Lucknow,India","7785694129"));
    }

    public void addUser(User user)
    {
        userList.add(user);
    }

    public User getUserById(int id)
    {
        for(User user:userList){
            if(user.getUserId()==id)
                return user;
        }
        return null;
    }

    public List<User> getAllUser()
    {
        return userList;
    }

    public void updateUserById(int id,User newUser)
    {
        if(getUserById(id)!=null) {
            User user =getUserById(id);
            user.setUserId(newUser.getUserId());
            user.setName(newUser.getName());
            user.setAddress(newUser.getAddress());
            user.setPhoneNumber(newUser.getPhoneNumber());
            user.setUsername(newUser.getUsername());
        }
    }
    public void deleteUser(int id){
        for(User user:userList){
            if(user.getUserId()==id)
                userList.remove(user);
        }
    }


}
