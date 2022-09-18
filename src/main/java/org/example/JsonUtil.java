package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.function.Function;

public class JsonUtil {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Ruchkov.Denis\\IdeaProjects\\Lesson_2_8_1\\src\\main\\resources\\user.json");
        reader(file, Map.of("myName", "Peter"));
    }
    public static void reader(File input, Map<String, Object> naming) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.readValue(input, new TypeReference<Map<String, Object>>() {
        });
        System.out.println(map);
        System.out.println(naming);
        naming.entrySet().forEach(e -> map.put(e.getKey(), e.getValue()));
        objectMapper.writeValue(input, map);


//        Animal animal = new Animal() {
//        };
//        Function<Integer, Integer> function = new Function<>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer++;
//            }
//        };
//        Integer apply = function.apply(9);


    }


}
