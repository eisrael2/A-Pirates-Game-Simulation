package project;
import java.util.Random;

//Set objects on the grid
public class OceanMap {
	
	boolean[][] islands;
	boolean[][] whirlpool;
	boolean[][] treasure;
	boolean[][] jaws;
	int dimensions;
	int islandNumber;
	int whirlpoolNumber;
	Random random = new Random();
	Point shipLocation;
	Point treasureLocation;
	public static final int scale = 35;
	private int treasureNumber;
	private static OceanMap instance;
	private OceanMap(int dimensions, int islandNumber, int whirlpoolNumber, int treasureNumber) {
		
		islands = new boolean[dimensions][dimensions];
		whirlpool = new boolean[dimensions][dimensions];
		treasure = new boolean[dimensions][dimensions];
		this.dimensions = dimensions;
		this.islandNumber = islandNumber;
		this.whirlpoolNumber = whirlpoolNumber;
		this.treasureNumber = treasureNumber;
		setIslands();
		setWhirlpool();
		setTreasureIsland();
	}
	public static OceanMap getInstance() {
		if (instance == null) {
			instance = new OceanMap(22, 20, 3, 1);
		}
		return instance;
	}
	//Set Whirlpools randomly
	private void setWhirlpool() {
		int whirlpoolToSet = whirlpoolNumber;
		while (whirlpoolToSet > 0) {
			int x = random.nextInt(dimensions);
			int y = random.nextInt(dimensions);
			if (whirlpool[x][y] == false && islands[x][y] == false) {
				whirlpool[x][y] = true;
				whirlpoolToSet--;
			}
		}
	}
	//Set Islands randomly
	private void setIslands() {
		int islandsToSet = islandNumber;
		while (islandsToSet > 0) {
			int x = random.nextInt(dimensions);
			int y = random.nextInt(dimensions);
			if (islands[x][y] == false) {
				islands[x][y] = true;
				islandsToSet--;
			}
		}
	}
	//Set Treasure island randomly
	private void setTreasureIsland() {
		int treasureIslandToSet = treasureNumber;
		while (treasureIslandToSet > 0) {
			int x = random.nextInt(dimensions);
			int y = random.nextInt(dimensions);
			treasureLocation = new Point(x, y);
			if (treasure[x][y] == false && islands[x][y] == false && whirlpool[x][y] == false) {
				treasure[x][y] = true;
				treasureIslandToSet--;
			}
		}
	}
	//Return a generated ship
	public Point getShipLocation() {
		return shipLocation;
	}
	
	public Point getTreasure() {
		return treasureLocation;
	}
	//Return a generated map
	public boolean[][] getmap() {
		return islands;
	}
	//Return a grid dimensions
	public int getDimensions() {
		return dimensions;
	}
	public boolean ocean(int d, int e) {
		if (!islands[d][e])
			return true;
		else
			return false;
	}
}