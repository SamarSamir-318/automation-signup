package tests.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class JsonDataParser {
    public String name, email, password, firstname, lastname, address, state, city, zipcode, mobile;

    public void JsonReader() throws IOException, ParseException {
        String filePath = System.getProperty("user.dir") + "/src/test/java/tests/util/UserData.json";

        File srcFile = new File(filePath);

        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray) parser.parse(new FileReader(srcFile));

        for (Object jsonObj : jarray) {
            JSONObject person = (JSONObject) jsonObj;
            name = (String) person.get("firstname");
            firstname = (String) person.get("firstname");
            lastname = (String) person.get("lastname");
            email = (String) person.get("email");
            password = (String) person.get("password");
            city = (String) person.get("zipcode");
            address = (String) person.get("zipcode");
            zipcode = (String) person.get("zipcode");
            state = (String) person.get("zipcode");
            mobile = (String) person.get("zipcode");

        }

    }

}
