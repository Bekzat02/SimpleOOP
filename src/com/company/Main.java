package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        StudentsGroup group = new StudentsGroup("SE-20012");

        File file = new File("C:\\Users\\samja\\IdeaProjects\\officehour1901\\src\\com\\company\\input.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String name = sc.next();
            name = name.substring(0, name.length() - 1);
            String surname = sc.next();
            Person s = new Person(name, surname);
            group.addStudent(s);
        }

        System.out.println(group);
    }
}
