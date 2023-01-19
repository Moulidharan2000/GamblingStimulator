package com.bridgelabz.gamblingstimulator;

import java.util.Random;

public class GamblingStimulator {
	
	static int STAKE_MONEY = 100;
	static int BET_MONEY = 1;
	
	static void Gamble(int winpercent, int lostpercent) {
		
		Random random = new Random();
		while(STAKE_MONEY > lostpercent && STAKE_MONEY < winpercent) {
			
			int num = random.nextInt(2);
			switch(num){
				case 1 : STAKE_MONEY = STAKE_MONEY + BET_MONEY;
					System.out.println("Gambler Won : +$"+BET_MONEY);
					System.out.println("Stake Amount : "+STAKE_MONEY+"\n");
					if(STAKE_MONEY == winpercent)
						System.out.println("Gambler Resign for the Day !!!\n");
					break;
				
				default : STAKE_MONEY = STAKE_MONEY - BET_MONEY;
					System.out.println("Gambler Loose : -$"+BET_MONEY);
					System.out.println("Stake Amount : "+STAKE_MONEY+"\n");
					if(STAKE_MONEY == lostpercent)
						System.out.println("Gambler Resign for the Day !!!\n");
				}
			}
		}
	public static void main(String[] args) {
		
		int winpercent = 150;
		int lostpercent = 50;
		
		Gamble(winpercent, lostpercent);
	}
}
