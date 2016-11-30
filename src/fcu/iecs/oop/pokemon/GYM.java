package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	public static void fight(Pokemon p1,Pokemon p2){
		int win;
		Random k=new Random();
		win=k.nextInt(2);
		
		
		if(win==1){
			p1.setCp(p1.getCp()+500);
			
			System.out.println("Winner is ["+p1.getName()+"].");
		}
		else if(win==0){
			p2.setCp(p2.getCp()+500);
			
			System.out.println("Winner is ["+p2.getName()+"].");
		}
	}

}
