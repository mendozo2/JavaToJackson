package com.oz;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

public class Staff {

  @JsonView(Views.Normal.class)
  private String name;

  @JsonView(Views.Normal.class)
  private int age;

  @JsonView(Views.Normal.class)
  private String position;

  @JsonView(Views.Manager.class)
  private BigDecimal salary;

  @JsonView(Views.Normal.class)
  private List<String> skills;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getPosition() {
    return position;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public List<String> getSkills() {
    return skills;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

}
