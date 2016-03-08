import javax.swing.JOptionPane;
import java.util.*;
public class lab_2{
	static String num;
	static String arr[][];
	public static void main(String[] args) {

		for(;;){
			String input = JOptionPane.showInputDialog("********Employee Menu**********\n 1. Input Num of Employee \n 2. Input Data\n 3. Show Data \n Enter Menu (Exit Press 0 ) : ");
			switch(input){
				case "1" : 
					inputNum();
					break;
				case "2" :
					inputData();
					break;
				case "3" :
					showData();
					break;
				case "0" :
					System.exit(0);
				default : 
					JOptionPane.showMessageDialog ( null, "please input again" );
			}
		}
	}
	public static void inputNum(){
		num = JOptionPane.showInputDialog("Enter num of Employee");
		arr = new String[Integer.parseInt(num)][3];
	}

	public static void inputData(){
		for(int i=0;i<Integer.parseInt(num);i++){
			arr[i][0] = JOptionPane.showInputDialog("Enter name of empl "+(i+1)+" : ");
			arr[i][1] = JOptionPane.showInputDialog("Enter salary of empl "+(i+1)+" : ");
			arr[i][2] = JOptionPane.showInputDialog("Enter year of empl "+(i+1)+": ");
		}
	}

	public static void showData(){
		String display = "";
		for(int i=0;i<Integer.parseInt(num);i++){
			if(Integer.parseInt(arr[i][2]) >=1 && Integer.parseInt(arr[i][2]) <=5)
				display += arr[i][0] +" get salary is " +  (Integer.parseInt(arr[i][1])+((Integer.parseInt(arr[i][1])*10)/100))+"\n";
			else if(Integer.parseInt(arr[i][2]) >5 && Integer.parseInt(arr[i][2]) <=10)
				display += arr[i][0] +" get salary is " +  (Integer.parseInt(arr[i][1])+((Integer.parseInt(arr[i][1])*20)/100))+"\n";
			else if(Integer.parseInt(arr[i][2]) >10)
				display += arr[i][0] +" get salary is " +  (Integer.parseInt(arr[i][1])+((Integer.parseInt(arr[i][1])*30)/100))+"\n";
		}
		JOptionPane.showMessageDialog(null,"Result of "+num+" Employee\n" + display);
	}
}
