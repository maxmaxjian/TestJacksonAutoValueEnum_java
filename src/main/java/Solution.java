import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Solution {

    public static void main(String[] args) {
        String json = "{\"name\" : \"Jonh\", \"color\" : \"none\"}";

        ObjectMapper mapper = new ObjectMapper();
        try {
            Animal animal = mapper.readValue(json, Animal.class);
            System.out.println(animal);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
