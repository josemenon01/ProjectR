package gameClasses;

public class Player extends Personagem {

	
	private int exp;
	private int nivel_equip;
	private int potion;
	private int exp_n_level;
	
	
	public Player(String nome){
		
		super.setLv(1);
		super.setAtk(10);
		super.setDef(5);
		super.setHp(50);
		super.setMax_hp(50);
		super.setSpeed(5);
		super.setNome(nome);
		exp = 0;
		exp_n_level = 50;
		nivel_equip = 0;
		potion = 3;
	}
	
	
	
	

	
	public void defender() {
		
	}
	
	public void usarItem() {
		
		if((super.getHp()+50) <= super.getMax_hp()) {
			super.setHp(super.getHp()+50);
		}
		else{
			super.setHp(super.getMax_hp());
		}
		
	}
	public void equip() {
		
	}
	
	public void exp_rew(int xp_reward) {
		
		this.exp = this.exp + xp_reward;
		
		if(this.exp >= exp_n_level) {
			lvUp();
			exp_n_level = exp_n_level* 2;
		}
		
	}
	
	public void lvUp() {
		super.setLv(super.getLv()+1);
		calcBase(super.getLv());
	}


	@Override
	void calcBase(int nivel) {
		super.setAtk((int) ((super.getAtk()*0.2)+super.getAtk()));
		super.setDef((int) ((super.getDef()*0.2)+super.getDef()));
		super.setMax_hp((int)(super.getMax_hp()*0.1)+super.getMax_hp());
		
	}
	
	
	public int getExp() {
		return exp;
	}




	public void setExp(int exp) {
		this.exp = exp;
	}




	public int getNivel_equip() {
		return nivel_equip;
	}




	public void setNivel_equip(int nivel_equip) {
		this.nivel_equip = nivel_equip;
	}




	public int getPotion() {
		return potion;
	}




	public void setPotion(int potion) {
		this.potion = potion;
	}

}
