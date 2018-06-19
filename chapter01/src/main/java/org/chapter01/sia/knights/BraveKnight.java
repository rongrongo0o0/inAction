package org.chapter01.sia.knights;

/**
 * 勇敢的骑士（没有特定的任务）
 * 
 * @Title:BraveKnight.java
 * @Package:org.chapter01.sia.knights
 * @Description:
 * @author:yangrong
 * @date:2018年6月19日下午4:15:26
 * @updater:
 * @version:V1.0
 * @updates:
 */
public class BraveKnight implements Knight {
	private Quest quest;

	/**
	 * 构造器注入
	 * 
	 * @param quest
	 */
	public BraveKnight(Quest quest) {
		// TODO Auto-generated constructor stub
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		quest.embark();
	}

}
