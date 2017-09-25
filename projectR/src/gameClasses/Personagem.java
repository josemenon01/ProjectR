package gameClasses;

import java.util.Random;

public abstract class Personagem {
	
	private String nome;
	private int lv;
	private int max_hp;
	private int hp;
	private int atk;
	private int def;
	private int speed;
	
	
	abstract void calcBase(int nivel);
	
	public int dado20() {
		Random rand = new Random();
		return rand.nextInt(21);
	}
	
	public void receber_dano(int atk) {
		this.hp = hp - (atk - this.def);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	public int getMax_hp() {
		return max_hp;
	}
	public void setMax_hp(int max_hp) {
		this.max_hp = max_hp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
