import java.io.FileNotFoundException;
import java.util.*;

public class main {
	public static int plHP = 0; // az alap player hp, a kasztválasztás után ehhez adjuk a kaszt statjait
	public static int plDMG = 0; // ugyanaz, csak damage
	public static int plSK = 0; // ugyanaz, csak skill
	//public static int plSU = 0; // ez a változó a skillnek egyfajta cooldownja, a használat után 2 kört fixen
	// nem lehet használni.


	// 3 szint leszm minden gyõzelem után kap a játékot 1
	// xp-t, így kapjuk meg a következõ
	// ellenfelet, illetve lehet, hogy majd lesz valami döntés, minden szint után pedig 1,5-ös szorzóval nõnek a statjaink

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<bossok> bossok = new ArrayList<bossok>();
		bossok.add(new basilisk(150, 30));
		bossok.add(new frost_giant(200, 45));
		bossok.add(new shadow_lord(330, 60));

//		plot1(); // a plotokat egy-egy külsõ txt-bõl fogom behívni, a combatba is lesz story,
		// szintén txtbõl fogom behívni
		choose();
		combat(bossok); // tömblistából hívom meg a bossokat, lehet döntések is lesznek majd benne, de
		// ez még odébb lesz i guess.
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
		// itt választunk fajt és kasztot egyszerû számok segítségével
		try {
			System.out.println("Válassz fajt! \n1 - Ember \n2 - Ork");
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
					System.out.println("\nNem megfelõlek az érték, add meg, hogy a választott opciód 1 vagy 2!");
					choose();
					break;
			}

		} catch (Exception no) {
			System.out.println("Nem megfelelõ bevitt érték, adj meg egy számot a következõk közül: 1; 2!");
			choose();
		}
	}

	public static void Human() {
		try {
			System.out.println("Válassz kasztot! \n1 - Mágus (Élet - 105, Sebzés - 50, Képesség - 90)"
					+ " \n2 - Harcos (Élet - 115, Sebzés - 45, Képesség - 80) "
					+ "\n3 - Bérgyilkos (Élet - 90, Sebzés - 60, Képesség - 120)\n");
			Scanner sc1 = new Scanner(System.in);
			int be1 = sc1.nextInt();
//itt az alap 0 értékre jön be a kasztok értékei, amik ki lesznek írva, ezek fognak a harcok során boostolódni majd, de ezt késõbb, ott.
//ugyanez az orknál
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
					System.out.println("\nNem megfelõlek az érték, add meg, hogy a választott opciód 1, 2 vagy 3!");
					Human();
					break;
			}

			// plotHuman();
		} catch (Exception no) {
			System.out.println("Nem megfelelõ bevitt érték, adj meg egy számot a következõk közül: 1; 2; 3!");
			Human();
		}
	}

	public static void Orc() {
		try {
			System.out.println("Válassz kasztot! \n1 - Druida (Élet - 95, Sebzés - 55, Képesség - 100) "
					+ "\n2 - Vadász (Élet - 130, Sebzés - 60, Képesség - 95) "
					+ "\n3 - Berzerker (Élet - 120, Sebzés - 45, Képesség - 120)\n");
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
					System.out.println("\nNem megfelõlek az érték, add meg, hogy a választott opciód 1, 2 vagy 3!");
					Orc();
					break;
			}

			// plotOrc();
		} catch (Exception no) {
			System.out.println("Nem megfelelõ bevitt érték, adj meg egy számot a következõk közül: 1; 2; 3!");
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
			//////////////////////////////////////////////// ELSÕ
			//////////////////////////////////////////////// BOSS///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			try {
				if (plXP == 1) {
					bossok.get(0);
					while (plHP >= 0 && basilisk.hp >= 0) {

						/*	for (int sk_counter = 0; sk_counter <= 4; sk_counter++) {
								switch (sk_counter) {
								default:
									System.out.println("Még " + (4-sk_counter) + " körig nem használhatod!");
									break;
								case 3:
									System.out.println("Mostantól használhatod!");
								}
							*/
						System.out.println("\nBaziliszkusz életereje: " + basilisk.hp + "\nÉleterõd: " + plHP);
						System.out.println("\nGombok:\n1 - Támadás\n2 - Különleges támadás\n3 - Gyógyítás");

						Scanner comm1 = new Scanner(System.in);
						int command1 = comm1.nextInt();


						switch (command1) {
							case 1:
								//(command1 == 1); // játékos támad
								basilisk.serul(((int) ((Math.random() * (plDMG - (plDMG - 20) + 1) + (plDMG - 20)))));
								break;
							// random dmg, hogy ne csak fix számot vonjon le,
							// ugyanígy lesz megcsinálva a bossoknál is

							case 2:
								//(command1 == 2) { // játékos skill támadása, ezt valahogy megcsinálom, hogy csak 2-3
								// körönként lehessen, amolyan cooldown-nal
								basilisk.serul(((int) ((Math.random() * (plSK - (plSK - 20) + 1) + (plSK - 20)))));
								break;

							case 3:  // heal, amibõl lesz 5 egy csata alatt, 40 hp-t fog visszatölteni
								long h_count = 5;
								plHP += 50;
								System.out.println("Gyógylötty betolva: " + plHP + " Hp");
								h_count--;
								System.out.println("Ennyi maradt erre a harcra: " + h_count);

								if (h_count == 0) {
									System.out.println("Elfogyott a healed, adj meg másik parancsot!");

								} else {
									System.out.println("Még " + h_count + " löttyöd maradt!");
								}
								break;

							default:
								System.out.println("Nem megfelelõ szám! Kérlek adj meg egy számot 1 és 3 közt!");
								combat(bossok);
								break;
						}
					}
				}
			} catch (Exception no) {
						System.out.println("Eltörted a játékot, kezdheted újra! (Nem megfelelõ parancs.)");
						combat(bossok);
			}

			//boss támad
					plHP -= basilisk.dmg / 3;


					if (plHP < 0) {
						System.out.println("Meghaltál, kezdd újra!");
					} else if (basilisk.hp <= 0) {
						System.out.println("Gyõztél!");
						plHP *= 1.5;
						plDMG *= 1.5;
						plSK *= 1.5;
						System.out.println("Jelenlegi Statok:" + "\n" + plHP + " Hp " + plDMG + " dmg " + plSK
								+ " dmg " + plXP + " xp");
					}





//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////// MÁSODIK
			//////////////////////////////////////////////// BOSS///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

			try {
				if (plXP == 2) {
					bossok.get(1);
					while (plHP >= 0 && frost_giant.hp >= 0) {
						System.out.println("Jégóriás életereje: " + frost_giant.hp + "\nÉleterõd: " + plHP);
						System.out.println("Gombok:\n1 - Támadás\n2 - Különleges támadás\n3 - Gyógyítás");

						Scanner comm2 = new Scanner(System.in);
						int command2 = comm2.nextInt();

						switch (command2) {
							case 1: // játékos támad
								frost_giant.serul(((int) ((Math.random() * (plDMG - (plDMG - 20) + 1) + (plDMG - 20)))));
								// random dmg, hogy ne csak fixszámot vonjon le,
								// ugyanígy lesz megcsinálva a bossoknál is
								break;

							case 2:  // játékos skill támadása, ezt valahogy megcsinálom, hogy csak
								// 2-3
								// körönként lehessen, amolyan cooldown-nal
								frost_giant.serul(((int) ((Math.random() * (plSK - (plSK - 20) + 1) + (plSK - 20)))));
								break;

							case 3:// heal, amibõl lesz 5 egy csata alatt, 40 hp-t fog visszatölteni
								long h_count = 5;
								plHP += 50;
								System.out.println("Gyógylötty betolva: " + plHP + " Hp");
								h_count--;
								System.out.println("Még " + h_count + " löttyöd maradt!");
								break;

							default:
								System.out.println("Nem megfelelõ szám! Kérlek adj meg egy számot 1 és 3 közt!");
								combat(bossok);
								break;
						}

					}
				}
			} catch (Exception no) {
				System.out.println("Eltörted a játékot, kezdheted újra! (Nem megfelelõ parancs.)");
				combat(bossok);
			}
			//boss támad
			plHP -= frost_giant.dmg / 3;

			if (plHP < 0) {
				System.out.println("Meghaltál, kezdd újra!");
			}

			if (basilisk.hp <= 0) {
				System.out.println("Gyõztél!");
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
						System.out.println("Sötét Nagyúr életereje: " + shadow_lord.hp + "\nÉleterõd: " + plHP);
						System.out.println("Gombok:\n1 - Támadás\n2 - Különleges támadás\n3 - Gyógyítás");

						Scanner comm3 = new Scanner(System.in);
						int command3 = comm3.nextInt();

						switch (command3) {
							case 1: // játékos támad
								shadow_lord.serul(((int) ((Math.random() * (plDMG - (plDMG - 20) + 1) + (plDMG - 20)))));
								break;

							case 2: // játékos skill támadása, ezt valahogy megcsinálom, hogy csak
								// 2-3
								// körönként lehessen, amolyan cooldown-nal
								shadow_lord.serul(((int) ((Math.random() * (plSK - (plSK - 20) + 1) + (plSK - 20)))));
								break;

							case 3: // heal, amibõl lesz 5 egy csata alatt, 40 hp-t fog visszatölteni
								int h_count = 5;
								plHP += 50;
								System.out.println("Gyógylötty betolva: " + plHP + " Hp");
								h_count--;
								System.out.println("Még " + h_count + " löttyöd maradt!");
								break;

							default:
								System.out.println("Nem megfelelõ szám! Kérlek adj meg egy számot 1 és 3 közt!");
								combat(bossok);
						}
						//boss támad
						plHP -= shadow_lord.dmg / 3;
					}
				}

			} catch (Exception no) {
				System.out.println("Eltörted a játékot, kezdheted újra! (Nem megfelelõ parancs.)");
				combat(bossok);
			}
			if (plHP < 0) {
				System.out.println("Meghaltál, kezdd újra!");
			}

			if (shadow_lord.hp <= 0) {
				//plot lezárása
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

