package day04;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private int value;
    boolean free;
    List<Integer> dividers = new ArrayList<>();

    public Cell(int value) {
        this.value = value;
        free = true;
        dividers.add(1);
    }
    public void FoundDivider(int divider){
        dividers.add(divider);
        free=!free;
    }

    public int getValue() {
        return value;
    }

    public boolean isFree() {
        return free;
    }

    public List<Integer> getDividers() {
        return dividers;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "value=" + value +
                ", free=" + free +
                ", dividers=" + dividers +
                '}';
    }
}
