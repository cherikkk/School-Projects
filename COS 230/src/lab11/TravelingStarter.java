package lab11;

public class TravelingStarter {
	int numCities;
	int map[][]={
			{0, 6, 0, 0, 0, 0, 99, 0, 20, 0, 0, 0, 0, 58, 0, 0, 0, 0, 92, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 82, 0, 0, 0, 0, 74, 0, 93, 16, 54, 39, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 15, 77, 0, 0, 0, 0, 99, 0, 75, 0, 0, 0, 0, 0, 0, 0, 92, 0, 0, 20, 52, 0},
			{0, 0, 69, 0, 0, 0, 0, 79, 0, 0, 0, 0, 0, 0, 89, 0, 0, 0, 97, 14, 0, 0, 0, 0, 0, 0},
			{45, 13, 0, 0, 0, 0, 87, 0, 77, 31, 0, 0, 0, 0, 0, 0, 72, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{67, 0, 49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 86, 0, 0, 0, 26, 0, 0, 17, 0, 0, 96, 0, 0},
			{0, 0, 0, 0, 0, 66, 0, 0, 0, 39, 0, 0, 0, 0, 46, 61, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 80, 21, 0, 92, 0, 0, 0, 0, 0, 0, 7, 92, 0, 0, 27, 0, 0, 0, 31, 0, 0, 0, 0, 0},
			{13, 0, 88, 0, 0, 0, 0, 29, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 37},
			{0, 0, 0, 0, 74, 50, 0, 0, 0, 0, 77, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 65, 0, 0},
			{0, 95, 49, 0, 0, 0, 52, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 85, 0, 0, 0, 0, 0, 0},
			{0, 0, 37, 37, 0, 0, 0, 0, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0, 62, 0, 0, 46, 0, 80, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 22, 0, 0, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0},
			{0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 95, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22, 44, 43, 0},
			{0, 0, 0, 8, 0, 0, 0, 0, 0, 68, 0, 0, 0, 21, 0, 0, 0, 0, 0, 0, 72, 0, 0, 0, 76, 0},
			{0, 20, 0, 0, 0, 0, 52, 36, 0, 0, 21, 0, 0, 17, 0, 0, 0, 71, 0, 0, 0, 0, 71, 6, 0, 0},
			{0, 0, 0, 0, 92, 0, 96, 0, 0, 0, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 41, 0},
			{0, 0, 0, 81, 0, 0, 6, 0, 82, 0, 58, 0, 0, 0, 0, 0, 94, 0, 47, 0, 0, 0, 81, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 60, 59, 87, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 52, 69, 0, 50, 0, 0, 64, 0, 0, 43, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 57, 0, 0, 0},
			{0, 0, 24, 0, 0, 0, 0, 68, 0, 0, 0, 0, 52, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 3, 51, 0, 26, 0, 0, 0, 0, 0, 46, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 95},
			{0, 0, 0, 0, 0, 99, 0, 0, 0, 0, 68, 90, 82, 0, 0, 85, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 72, 24, 66, 0, 28, 0, 0, 0, 74, 0, 0, 0, 38, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 98, 0, 0, 0, 0, 0, 69, 16, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 57, 0, 0, 6, 40, 0, 23, 0, 0, 0, 0, 0, 88, 34, 0, 0, 28, 0, 38, 0},
		};

	TravelingStarter(int numCities){
		this.numCities = numCities;
	}
	public void printMap(){
		for(int i=0; i < numCities; i++){
			for(int j= 0; j < numCities; j++){
				System.out.printf(" %02d", map[i][j]);
			}
			System.out.println();
		}
	}
	
	//Returns the index of the given character
	/*public static int index(char c) {
		return c-'A';
	}
	
	//Finds the length of the given path
	public int calcPath(String path) {
		
	}
	
	//
	public permutateString() {
		
	}
	
	//
	public 

	public static void main(String[] args) {
		TravelingStarter ts = new TravelingStarter(10);
		ts.printMap();
		
		System.out.println(index('C'));
	}*/
}