import java.util.Scanner;
Class Simple{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
int number=input.nextInt();
System.out.println("enter the integer");
if(number>0)
System.out.println("Positive");
else if(number<0)
System.out.println("Negative");
else
System.out.println("Zero");
}
}
