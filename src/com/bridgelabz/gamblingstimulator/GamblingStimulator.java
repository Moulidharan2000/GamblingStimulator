package com.bridgelabz.gamblingstimulator;

import java.util.Random;

public class GamblingStimulator {
	
	static final int STAKE_MONEY = 100;
	static final int BET_MONEY = 1;
	static void Gamble(int num) {
		if(num == 1 && STAKE_MONEY >= 100) {
			int won = STAKE_MONEY + BET_MONEY;
			System.out.println("Gambler Won : $"+BET_MONEY);
			System.out.println("Stake Amount : "+won);
		}
		else {
			int loose = STAKE_MONEY - BET_MONEY;
			System.out.println("Gambler Loose : $"+BET_MONEY);
			System.out.println("Stake Amount : "+loose);
		}
	}
	
	public static void main(String[] args) {

		Random random = new Random();
		int num = random.nextInt(2);
		Gamble(num);
	}
}
