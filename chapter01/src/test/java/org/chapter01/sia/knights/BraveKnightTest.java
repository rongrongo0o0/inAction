package org.chapter01.sia.knights;

import static org.mockito.Mockito.*;
import org.junit.Test;

/**
 * 勇敢的骑士测试类
 * 
 * @Title:BraveKnightTest.java
 * @Package:org.chapter01.sia.knights
 * @Description:
 * @author:yangrong
 * @date:2018年6月19日下午4:22:30
 * @updater:
 * @version:V1.0
 * @updates:
 */
public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();// 验证embark()调用了一次
	}

	@Test
	public void BraveKnightMinstrelTest() {
		Quest quest = mock(Quest.class);
		BraveKnightMinstrel knightMinstrel = new BraveKnightMinstrel(quest, new Minstrel(System.out));
		knightMinstrel.embarkOnQuest();
		verify(quest, times(1)).embark();
	}
}
