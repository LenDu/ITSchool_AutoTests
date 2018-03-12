package com.company.users;

import com.company.utils.Utils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Lena on 3/8/2018.
 */
//возвращает валидного юзера из файла user.properties
public class UserFactory {

    public static User getValidUser() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("user");
        return new User(resourceBundle.getString("user1.login"),
                resourceBundle.getString("user1.password"),
                resourceBundle.getString("user1.email"));
        //generate random user email
        //Utils.Random.getRandomEmail());
    }
    //нагенерить пользователей
    public static List<User> getVaidUsersList(int count){
        return Stream.generate(UserFactory::getValidUser).limit(count).collect(Collectors.toList());
    }
}
