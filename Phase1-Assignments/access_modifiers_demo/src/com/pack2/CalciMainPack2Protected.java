package com.pack2;

import com.pack1.Calculator;

public class CalciMainPack2Protected extends Calculator {

	public static void main(String[] args) {

   CalciMainPack2Protected cp=new CalciMainPack2Protected();
   System.out.println("m="+cp.m);
   //System.out.println("z="+cp.z);
    cp.printX(); 
	}

}
