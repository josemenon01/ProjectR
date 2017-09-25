package main;

import java.io.IOException;

import gameClasses.Monstro;
import gameClasses.Player;

public class Geral {
	
	public static void main(String args[]) throws IOException {
	Player player = new Player("Tester");
	Monstro mob = new Monstro(1, 1);
	
	while(mob.getHp() > 0) {
		mob.receber_dano(player.getAtk());
		player.receber_dano(mob.getAtk());
		System.out.println(player.getAtk());
	}
	player.exp_rew(mob.getXp_reward());
	System.out.println("Nivel:" + player.getLv());
	System.out.println("atk:"+player.getAtk());
	System.out.println("max hp:"+player.getMax_hp());
	System.out.println("montro morreu");
	System.out.println("hp antes item:"+player.getHp());
	player.usarItem();
	System.out.println("hp:"+player.getHp());
	}
}
