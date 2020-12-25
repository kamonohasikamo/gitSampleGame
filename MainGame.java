import java.util.Scanner;

public class MainGame {
	public static void main(String[] args) {
		Status playerData = new Status();
		playerData.showData();
		System.out.println("---Command List---");
		showCommand();
		System.out.println("Input Command!");
		Scanner sc = new Scanner(System.in);
		int line;
		while (sc.hasNext()) {
			line = sc.nextInt();
			switch (line) {
				case 1: {
					AddLV addlv = new AddLV();
					playerData.lv = addlv.addLv(playerData.lv);
				}
					break;
				case 2: {
					SubLV sublv = new SubLV();
					playerData.lv = sublv.sublv(playerData.lv);
				}
					break;
				case 3: {
					AddAtk addatk = new AddAtk();
					playerData.lv = addatk.addatk(playerData.atk);
				}
					break;
				case 4: {
					SubAtk subatk = new SubAtk();
					playerData.lv = subatk.subatk(playerData.atk);
				}
					break;
				case 5: {
					AddDef adddef = new AddDef();
					playerData.lv = adddef.adddef(playerData.def);
				}
					break;
				case 6: {
					SubDef subdef = new SubDef();
					playerData.lv = subdef.subdef(playerData.def);
				}
					break;
				case 7: {
					AddHP addhp = new AddHP();
					playerData.lv = addhp.addhp(playerData.hp);
				}
					break;
				case 8: {
					SubHP subhp = new SubHP();
					playerData.lv = subhp.subhp(playerData.hp);
				}
					break;
				case 9: {
					AddMP addmp = new AddMP();
					playerData.lv = addmp.addmp(playerData.mp);
				}
					break;
				default: {

				}
					break;
			}
			playerData.showData();
		}
		sc.close();
	}

	public static void showCommand() {
		System.out.println("1: Add Lv");
		System.out.println("2: Sub Lv");
		System.out.println("3: Add atk");
		System.out.println("4: Sub atk");
		System.out.println("5: Add def");
		System.out.println("6: Sub def");
		System.out.println("7: Add HP");
		System.out.println("8: Sub HP");
		System.out.println("9: Add MP");
		System.out.println("exit: close program");
	}
}