package com.goorea.mbto;

import com.goorea.mbto.user.User;
import com.goorea.mbto.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserRunner implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User();
        user.setName("hyungseok");
        user.setNickname("Sanae");
        user.setCreated(new Date());

//        userRepository.save(user);
    }
}
