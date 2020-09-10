package com.java.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

public class Study1 {
	public static void main(String[] args) throws Exception {
		TestRuntime();
		PrintParams("我","是","一个","可变参数，","我","只能","有一个");
	}

	/*
	 * 测试输入
	 */
	public static void TestScanner() {
		System.out.println("-------------------请在下边输入内容----------------------");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			System.out.println("输入的内容是：" + sc.next());
		}
	}

	/*
	 * 测试输出指定文件的内容
	 */
	public static void TestScannerFile() {
		try {
			Scanner sc = new Scanner(new File("C:\\MyWork\\Project\\JavaStudy\\JavaProject\\src\\MyHello.java"));
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 测试系统类
	 */
	public static void TestSystem() throws Exception {
		Map<String, String> evn = System.getenv();
		for (String name : evn.keySet()) {
			// System.out.println(name + "------->" + evn.get(name));
		}
		System.out.println("JAVA-HOME是：" + evn.get("JAVA_HOME"));// 获取指定环境变量
		Properties pt = System.getProperties();
		pt.store(new FileOutputStream("prop.txt"), "System.Properties");
		System.out.println(pt.getProperty("os.name"));

	}

	public static void TestRuntime() throws Exception {
		Runtime rt = Runtime.getRuntime();
		pl("处理器数：" + rt.availableProcessors());
		pl("最大内存：" + (rt.maxMemory() / 1024));
		pl("空闲内存：" + (rt.freeMemory() / 1024));
		pl("即将打开notepad.exe");
		// rt.exec("C:\\Program Files\\Microsoft Office\\root\\Office16\\ONENOTE.exe");
		Object obj = rt.getClass();
		pl(obj.toString());
	}

	public static void pl(String str) {
		System.out.println(str);
	}
	public static void PrintParams(String... myParams)
	{
		for (String string : myParams) {
			System.out.println(string+"");
			
		}
	}

}
