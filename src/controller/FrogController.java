package controller;

import java.util.Random;

public class FrogController extends Thread{

	private int maxJump;
	public int maxDistance;
	private int numberOfJumps;
	private int distance;
	private int jump;
	public static int position;
	
	public FrogController(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	@Override
	public void run() {
		maxJump = setMaxJump();
		
		long id = getId();
		
		while(distance < maxDistance) {
			
			jump(maxJump);	
			
		}
		
		position += 1;
		
		System.out.println("====== Sapo #" + id + " terminou a corrida em " + position + " ======");
	}
	
	public int setMaxJump() {
		Random random = new Random();
		
		return random.nextInt(maxDistance) + 1;
	}
	
	public int setJump() {
		Random random = new Random();
		int jump = random.nextInt(maxJump) + 1;
		return jump;
	}
	
	
	public void jump(int maxJump) {
		
		long id = getId();
		
			jump = setJump();
			distance = jump + distance;
			System.out.println("Sapo #" + id +  " saltou " + jump + "m e percorreu: " + distance + "m");
	
	}
}
