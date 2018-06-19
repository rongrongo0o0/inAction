package org.chapter01.sia.knights;

import java.io.PrintStream;

/**
 * 杀死巨龙的探险任务
 * 
 * @Title:SlayDragonQuest.java
 * @Package:org.chapter01.sia.knights
 * @Description:
 * @author:yangrong
 * @date:2018年6月19日下午6:01:20
 * @updater:
 * @version:V1.0
 * @updates:
 */
public class SlayDragonQuest implements Quest {
	private PrintStream stream;

	public SlayDragonQuest(PrintStream stream) {
		// TODO Auto-generated constructor stub
		this.stream = stream;
	}

	@Override
	public void embark() {
		// TODO Auto-generated method stub
		System.out.println("Embarking on quest to slay the dragon!");
	}

}
