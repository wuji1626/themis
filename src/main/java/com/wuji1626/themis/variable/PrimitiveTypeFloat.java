package com.wuji1626.themis.variable;

public class PrimitiveTypeFloat {
    
    	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float ft;
		double dft;
		
		ft = 120.5f;
		System.out.println("float指定值 = " + ft);
		
		ft = 12050E-2f;
		System.out.println("科学计数法float指定值，方法1 = " + ft);

		ft = 1.205E2f;
		System.out.println("科学计数法double指定值，方法2 = " + ft);
		
		dft = 120.5;
		System.out.println("double指定值 = " + dft);
		
		dft = 1.205E2;
		System.out.println("科学计数法double指定值，方法1 = " + dft);
		
		dft = 12050E-2;
		System.out.println("科学计数法double指定值，方法2 = " + dft);
	}

    
}
