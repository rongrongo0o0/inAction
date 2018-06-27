package org.chapter02.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 启用组件扫描类
 * 
 * @Title:CDPlayerConfig.java
 * @Package:org.chapter02.soundsystem
 * @Description:
 * @author:yangrong
 * @date:2018年6月26日下午5:26:09
 * @updater:
 * @version:V1.0
 * @updates:
 */
@Configuration
// @ComponentScan()
// @ComponentScan("org.chapter02.soundsystem")
// @ComponentScan(basePackages = "org.chapter02.soundsystem")
// @ComponentScan(basePackages = { "org.chapter02.soundsystem" })
// @ComponentScan(basePackageClasses = CDPlayerConfig.class)
@ComponentScan(basePackageClasses = { CDPlayerConfig.class })
public class CDPlayerConfig {
	// @ComponentScan默认扫描与配置类相同的包
}
