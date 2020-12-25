public class Status {
	public int hp;
	public int lv;
	public int atk;
	public int def;
	public int speed;
	public int mp;
	public int luk;

	public Status() {
		this.hp = 100;
		this.lv = 1;
		this.atk = 50;
		this.def = 50;
		this.speed = 5;
		this.mp = 50;
		this.luk = 30;
	}

	public void showData() {
		System.out.println("---Player Profile---");
		System.out.println("LV:	" + this.lv);
		System.out.println("HP:	" + this.hp);
		System.out.println("MP:	" + this.mp);
		System.out.println("ATK:	" + this.atk);
		System.out.println("DEF:	" + this.def);
		System.out.println("SPEED:	" + this.speed);
		System.out.println("LUK:	" + this.luk);
	}
}