package cleanCode.com.sspark.second.flagged;

import java.util.ArrayList;
import java.util.List;

public class FlaggedCells {
	
	public static void main(String[] args) {
		
		
	}
	
	public List<int[]> getFlaggedCells(ArrayList<int[]> gameBoard) {
	
		List<int[]> flaggedCells = new ArrayList<int[]>();
		
		for(int[] cell : gameBoard) {
			if(cell[4] == 2) { //4 : STATUS_VALUE , 2 : FLAGGED
				flaggedCells.add(cell);
			}
		}
		return flaggedCells;
		
	}
}
