

	import java.util.*;

	public class Guess // creating a class

	{

	public static void main(String args[]) // main method

	{

	Random rand = new Random(); // creating an object variable Random class.

	Scanner sc = new Scanner(System.in); // creating an object of scanner class.

	int num,i,unum,total=0,nt=0,j; // declaring variables.

	int n[] = new int[5]; // declaring array to store digits of the random number.

	int n1[] = new int[5]; // declaring array to store digits of user entered number.

	  

	int randomNum = rand.nextInt((99999) + 1) ; // generating the random number.

	num = randomNum; // assigning the value of random number to num.
	for(i=0; i<5;i++) // extracting digits.

	{

	n[i] = randomNum % 10;

	randomNum = randomNum / 10;

	}

	for(j=1; j <=10; j++)   // running for 10 times.

	{

	nt =0;

	total =0;

	System.out.println("Guess a number: ");

	unum = sc.nextInt();

	for(i=0; i<5;i++)   // extracting digits.

	{

	n1[i] = unum % 10;

	unum = unum / 10;

	}

	for(i=0;i<5;i++)

	{

	if(n[i] == n1[i])

	{

	nt++;

	total = total + n[i];

	}

	}

	if(nt == 5)

	{

	System.out.println("The guess is correct!!!");

	System.exit(0);

	}

	else

	System.out.println(" " + nt + " " + total);

	}

	}

	}

