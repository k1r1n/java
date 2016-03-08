import java.util.Scanner;
public class lab_3{
  static int num;
  static int data[][] ;
  static int total[];
  static int max = 0;
  static int min =999;
  static int student=0;
  static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
    for(;;){
  		System.out.println("******** R&E Menu ********");
      System.out.println("1. Input num of the student");
      System.out.println("2. Input R&E of all student");
      System.out.println("3. Show data");
      System.out.println("4. Show max and min total");
      System.out.println("5. Exit program");
      System.out.print("Enter Menu : ");
      int menu = scan.nextInt();
      //scan.nextLine(); //ใช้สำหรับรับค่าเป็น String
      //scan.nextInt(); //ใช้สำหรับรับค่าเป็น interger
      //scan.nextFloat(); //ใช้สำหรับรับค่าเป็น float
      //scan.nextDouble(); //ใช้สำหรับรับค่าเป็น double
      //scan.nextLong(); //ใช้สำหรับรับค่าเป็น long
      switch(menu){
        case 1 :
          InputNum();
          break;
        case 2 :
          InputRE();
          break;
        case 3 :
          ShowData();
          break;
        case 4 :
          ShowMN();
          break;
        case 5 :
          System.out.println("Bye Bye !!!");
          System.exit(0);
          break;
        default : 
          System.out.println("please ty agian");
      }
    }
	}

  public static void InputNum(){
    System.out.print("Enter num of the student : ");
    num = scan.nextInt();
    data = new int[num][2];
    total = new int[num];
  }
  public static void InputRE(){
    for(int i=0;i<num;i++){
      System.out.println(">> Student" +(i+1));
      System.out.print("Enter R : ");
      data[i][0] = scan.nextInt();
      System.out.print("Enter E : ");
      data[i][1] = scan.nextInt();
    }
  }
  public static void ShowData(){
    System.out.println("Student\t\tRevenue\t\tExpenditure\t\tTotal");
    for(int i=0;i<num;i++){
      total[i] = data[i][0]-data[i][1];
      System.out.println(i+1+"\t\t"+data[i][0]+"\t\t"+data[i][1]+"\t\t\t"+total[i]);
    }
  }
  public static void ShowMN(){
    for(int i = 0; i < total.length; i++) { 
      if(total[i] > max) {
         max = total[i];
         student = i+1;
      }
    }
    System.out.println("Max total is Student " + student + " is " + max + " Bath.");
    for(int i = 0; i < total.length; i++) {
      if(total[i] < min) {
         min = total[i];
         student = i+1;
      }
    }
    System.out.println("Max total is Student " + student + " is " + min + " Bath.");
  }
}