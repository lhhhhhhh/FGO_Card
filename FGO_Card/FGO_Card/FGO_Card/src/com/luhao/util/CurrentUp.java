package com.luhao.util;

import java.util.LinkedList;
import java.util.List;

public class CurrentUp {
	List<Servant> upServants5, upServants4, upServants3;
	List<Servant> servants5, servants4, servants3;
	List<CraftEssence> upCraftEssences5, upCraftEssences4, upCraftEssences3;
	List<CraftEssence> craftEssences5, craftEssences4,craftEssences3;
	
	public CurrentUp() {
		upServants3 = new LinkedList<>();
//		upServants3.add(new Servant(1, ""));
		
		upServants4 = new LinkedList<>();
		upServants4.add(new Servant(2, "��»�����͵���˹"));
		
		upServants5 = new LinkedList<>();
		upServants5.add(new Servant(3, "��»�����"));
		
		upCraftEssences3 = new LinkedList<>();
		upCraftEssences3.add(new CraftEssence(4, "upcraft3"));
		
		upCraftEssences4 = new LinkedList<>();
		upCraftEssences4.add(new CraftEssence(5, "upcraft4"));
		
		upCraftEssences5 = new LinkedList<>();
		upCraftEssences5.add(new CraftEssence(6, "upcraft5"));
		
		servants3 = new LinkedList<>();
		servants3.add(new Servant(7, "�ޱ���"));
		servants3.add(new Servant(8, "������"));
		servants3.add(new Servant(9, "����ɯ"));
		servants3.add(new Servant(10, "������"));
		
		servants4 = new LinkedList<>();
		servants4.add(new Servant(11, "��˹����"));
		servants4.add(new Servant(12, "��ľͯ��"));
		servants4.add(new Servant(13, "������߯"));
		servants4.add(new Servant(14, "��˹�ж���"));
		
		servants5 = new LinkedList<>();
		servants5.add(new Servant(15, "����������"));
		servants5.add(new Servant(16, "���涼"));
		servants5.add(new Servant(17, "���׿�"));
		servants5.add(new Servant(18, "�ܿ�"));
		
		craftEssences3 = new LinkedList<>();
		craftEssences3.add(new CraftEssence(19, "craft3-1"));
		craftEssences3.add(new CraftEssence(20, "craft3-2"));
		craftEssences3.add(new CraftEssence(21, "craft3-3"));
		craftEssences3.add(new CraftEssence(22, "craft3-4"));
		
		craftEssences4 = new LinkedList<>();
		craftEssences4.add(new CraftEssence(23, "craft4-1"));
		craftEssences4.add(new CraftEssence(24, "craft4-2"));
		craftEssences4.add(new CraftEssence(25, "craft4-3"));
		craftEssences4.add(new CraftEssence(26, "craft4-4"));
		
		craftEssences5 = new LinkedList<>();
		craftEssences5.add(new CraftEssence(27, "craft5-1"));
		craftEssences5.add(new CraftEssence(28, "craft5-2"));
		craftEssences5.add(new CraftEssence(29, "craft5-3"));
		craftEssences5.add(new CraftEssence(30, "craft5-4"));
	}
	
	/**
	 * ��ѯ���ڿ���up��Ӣ�����װ������
	 * @param type ����  0ΪӢ�飬1Ϊ��װ
	 * @param rarity ϡ�ж�
	 * @param isUp �Ƿ�Ϊup 0Ϊ��up
	 * @return
	 */
	public int getCount(int type, int rarity, int isUp) {
		int count = 0;
		if (type == 0) {
			if (rarity == 3) {
				count = upServants3.size();
			} else if (rarity == 4) {
				count = upServants4.size();
			} else {
				count = upServants5.size();
			}
		} else {
			if (rarity == 3) {
				count = upCraftEssences3.size();
			} else if (rarity == 4) {
				count = upCraftEssences4.size();
			} else {
				count = upCraftEssences5.size();
			}
		}
		
		return count;
	}
	
	public List<Servant> getUpServants3() {
		return upServants3;
	}
	
	public List<Servant> getUpServants4() {
		return upServants4;
	}
	
	public List<Servant> getUpServants5() {
		return upServants5;
	}
	
	public List<Servant> getServants3() {
		return servants3;
	}
	
	public List<Servant> getServants4() {
		return servants4;
	}
	
	public List<Servant> getServants5() {
		return servants5;
	}
	
	public List<CraftEssence> getUpCraftEssences3() {
		return upCraftEssences3;
	}
	
	public List<CraftEssence> getUpCraftEssences4() {
		return upCraftEssences4;
	}
	
	public List<CraftEssence> getUpCraftEssences5() {
		return upCraftEssences5;
	}
	
	public List<CraftEssence> getCraftEssences3() {
		return craftEssences3;
	}
	
	public List<CraftEssence> getCraftEssences4() {
		return craftEssences4;
	}
	
	public List<CraftEssence> getCraftEssences5() {
		return craftEssences5;
	}
	
}
