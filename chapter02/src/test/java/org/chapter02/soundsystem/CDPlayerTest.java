package org.chapter02.soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 注解加载bean测试类
 * 
 * @Title:CDPlayerConfig.java
 * @Package:org.chapter02.soundsystem
 * @Description:
 * @author:yangrong
 * @date:2018年6月26日下午6:09:56
 * @updater:
 * @version:V1.0
 * @updates:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	@Autowired
	private CompactDisc cd;// 注入接口类，会代理注入实体类

	@Test
	public void cdshouldNotBeNull() {
		assertNotNull(cd);
	}
}
