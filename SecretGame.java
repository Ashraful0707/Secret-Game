    


  
import java.util.Random;
import java.util.Scanner;
public class SecretGame {
	

	private static int getRandomNumber(int min, int max) {

	       Random r = new Random();
	       return r.nextInt((max - min) + 1) + min;
	   }
	  
	   public static void main(String[] args){
		   int sum=0;int count =0;
	       int randomDigit[] = new int [5];
	       
	      int guessDigit[]= new int[5]; 
	       Scanner sc = new Scanner(System.in);
	   
	           for(int i=0;i<5;i++)
	           {
	               randomDigit[i] = getRandomNumber(0,9);
	           }
	           for(int i=0;i<10;i++)
	           {
	           System.out.println("Enter a guess digit and provide space between each number");
	          i++;
	           {
	               guessDigit[i] = sc.nextInt();
	           }
	           
	           
	               if(guessDigit[i]==randomDigit[i])
	               {
	                   sum = sum + guessDigit[i];
	                   count ++;
	               }
	           
	           System.out.println("Number of matched digits "+count);
	           System.out.println("the sum is "+sum);
	           }
	          
	          
	   }
	}

