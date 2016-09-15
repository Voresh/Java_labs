package lab2;

enum GrassType { 
	BLUEBERRY, //черника
	STRAWBERRY, //земляника
	RASPBERRY //малина
}

public class Grass extends Plant {
	private GrassType type;
	private int id;

	public GrassType getType() {
		return type;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Grass(GrassType type) {
		super();
		this.type = type;
		Forest.AddGrassToForest(this);
	}
	
	public void KillGrass() {
		Forest.RemoveGrassFromForest(id);
	}
}
