import java.util.*;
public class lab_1 {
	public static void main(String[] args){
		int[] score = new int[50];
		for(int i=0;i<50;i++)
			score[i] = random();
		display(score);
	}

	public static int random(){
		Random rand = new Random();
		int randomNumber = rand.nextInt(100)+0); 
		return randomNumber;
	}

	public static void display(int[] score){
		for(int i=0;i<50;i++){
			if(score[i] <= 100 && score[i] >= 80)
				System.out.println("Student " + (i+1) + " = A" );
			else if(score[i] < 80 && score[i] >= 70)
				System.out.println("Student " + (i+1) + " = B" );
			else if(score[i] < 70 && score[i] >= 60)
				System.out.println("Student " + (i+1) + " = C" );
			else if(score[i] < 60 && score[i] >= 50)
				System.out.println("Student " + (i+1) + " = D" );
			else if(score[i] < 50 && score[i] >= 0)
				System.out.println("Student " + (i+1) + " = F" );
		}
	}
}