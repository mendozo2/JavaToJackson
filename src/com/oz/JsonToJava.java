package com.oz;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
  
  
  public static void main(String[] args) {
    ObjectMapper mapper = new ObjectMapper();
    String jsonInString = "{\"name\" : \"osvaldo\"}";

    //JSON from file to Object
    Staff obj;
    try {
      obj = mapper.readValue(new File("c:\\devl\\file.json"), Staff.class);
      //JSON from URL to Object
     // Staff obj2 = mapper.readValue(new URL("http://mkyong.com/api/staff.json"), Staff.class);

      //JSON from String to Object
      Staff obj3 = mapper.readValue(jsonInString, Staff.class);
      System.out.println("Staff1"+ mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj));
      System.out.println("Staff2");
      System.out.println("Staff3"+mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj3));
    } catch (JsonParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (JsonMappingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }



  }


}
