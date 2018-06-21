package org.chapter01.sia.knights;

/**
 * 搭配吟游诗人的勇敢骑士
 * 
 * @Title:BraveKnightMinstrel.java
 * @Package:org.chapter01.sia.knights
 * @Description:
 * @author:yangrong
 * @date:2018年6月22日上午2:26:18
 * @updater:
 * @version:V1.0
 * @updates:
 */
public class BraveKnightMinstrel implements Knight {
	private Quest quest;
	private Minstrel minstrel;

	public BraveKnightMinstrel(Quest quest, Minstrel minstrel) {
		this.quest = quest;
		this.minstrel = minstrel;
	}

	@Override
	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		// 这里勇敢骑士自己管理自己的吟游诗人
		minstrel.singBeforeQuest();
		quest.embark();
		minstrel.singAfterQuest();
	}

}
