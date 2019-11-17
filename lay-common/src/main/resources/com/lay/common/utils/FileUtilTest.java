package com.bobo.common.utils;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		
		System.out.println(new Integer(9).byteValue());
		for (int i = 0; i <100; i++) {
			System.out.println(Math.random());
		}
	
		String fileName="1706d.doc";
		
		String name = FileUtil.getExtendName(fileName);
		System.out.println(name);
		
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}

}
