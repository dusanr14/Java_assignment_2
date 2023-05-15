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
    
    public void setObtainedPointsPart(int points, int position) {
        if(this.maxPoints.get(position) > points) this.obtainedPoints.set(position, points);
    }

    public void setObtained_points(ArrayList<Integer> obtained_points) {
        this.obtainedPoints = obtained_points;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public void changePoints(int position, int points) {
        this.obtainedPoints.set(position, points);
    }
    
    public int calculateGrade() {
        int points = 0;
        int temp_grade = 5;
        boolean temp = true;
        for(Integer op: obtainedPoints){
            points += op;
        }
        if (points < 51) {
            temp_grade =  5;
        } else if (points < 61) {
            temp_grade = 6;
        } else if (points < 71) {
            temp_grade = 7;
        } else if (points < 81) {
            temp_grade = 8;
        } else if (points < 91) {
            temp_grade = 9;
        } else if (points < 101){
            temp_grade = 10;
        }else{
            return 0;
        }
        
        for(int i = 0; i < this.getNumberOfParts(); i++){
            if(this.obtainedPoints.get(i) < this.minPoints.get(i)){
                temp = false;
                break;
            }
        }
        if(temp){
            this.grade = temp_grade;
        }else{
            this.grade = 5;
        }
        return temp_grade;
    }
    
    public String printSubject(){
        String string;
        string = this.getSubjectName()+" "+this.getNumberOfParts()+" "+this.getMaxPoints()
                +" "+this.getMinPoints()+" "+this.getObtainedPoints()+" "+this.getGrade();
        return string;
    }
    
}
