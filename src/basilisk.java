
public class basilisk extends bossok {

	// itt adom meg a boss statjait.
	public basilisk(int h_p, int dm_g) {
		super(h_p, dm_g);
		this.hp = 150;
		this.dmg = ((int) ((Math.random() * (dmg - (dmg - 30) + 1) + (dmg - 30))));
	}

	public int getDmg() {
		return this.dmg;
	}

	public int getHp() {
		return this.hp;
	}

	public static void serul(int dmg) {
		basilisk.hp -= dmg;
	}

	public static void tamad(int i) {
		i -= basilisk.dmg;
	}

}
