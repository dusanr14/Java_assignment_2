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
class Subject {
    private  String subjectName;
    private int numberOfParts;
    private ArrayList<String> partsName;
    private  ArrayList<Integer> maxPoints;
    private ArrayList<Integer> minPoints;
    private ArrayList<Integer> obtainedPoints;
    private int grade;
            
    public Subject(String subjectName, int numberOfParts,ArrayList<String> partsName, ArrayList<Integer> maxPoints, ArrayList<Integer> minPoints) {
        this.subjectName = subjectName;
        this.numberOfParts = numberOfParts;
        this.partsName = partsName;
        this.maxPoints = maxPoints;
        this.minPoints = minPoints;
    }

    public Subject(String subjectName, int numberOfParts, ArrayList<String> partsName, ArrayList<Integer> maxPoints, ArrayList<Integer> minPoints, ArrayList<Integer> obtainedPoints, int grade) {
        this.subjectName = subjectName;
        this.numberOfParts = numberOfParts;
        this.partsName = partsName;
        this.maxPoints = maxPoints;
        this.minPoints = minPoints;
        this.obtainedPoints = obtainedPoints;
        this.grade = grade;
    }

    public ArrayList<String> getPartsName() {
        return partsName;
    }

    public int getNumberOfParts() {
        return numberOfParts;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public ArrayList<Integer> getMaxPoints() {
        return maxPoints;
    }

    public ArrayList<Integer> getMinPoints() {
        return minPoints;
    }

    public ArrayList<Integer> getObtainedPoints() {
        return obtainedPoints;
    }

    public void setObtained_points(ArrayList<Integer> obtained_points) {
        this.obtainedPoints = obtained_points;
    }

    public int getGrade() {
        /*int temp;
        boolean fail = false;
        for(int i = 0;i < this.getNumberOfParts(); i++){
            if(obtainedPoints.get(i) < minPoints.get(i)){
                fail = true;
            }
        }
        */
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public String printSubject(){
        String string;
        string = this.getSubjectName()+" "+this.getNumberOfParts()+" "+this.getMaxPoints()
                +" "+this.getMinPoints()+" "+this.getObtainedPoints()+" "+this.getGrade();
        return string;
    }
    
}
