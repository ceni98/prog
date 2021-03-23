
public class bossok {

	static int hp;
	static int dmg;

//itt a bossok alapjait tárolom el, innen fogja meghívni a mainbe egy listába töltve a bossokat, ahol fix értékeik lesznek, ez pedig egy szülõ osztálya
	// lesz a különbözõ bossoknak.

	public bossok(int h_p, int dm_g) {
		this.hp = h_p;
		this.dmg = dm_g;
	}

	public int getHp() {
		return this.hp;
	}

	public int getDmg() {
		return this.dmg;
	}

	public void setHp(int eletero) {
		this.hp += eletero;
	}

	public void setDmg(int tamadasero) {
		this.dmg += tamadasero;
	}

}