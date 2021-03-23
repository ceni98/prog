import java.io.FileNotFoundException;
import java.util.*;

public class main {
	public static int plHP = 0; // az alap player hp, a kasztv�laszt�s ut�n ehhez adjuk a kaszt statjait
	public static int plDMG = 0; // ugyanaz, csak damage
	public static int plSK = 0; // ugyanaz, csak skill
	//public static int plSU = 0; // ez a v�ltoz� a skillnek egyfajta cooldownja, a haszn�lat ut�n 2 k�rt fixen
	// nem lehet haszn�lni.


	// 3 szint leszm minden gy�zelem ut�n kap a j�t�kot 1
	// xp-t, �gy kapjuk meg a k�vetkez�
	// ellenfelet, illetve lehet, hogy majd lesz valami d�nt�s, minden szint ut�n pedig 1,5-�s szorz�val n�nek a statjaink

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<bossok> bossok = new ArrayList<bossok>();
		bossok.add(new basilisk(150, 30));
		bossok.add(new frost_giant(200, 45));
		bossok.add(new shadow_lord(330, 60));

//		plot1(); // a plotokat egy-egy k�ls� txt-b�l fogom beh�vni, a combatba is lesz story,
		// szint�n txtb�l fogom beh�vni
		choose();
		combat(bossok); // t�mblist�b�l h�vom meg a bossokat, lehet d�nt�sek is lesznek majd benne, de
		// ez m�g od�bb lesz i guess.
//		plot3();
//		plotEND();
	}

	/*
	 * public static void plot1() throws FileNotFoundException { File plot = new
	 * File("plot1.txt"); Scanner story1 = new Scanner(plot); while
	 * (story1.hasNextLine()) { String data0 = story1.nextLine();
	 * System.out.println(data0); } story1.close(); }
	 */
	public static void choose() {
		// itt v�lasztunk fajt �s kasztot egyszer� sz�mok seg�ts�g�vel
		try {
			System.out.println("V�lassz fajt! \n1 - Ember \n2 - Ork");
			Scanner sc0 = new Scanner(System.in);
			int be0 = sc0.nextInt();

			switch (be0) {
				case 1:
					Human();
					break;
				case 2:
					Orc();
					break;
				default:
					System.out.println("\nNem megfel�lek az �rt�k, add meg, hogy a v�lasztott opci�d 1 vagy 2!");
					choose();
					break;
			}

		} catch (Exception no) {
			System.out.println("Nem megfelel� bevitt �rt�k, adj meg egy sz�mot a k�vetkez�k k�z�l: 1; 2!");
			choose();
		}
	}

	public static void Human() {
		try {
			System.out.println("V�lassz kasztot! \n1 - M�gus (�let - 105, Sebz�s - 50, K�pess�g - 90)"
					+ " \n2 - Harcos (�let - 115, Sebz�s - 45, K�pess�g - 80) "
					+ "\n3 - B�rgyilkos (�let - 90, Sebz�s - 60, K�pess�g - 120)\n");
			Scanner sc1 = new Scanner(System.in);
			int be1 = sc1.nextInt();
//itt az alap 0 �rt�kre j�n be a kasztok �rt�kei, amik ki lesznek �rva, ezek fognak a harcok sor�n boostol�dni majd, de ezt k�s�bb, ott.
//ugyanez az orkn�l
			switch (be1) {
				case 1:
					Mage();
					break;
				case 2:
					Warrior();
					break;
				case 3:
					Assassin();
				default:
					System.out.println("\nNem megfel�lek az �rt�k, add meg, hogy a v�lasztott opci�d 1, 2 vagy 3!");
					Human();
					break;
			}

			// plotHuman();
		} catch (Exception no) {
			System.out.println("Nem megfelel� bevitt �rt�k, adj meg egy sz�mot a k�vetkez�k k�z�l: 1; 2; 3!");
			Human();
		}
	}

	public static void Orc() {
		try {
			System.out.println("V�lassz kasztot! \n1 - Druida (�let - 95, Sebz�s - 55, K�pess�g - 100) "
					+ "\n2 - Vad�sz (�let - 130, Sebz�s - 60, K�pess�g - 95) "
					+ "\n3 - Berzerker (�let - 120, Sebz�s - 45, K�pess�g - 120)\n");
			Scanner sc1 = new Scanner(System.in);
			int be1 = sc1.nextInt();

			switch (be1) {
				case 1:
					Druid();
					break;
				case 2:
					Hunter();
					break;
				case 3:
					Berserker();
					break;
				default:
					System.out.println("\nNem megfel�lek az �rt�k, add meg, hogy a v�lasztott opci�d 1, 2 vagy 3!");
					Orc();
					break;
			}

			// plotOrc();
		} catch (Exception no) {
			System.out.println("Nem megfelel� bevitt �rt�k, adj meg egy sz�mot a k�vetkez�k k�z�l: 1; 2; 3!");
			Orc();
		}
	}

	public static void Mage() {
		int hp, dmg, skill;

		int pl_h;
		pl_h = 105;
		plHP += pl_h;

		int pl_d;
		pl_d = 50;
		plDMG += pl_d;

		int pl_s;
		pl_s = 90;
		plSK += pl_s;
	}

	public static void Warrior() {
		int hp, dmg, skill;

		int pl_h;
		pl_h = 115;
		plHP += pl_h;

		int pl_d;
		pl_d = 45;
		plDMG += pl_d;

		int pl_s;
		pl_s = 80;
		plSK += pl_s;
	}

	public static void Assassin() {
		int hp, dmg, skill;

		int pl_h;
		pl_h = 90;
		plHP += pl_h;

		int pl_d;
		pl_d = 60;
		plDMG += pl_d;

		int pl_s;
		pl_s = 120;
		plSK += pl_s;
	}

	public static void Hunter() {
		int hp, dmg, skill;

		int pl_h;
		pl_h = 130;
		plHP += pl_h;

		int pl_d;
		pl_d = 60;
		plDMG += pl_d;

		int pl_s;
		pl_s = 95;
		plSK += pl_s;
	}

	public static void Druid() {
		int hp, dmg, skill;

		int pl_h;
		pl_h = 95;
		plHP += pl_h;

		int pl_d;
		pl_d = 55;
		plDMG += pl_d;

		int pl_s;
		pl_s = 100;
		plSK += pl_s;
	}

	public static void Berserker() {
		int hp, dmg, skill;

		int pl_h;
		pl_h = 120;
		plHP += pl_h;

		int pl_d;
		pl_d = 45;
		plDMG += pl_d;

		int pl_s;
		pl_s = 120;
		plSK += pl_s;
	}

	public static void combat(ArrayList<bossok> bossok) {

		for (long plXP = 0; plXP <= 4; plXP++) {

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////// ELS�
			//////////////////////////////////////////////// BOSS///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			try {
				if (plXP == 1) {
					bossok.get(0);
					while (plHP >= 0 && basilisk.hp >= 0) {

						/*	for (int sk_counter = 0; sk_counter <= 4; sk_counter++) {
								switch (sk_counter) {
								default:
									System.out.println("M�g " + (4-sk_counter) + " k�rig nem haszn�lhatod!");
									break;
								case 3:
									System.out.println("Mostant�l haszn�lhatod!");
								}
							*/
						System.out.println("\nBaziliszkusz �letereje: " + basilisk.hp + "\n�leter�d: " + plHP);
						System.out.println("\nGombok:\n1 - T�mad�s\n2 - K�l�nleges t�mad�s\n3 - Gy�gy�t�s");

						Scanner comm1 = new Scanner(System.in);
						int command1 = comm1.nextInt();


						switch (command1) {
							case 1:
								//(command1 == 1); // j�t�kos t�mad
								basilisk.serul(((int) ((Math.random() * (plDMG - (plDMG - 20) + 1) + (plDMG - 20)))));
								break;
							// random dmg, hogy ne csak fix sz�mot vonjon le,
							// ugyan�gy lesz megcsin�lva a bossokn�l is

							case 2:
								//(command1 == 2) { // j�t�kos skill t�mad�sa, ezt valahogy megcsin�lom, hogy csak 2-3
								// k�r�nk�nt lehessen, amolyan cooldown-nal
								basilisk.serul(((int) ((Math.random() * (plSK - (plSK - 20) + 1) + (plSK - 20)))));
								break;

							case 3:  // heal, amib�l lesz 5 egy csata alatt, 40 hp-t fog visszat�lteni
								long h_count = 5;
								plHP += 50;
								System.out.println("Gy�gyl�tty betolva: " + plHP + " Hp");
								h_count--;
								System.out.println("Ennyi maradt erre a harcra: " + h_count);

								if (h_count == 0) {
									System.out.println("Elfogyott a healed, adj meg m�sik parancsot!");

								} else {
									System.out.println("M�g " + h_count + " l�tty�d maradt!");
								}
								break;

							default:
								System.out.println("Nem megfelel� sz�m! K�rlek adj meg egy sz�mot 1 �s 3 k�zt!");
								combat(bossok);
								break;
						}
					}
				}
			} catch (Exception no) {
						System.out.println("Elt�rted a j�t�kot, kezdheted �jra! (Nem megfelel� parancs.)");
						combat(bossok);
			}

			//boss t�mad
					plHP -= basilisk.dmg / 3;


					if (plHP < 0) {
						System.out.println("Meghalt�l, kezdd �jra!");
					} else if (basilisk.hp <= 0) {
						System.out.println("Gy�zt�l!");
						plHP *= 1.5;
						plDMG *= 1.5;
						plSK *= 1.5;
						System.out.println("Jelenlegi Statok:" + "\n" + plHP + " Hp " + plDMG + " dmg " + plSK
								+ " dmg " + plXP + " xp");
					}





//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////// M�SODIK
			//////////////////////////////////////////////// BOSS///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

			try {
				if (plXP == 2) {
					bossok.get(1);
					while (plHP >= 0 && frost_giant.hp >= 0) {
						System.out.println("J�g�ri�s �letereje: " + frost_giant.hp + "\n�leter�d: " + plHP);
						System.out.println("Gombok:\n1 - T�mad�s\n2 - K�l�nleges t�mad�s\n3 - Gy�gy�t�s");

						Scanner comm2 = new Scanner(System.in);
						int command2 = comm2.nextInt();

						switch (command2) {
							case 1: // j�t�kos t�mad
								frost_giant.serul(((int) ((Math.random() * (plDMG - (plDMG - 20) + 1) + (plDMG - 20)))));
								// random dmg, hogy ne csak fixsz�mot vonjon le,
								// ugyan�gy lesz megcsin�lva a bossokn�l is
								break;

							case 2:  // j�t�kos skill t�mad�sa, ezt valahogy megcsin�lom, hogy csak
								// 2-3
								// k�r�nk�nt lehessen, amolyan cooldown-nal
								frost_giant.serul(((int) ((Math.random() * (plSK - (plSK - 20) + 1) + (plSK - 20)))));
								break;

							case 3:// heal, amib�l lesz 5 egy csata alatt, 40 hp-t fog visszat�lteni
								long h_count = 5;
								plHP += 50;
								System.out.println("Gy�gyl�tty betolva: " + plHP + " Hp");
								h_count--;
								System.out.println("M�g " + h_count + " l�tty�d maradt!");
								break;

							default:
								System.out.println("Nem megfelel� sz�m! K�rlek adj meg egy sz�mot 1 �s 3 k�zt!");
								combat(bossok);
								break;
						}

					}
				}
			} catch (Exception no) {
				System.out.println("Elt�rted a j�t�kot, kezdheted �jra! (Nem megfelel� parancs.)");
				combat(bossok);
			}
			//boss t�mad
			plHP -= frost_giant.dmg / 3;

			if (plHP < 0) {
				System.out.println("Meghalt�l, kezdd �jra!");
			}

			if (basilisk.hp <= 0) {
				System.out.println("Gy�zt�l!");
				plHP *= 1.5;
				plDMG *= 1.5;
				plSK *= 1.5;
				System.out.println("Jelenlegi Statok:" + "\n" + plHP + " Hp " + plDMG + " dmg " + plSK + " dmg "
						+ plXP + " xp");
			}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////// HARMADIK
			//////////////////////////////////////////////// BOSS///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			try {
				if (plXP == 3) {
					bossok.get(2);
					while (plHP >= 0 && shadow_lord.hp >= 0) {
						System.out.println("S�t�t Nagy�r �letereje: " + shadow_lord.hp + "\n�leter�d: " + plHP);
						System.out.println("Gombok:\n1 - T�mad�s\n2 - K�l�nleges t�mad�s\n3 - Gy�gy�t�s");

						Scanner comm3 = new Scanner(System.in);
						int command3 = comm3.nextInt();

						switch (command3) {
							case 1: // j�t�kos t�mad
								shadow_lord.serul(((int) ((Math.random() * (plDMG - (plDMG - 20) + 1) + (plDMG - 20)))));
								break;

							case 2: // j�t�kos skill t�mad�sa, ezt valahogy megcsin�lom, hogy csak
								// 2-3
								// k�r�nk�nt lehessen, amolyan cooldown-nal
								shadow_lord.serul(((int) ((Math.random() * (plSK - (plSK - 20) + 1) + (plSK - 20)))));
								break;

							case 3: // heal, amib�l lesz 5 egy csata alatt, 40 hp-t fog visszat�lteni
								int h_count = 5;
								plHP += 50;
								System.out.println("Gy�gyl�tty betolva: " + plHP + " Hp");
								h_count--;
								System.out.println("M�g " + h_count + " l�tty�d maradt!");
								break;

							default:
								System.out.println("Nem megfelel� sz�m! K�rlek adj meg egy sz�mot 1 �s 3 k�zt!");
								combat(bossok);
						}
						//boss t�mad
						plHP -= shadow_lord.dmg / 3;
					}
				}

			} catch (Exception no) {
				System.out.println("Elt�rted a j�t�kot, kezdheted �jra! (Nem megfelel� parancs.)");
				combat(bossok);
			}
			if (plHP < 0) {
				System.out.println("Meghalt�l, kezdd �jra!");
			}

			if (shadow_lord.hp <= 0) {
				//plot lez�r�sa
			//	plotEND();
			}
		}
	}



	/*
	 * private static void plotHuman() throws FileNotFoundException { File plot2 =
	 * new File("plotHum.txt"); Scanner story2 = new Scanner(plot2); while
	 * (story2.hasNextLine()) { String data1 = story2.nextLine();
	 * System.out.println(data1); } story2.close(); }
	 *
	 *
	 * private static void plotOrc() throws FileNotFoundException { File plot3 = new
	 * File("plotOrc.txt"); Scanner story2 = new Scanner(plot3); while
	 * (story2.hasNextLine()) { String data0 = story2.nextLine();
	 * System.out.println(data0); } story2.close(); }
	 *
	 *
	 * private static void plot3() throws FileNotFoundException {
	 * File plot4 = new File("plot3.txt");
	 * Scanner story3 = new Scanner(plot4);
	 * while (story3.hasNextLine()) {
	 * String data2 = story3.nextLine();
	 * System.out.println(data2); }
	 * story3.close();
	 * }
	 *
	 *
	 * private static void plotEND() throws FileNotFoundException { File plotEND =
	 * new File("plot4.txt"); Scanner storyEND = new Scanner(plotEND); while
	 * (storyEND.hasNextLine()) { String dataEND = storyEND.nextLine();
	 * System.out.println(dataEND); } storyEND.close(); }
	 */
}

