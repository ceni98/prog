
public class bossok {

	static int hp;
	static int dmg;

//itt a bossok alapjait t�rolom el, innen fogja megh�vni a mainbe egy list�ba t�ltve a bossokat, ahol fix �rt�keik lesznek, ez pedig egy sz�l� oszt�lya
	// lesz a k�l�nb�z� bossoknak.

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