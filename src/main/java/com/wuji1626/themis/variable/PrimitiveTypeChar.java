package com.wuji1626.themis.variable;

public class PrimitiveTypeChar {
    
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		
		ch = 'A';
		System.out.println("英文字母 = " + ch);
		
		ch = '\u0041';
		System.out.println("Unicode码 = " + ch);
		
		ch = 65;
		System.out.println("ASCII十进制码 = " + ch);
		
		ch = '中';
		System.out.println("汉字字符 = " + ch);
		
		ch = '\u4E2D';
		System.out.println("中文Unicode码 = " + ch);
		
		ch = 20013;
		System.out.println("中文十进制码 = " + ch);
		
		ch = '\0';
		System.out.println("特殊字符的空字符 = " + ch);
	}
    
}
