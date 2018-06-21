package org.chapter01.sia.knights;
/**
 * 吟游诗人
 * @Title:Minstrel.java
 * @Package:org.chapter01.sia.knights
 * @Description:
 * @author:yangrong
 * @date:2018年6月22日上午2:12:23
 * @updater:
 * @version:V1.0
 * @updates:
 */

import java.io.PrintStream;

public class Minstrel {
	private PrintStream printStream;

	public Minstrel(PrintStream printStream) {
		this.printStream = printStream;
	}

	/**
	 * 探险之前调用
	 */
	public void singBeforeQuest() {
		printStream.println("Fa la la, the knight is so brave!");
	}

	/**
	 * 探险之后调用
	 */
	public void singAfterQuest() {
		printStream.println("Tee hee hee, the brave knight did embark on a quest!");
	}
}
