/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eeindex;

import java.util.ArrayList;

/**
 *
 * @author Dusan
 */
public class Student {
    private String name;
    private String lastName;
    private String jmbg;
    private String index;
    private String userName;
    private String password;
    private int numOfSubjects;
    private  ArrayList<Subject> subjects;

    public Student(String name, String lastName, String jmbg, String index, String userName, String password) {
        this.name = name;
        this.lastName = lastName;
        this.jmbg = jmbg;
        this.index = index;
        this.userName = userName;
        this.password = password;
        this.numOfSubjects = 0;
    }

    public Student(String name, String lastName, String jmbg, String index, String userName, String password, int numOfSubjects, ArrayList<Subject> subjects) {
        this.name = name;
        this.lastName = lastName;
        this.jmbg = jmbg;
        this.index = index;
        this.userName = userName;
        this.password = password;
        this.numOfSubjects = numOfSubjects;
        this.subjects = subjects;
    }

    public String getIndex() {
        return index;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public int getNumOfSubjects() {
        return numOfSubjects;
    }

    public void setNumOfSubjects(int numOfSubjects) {
        this.numOfSubjects = numOfSubjects;
    }
    
    public void printSubject(){
        String string;
        string = this.getName()+" "+this.getLastName()+" "+this.getJmbg()+" "+this.getIndex()+" "+this.getUserName()+" "+this.getPassword()+" "+this.getNumOfSubjects()+" ";
        for(Subject s: subjects){
            string += s.printSubject();
        }
        System.out.println(string);
    }
    
}
