package day01;

import java.util.ArrayList;
import java.util.List;
public class Students {
    List<Integer> heightList = new ArrayList<>();
    public void addHeight (int height){
        heightList.add(height);
    }
    public boolean isHeightsIncreasing(){
        boolean isHeightsIncreasing=true;
        int i = 1;
        while(isHeightsIncreasing && i < heightList.size()){
            if(heightList.get(i-1)>heightList.get(i)) {
                isHeightsIncreasing=false;
            }
            i++;
        }
        return isHeightsIncreasing;
    }

    @Override
    public String toString() {
        return "Students{" +
                "heightList=" + heightList +
                '}';
    }
}
