package org.chapter02.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 自动装配测试类
 * 
 * @Title:CDPlayerTest2.java
 * @Package:org.chapter02.soundsystem
 * @Description:
 * @author:yangrong
 * @date:2018年6月27日下午7:35:15
 * @updater:
 * @version:V1.0
 * @updates:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest2 {
	/**
	 * 该规则在控制台输出信息
	 */
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();

	@Autowired
	private CompactDisc cd;
	@Autowired
	private MediaPlayer player;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}

	@Test
	public void play() {
		player.play();
		assertNotNull(log.getLog());
	}
}
