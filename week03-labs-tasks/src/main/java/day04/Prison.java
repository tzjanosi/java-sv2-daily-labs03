package day04;

import java.util.ArrayList;
import java.util.List;

public class Prison {
    private List<Cell> cellList = new ArrayList<>();

    public Prison(int numberOfCells) {
        Cell cell=new Cell(0);
        for(int i=0; i<numberOfCells;i++){
            cell=new Cell(i+1);
            cellList.add(cell);
        }
    }

    public List<Cell> getCellList() {
        return cellList;
    }

    public int getNumberOfCells(){
        return cellList.size();
    }

    public void openFreeCells(){
        for(Cell cell:cellList){
            int value=cell.getValue();
            for(int i=2;i<=value;i++) {
                if(value%i==0){
                    cell.FoundDivider(i);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Prison{" +
                "cellList=" + cellList +
                '}';
    }
}
