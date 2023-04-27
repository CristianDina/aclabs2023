package com.pillar.aclabs2023.repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HomeRepository {

    List<String> list = new ArrayList<>();

    public HomeRepository(){
        list.add("Hello World!");
    }

    public String getFirstString() {
        return list.get(0);
    }

    public void addString(String string) {
        list.add(string);
    }

    public List<String> getAllStrings() {
        return list;
    }
}
