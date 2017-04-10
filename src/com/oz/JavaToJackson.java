package com.oz;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJackson {

  public static void main(String[] args) {
    ObjectMapper mapper = new ObjectMapper();
    Staff obj = new Staff();
    obj=createDummyObject();
    //Object to JSON in file
    try {
      mapper.writeValue(new File("c:\\devl\\file.json"), obj);
    //Object to JSON in String
      String jsonInString = mapper.writeValueAsString(obj);
      System.out.println("This is my object recoverd from a file "+jsonInString);
    } catch (JsonGenerationException e) {
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
  
  
  private  static Staff createDummyObject() {

    Staff staff = new Staff();

    staff.setName("mkyong");
    staff.setAge(33);
    staff.setPosition("Developer");
    staff.setSalary(new BigDecimal("7500"));

    List<String> skills = new ArrayList<String>();
    skills.add("java");
    skills.add("python");

    staff.setSkills(skills);

    return staff;

  }

}
