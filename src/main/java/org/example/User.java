package org.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;

import java.util.List;

public class User <T> {
   @JsonProperty("myName")
   private T name;
   private T birthday;
   private List<T> games;
   private User father;
   //@JsonInclude(JsonInclude.Include.NON_NULL)
   @JsonIgnore
    private T motherName;

    public void setMotherName(T motherName) {
        this.motherName = motherName;
    }

    public T getMotherName() {
        return motherName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", games=" + games +
                ", father=" + father +
                ", motherName='" + motherName + '\'' +
                '}';
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setBirthday(T birthday) {
        this.birthday = birthday;
    }

    public void setGames(List<T> games) {
        this.games = games;
    }

    public void setFather(User father) {
        this.father = father;
    }

    public T getName() {
        return name;
    }

    public T getBirthday() {
        return birthday;
    }

    public List<T> getGames() {
        return games;
    }

    public User getFather() {
        return father;
    }
}
