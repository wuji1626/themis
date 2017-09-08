package com.wuji1626.themis.variable;

public class PrimitiveTypeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in;
		
		in = 65;
		System.out.println("一般数值 = " + in);
		
		in = 'A';
		System.out.println("英文字母运行结果 = " + in);
		
		in = '中';
		System.out.println("汉字字符运行结果 = " + in);
		
		in = '\u4E2D';
		System.out.println("Unicode运行结果 = " + in);
		
		in = 047055;
		System.out.println("八进制运行结果 = " + in);
		
		in = 0x4E2D;
		System.out.println("十六进制运行结果 = " + in);
		
		in = '\0';
		System.out.println("特殊字符运行结果 = " + in);
		
	}

}


