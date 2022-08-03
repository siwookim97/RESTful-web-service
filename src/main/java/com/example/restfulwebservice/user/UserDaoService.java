package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    static {
        users.add(new User(1, "Siwoo", new Date()));
        users.add(new User(2, "Chi", new Date()));
        users.add(new User(3, "Koo", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    // 새로운 사용자 추가
    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }

        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }

        return null;
    }
// users.add(new User(3, "Koo", new Date()));
    public User updateOne(User usr) {
        for (User user : users) {
            if (user.getId() == usr.getId()) {
                user.setName(usr.getName());
                user.setJoinDate(usr.getJoinDate());
                return user;
            }
        }
        return null;
    }
}
