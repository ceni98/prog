
public class frost_giant extends bossok {

	static int hp;
	static int dmg;

	public frost_giant(int h_p, int dm_g) {
		super(h_p + 500, dm_g + 30);
		this.hp = 200;
		this.dmg = ((int) ((Math.random() * (dmg - (dmg - 45) + 1) + (dmg - 45))));

	}

	public int getDMG() {
		return this.getDMG();
	}

	public int getHP() {
		return this.getHP();
	}

	public static void serul(int dmg) {
		frost_giant.hp -= dmg;
	}

	public void tamad(int i) {
		i -= frost_giant.dmg;
	}

}