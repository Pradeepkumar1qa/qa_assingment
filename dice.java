import java.lang.Math;
import java.util.*;
class Dice{
	 int begin_value=0;
	 int end_value;
	 int range;
	 Dice(int end_value){
		 this.end_value=end_value;
		 this.range=end_value-begin_value;
	 }
	 
	 public int roll_dice(){
	    int random=(int)(Math.random()*range+begin_value)+1;
		return random;
	 }
	 
	 public String roll_dice(int flag){
		 int random=(int)(Math.random()*range+begin_value)+1;
		 String res=random==1?"head":"tail";
		 return res;
	 }
	 
	public static void main(String [] args){
		int option=1;
		int n=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("please input  the number of faces dice have");
		
		try{
			 n=sc.nextInt();
		}catch(Exception e){
			System.out.println("invalid input please provide me another input");
		         System.exit(0);
	   }
	   Dice d=new Dice(n);
	   if(n>2){
	   do{
		  
		  System.out.println(d.roll_dice()); 
		  System.out.println("----------------------------------------------------------------");
		   System.out.println("----------------------------------------------------------------");
		  System.out.println("press 1 to do more rolling of dice or any other number to exit");
		   
		  option=sc.nextInt();
		}while(option==1);
		}else{
			do{
		  
		  System.out.println(d.roll_dice(2)); 
		  System.out.println("----------------------------------------------------------------");
		  System.out.println("press 1 to do more rolling of dice or any other number to exit");
		  option=sc.nextInt();
		}while(option==1);

		}
		//System.out.println(d.roll_dice());
	      sc.close();
	}
	
}
