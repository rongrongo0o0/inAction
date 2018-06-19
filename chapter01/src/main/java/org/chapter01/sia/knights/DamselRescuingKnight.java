package org.chapter01.sia.knights;

/**
 * 搜救少女的骑士
 * 
 * @Title:DamselRescuingKnight.java
 * @Package:org.chapter01.sia.knights
 * @Description:
 * @author:yangrong
 * @date:2018年6月19日下午4:10:11
 * @updater:
 * @version:V1.0
 * @updates:
 */
public class DamselRescuingKnight implements Knight {
	private RescueDamselQuest quest;

	public DamselRescuingKnight() {
		// TODO Auto-generated constructor stub
		this.quest = new RescueDamselQuest();
	}

	@Override
	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		quest.embark();
	}

}
