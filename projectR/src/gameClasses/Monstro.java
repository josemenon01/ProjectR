package gameClasses;

public class Monstro extends Personagem {
	
	private int xp_reward;
	private int gold_reward;
	
	
	
	public Monstro(int nivel, int tipo) {
		
		super.setAtk(10);
		super.setDef(5);
		super.setMax_hp(25);
		super.setHp(25);
		super.setLv(nivel);
		super.setNome("bat");
		super.setSpeed(4);
		xp_reward = 50;
		gold_reward = 5;
		
	}
	

	@Override
	
	void calcBase(int nivel) {
		
	}
	
	

	public int getXp_reward() {
		return xp_reward;
	}

	public void setXp_reward(int xp_reward) {
		this.xp_reward = xp_reward;
	}

	public int getGold_reward() {
		return gold_reward;
	}

	public void setGold_reward(int gold_reward) {
		this.gold_reward = gold_reward;
	}
	
	
	
}
