package java1;
import java.util.Arrays;
import java.util.Scanner;

public class en {

	private static String result="";
   public void Cal(int x){
	  // Scanner input =new Scanner(System.in);
	  
	//   while(true){
	 //  int x=0;
	   System.out.println("ÇëÊäÈëÊý×Ö£º"+x);
	   
	 //  x=input.nextInt();
	   
	   if(x>83||x<0)
	   { 
		   result="NO!";   
	   }
	   if(x/10==5||x/10==2||x/10==0||x/10==7)
	   {  if(x%10==4||x%10==9)
		  { result="NO!";  }
		  else{
			  result="YES!"; 
		  }			 
	   }else if(x/10==0||x/10==1||x/10==3||x/10==6||x/10==8)
	   {
		   if(x%10==0||x%10==1||x%10==2||x%10==3)
			  { result="YES!";  }
		   else{
			   result="NO!"; 
			  }	
	   }   
   // }
	   //input.close();	
   }
   
   public String getResult(){
	   System.out.println(result);
	   return result;
   }
}
