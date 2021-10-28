package day04;

import java.util.List;

public class Sultan {
    public static void main(String[] args) {
        Prison prison = new Prison(100);
        prison.openFreeCells();
        //System.out.println(prison);

        List<Cell> cellList=prison.getCellList();
        for(Cell cell:cellList){
            if(cell.isFree()){
                System.out.println(cell.getValue()+" is free ("+cell.getDividers()+")!");
            }
        }
    }
}
