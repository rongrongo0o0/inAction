package org.chapter01.sia.knights.config;

import org.chapter01.sia.knights.BraveKnight;
import org.chapter01.sia.knights.Knight;
import org.chapter01.sia.knights.Quest;
import org.chapter01.sia.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * spring java support
 * 
 * @Title:KnightConfig.java
 * @Package:org.chapter01.sia.knights.config
 * @Description:@Configuration定义配置文件，@Bean定义实体
 * @author:yangrong
 * @date:2018年6月21日下午4:18:50
 * @updater:
 * @version:V1.0
 * @updates:
 */
@Configuration
public class KnightConfig {
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}

	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
}
