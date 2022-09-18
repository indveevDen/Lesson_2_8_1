package org.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class UserMapper {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Ruchkov.Denis\\IdeaProjects\\Lesson_2_8_1\\src\\main\\resources\\user.json");
        File file2 = new File("C:\\Users\\Ruchkov.Denis\\IdeaProjects\\Lesson_2_8_1\\src\\main\\resources\\user2.json");
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        User<String> user = objectMapper.readValue(file, new TypeReference<User<String>>() {
        });
        String Object = user.getName();
        objectMapper.writeValue(file2, user);
        System.out.println(user);







    }
}
