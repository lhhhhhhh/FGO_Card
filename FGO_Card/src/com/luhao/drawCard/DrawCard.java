package com.luhao.drawCard;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.luhao.util.CurrentUp;
import com.luhao.util.Item;

public class DrawCard {
	
	private List<Item> answer;
	Random r;
	CurrentUp currentUp;
	
	private Item getOne(int i, double j) {
		double random = 0;
		if (j == 0) {
			random = r.nextDouble();
		} else {
			random = j;
		}
//		System.out.println(random);
		if (random >= 0.6) {
			int upCount = currentUp.getCount(1, 3, 1);
			int count = currentUp.getCount(1, 3, 0);
			if (upCount != 0) {
				double upBias = (0.9 -0.6) / upCount;
				double bias = (1 - 0.9) /count;
				for (int iter = 0; iter < upCount; iter++) {
					if (random >= 0.6 + iter * upBias && random < 0.6 + (iter + 1) * upBias) {
						return currentUp.getUpCraftEssences3().get(iter);
					}
				}
				
				for (int iter = 0; iter < count; iter++) {
					if (random >= 0.9 + iter * bias && random < 0.9 + (iter + 1) * bias) {
						return currentUp.getCraftEssences3().get(iter);
					}
				}
			} else {
				double bias = (1 - 0.6) /count;
				for (int iter = 0; iter < upCount; iter++) {
					if (random >= 0.6 + iter * bias && random < 0.6 + (iter + 1) * bias) {
						return currentUp.getCraftEssences3().get(iter);
					}
				}
			}
		}
		if (random >= 0.2) {
			int upCount = currentUp.getCount(0, 3, 1);
			int count = currentUp.getCount(0, 3, 0);
			if (upCount != 0) {
				double upBias = (0.5 -0.2) / upCount;
				double bias = (0.6 - 0.5) /count;
				for (int iter = 0; iter < upCount; iter++) {
					if (random >= 0.2 + iter * upBias && random < 0.2 + (iter + 1) * upBias) {
						return currentUp.getUpServants3().get(iter);
					}
				}
				
				for (int iter = 0; iter < count; iter++) {
					if (random >= 0.5 + iter * bias && random < 0.5 + (iter + 1) * bias) {
						return currentUp.getServants3().get(iter);
					}
				}
			} else {
				double bias = (0.6 - 0.2) /count;
				for (int iter = 0; iter < count; iter++) {
					if (random >= 0.2 + iter * bias && random < 0.2 + (iter + 1) * bias) {
						return currentUp.getServants3().get(iter);
					}
				}
			}
		}
		if (random >= 0.08) {
			int upCount = currentUp.getCount(1, 4, 1);
			int count = currentUp.getCount(1, 4, 0);
			if (upCount != 0) {
				double upBias = (0.152 -0.08) / upCount;
				double bias = (0.2 - 0.152) /count;
				for (int iter = 0; iter < upCount; iter++) {
					if (random >= 0.08 + iter * upBias && random < 0.08 + (iter + 1) * upBias) {
						return currentUp.getUpCraftEssences4().get(iter);
					}
				}
				
				for (int iter = 0; iter < count; iter++) {
					if (random >= 0.152 + iter * bias && random < 0.152 + (iter + 1) * bias) {
						return currentUp.getCraftEssences4().get(iter);
					}
				}
			} else {
				double bias = (0.2 - 0.08) /count;
				for (int iter = 0; iter < count; iter++) {
					if (random >= 0.08 + iter * bias && random < 0.08 + (iter + 1) * bias) {
						return currentUp.getCraftEssences4().get(iter);
					}
				}
			}
		}
		if (random >= 0.05) {
			int upCount = currentUp.getCount(0, 4, 1);
			int count = currentUp.getCount(0, 4, 0);
			if (upCount != 0) {
				double upBias = (0.07 -0.05) / upCount;
				double bias = (0.08 - 0.07) /count;
				for (int iter = 0; iter < upCount; iter++) {
					if (random >= 0.05 + iter * upBias && random < 0.05 + (iter + 1) * upBias) {
						return currentUp.getUpServants4().get(iter);
					}
				}
				
				for (int iter = 0; iter < count; iter++) {
					if (random >= 0.07 + iter * bias && random < 0.07 + (iter + 1) * bias) {
						return currentUp.getServants4().get(iter);
					}
				}
			} else {
				double bias = (0.08 - 0.05) /count;
				for (int iter = 0; iter < count; iter++) {
					if (random >= 0.05 + iter * bias && random < 0.05 + (iter + 1) * bias) {
						return currentUp.getServants4().get(iter);
					}
				}
			}
		}
		if (random >= 0.01) {
			int upCount = currentUp.getCount(1, 5, 1);
			int count = currentUp.getCount(1, 5, 0);
			if (upCount != 0) {
				double upBias = (0.04 -0.01) / upCount;
				double bias = (0.05 - 0.04) /count;
				for (int iter = 0; iter < upCount; iter++) {
					if (random >= 0.01 + iter * upBias && random < 0.01 + (iter + 1) * upBias) {
						return currentUp.getUpCraftEssences5().get(iter);
					}
				}
				
				for (int iter = 0; iter < count; iter++) {
					if (random >= 0.04 + iter * bias && random < 0.04 + (iter + 1) * bias) {
						return currentUp.getCraftEssences5().get(iter);
					}
				}
			} else {
				double bias = (0.05 - 0.01) /count;
				for (int iter = 0; iter < count; iter++) {
					if (random >= 0.01 + iter * bias && random < 0.01 + (iter + 1) * bias) {
						return currentUp.getCraftEssences5().get(iter);
					}
				}
			}
		}
		int upCount = currentUp.getCount(0, 5, 1);
		int count = currentUp.getCount(0, 5, 0);
		if (upCount != 0) {
			double upBias = (0.0065 -0.00) / upCount;
			double bias = (0.01 - 0.0065) /count;
			for (int iter = 0; iter < upCount; iter++) {
				if (random >= 0.00 + iter * upBias && random < 0.00 + (iter + 1) * upBias) {
					return currentUp.getUpServants5().get(iter);
				}
			}
			
			for (int iter = 0; iter < count; iter++) {
				if (random >= 0.0065 + iter * bias && random < 0.0065 + (iter + 1) * bias) {
					return currentUp.getServants5().get(iter);
				}
			}
		} else {
			double bias = (0.01 - 0.00) /count;
			for (int iter = 0; iter < count; iter++) {
				if (random >= 0.00 + iter * bias && random < 0.00 + (iter + 1) * bias) {
					return currentUp.getServants5().get(iter);
				}
			}
		}
		return null;
	}
	
	private void getTen() {
		answer = new LinkedList<Item>();
		r = new Random();
		currentUp = new CurrentUp();
		for (int i = 0; i < 10; i++) {
			answer.add(getOne(i, 0));
			System.out.println(answer.get(i).getName());
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
