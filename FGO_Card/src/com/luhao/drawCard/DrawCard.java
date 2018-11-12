package com.luhao.drawCard;

import java.util.Random;

public class DrawCard {
	
	private double[] answer;
	Random r;
	
	private void getOne(int i, double j) {
		double random = 0;
		if (j == 0) {
			random = r.nextDouble();
		} else {
			random = j;
		}
//		System.out.println(random);
		if (random >= 0.6) {
			
		} else if (random >= 0.2) {
			
		} else if (random >= 0.08) {
			
		} else if (random >= 0.05) {
			
		} else if (random >= 0.01) {
			
		} else {
			
		}
	}
	
	private void getTen() {
		answer = new double[10];
		r = new Random();
		for (int i = 0; i < 10; i++) {
			getOne(i, 0);
		}
	}
	
	public static void main(String[] args) {
//		Random random = new Random();
//		int i = random.nextInt(100);
//		System.out.println(i);
		DrawCard drawCard = new DrawCard();
		drawCard.getTen();
	}
}
