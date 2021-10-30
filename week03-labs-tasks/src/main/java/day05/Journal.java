package day05;

import java.util.ArrayList;
import java.util.List;


public class Journal {
    private List<String> namesList = new ArrayList<>();

    public boolean addStudent(String studentName){
        if(isOK(studentName)){
            namesList.add(studentName);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isOK(String studentName){
        if(!isSpaceCorrect(studentName) || !isAlphabetic(studentName)){
            return false;
        }
        return true;
    }
    public boolean isAlphabetic(String studentName){
        for (char c: studentName.toCharArray()) {
            if(!Character.isAlphabetic(c) && !(c == ' ')){
                return false;
            }
        }
        return true;
    }
    public boolean isSpaceCorrect(String studentName){
        int indexOfSpace=studentName.indexOf(' ');
        if(indexOfSpace<2 || (studentName.length()-indexOfSpace)<3){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "namesList=" + namesList +
                '}';
    }
}
