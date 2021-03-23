
public class shadow_lord extends bossok {

	static int hp;
	static int dmg;

	public shadow_lord(int h_p, int dm_g) {
		super(h_p, dm_g);
		this.hp = 300;
		this.dmg = ((int) ((Math.random() * (dmg - (dmg - 60) + 1) + (dmg - 60))));
	}

	public int getDMG() {
		return this.getDMG();
	}

	public int getHP() {
		return this.getHP();
	}

	public static void serul(int dmg) {
		shadow_lord.hp -= dmg;
	}

	public void tamad(int i) {
		i -= shadow_lord.dmg;
	}

}