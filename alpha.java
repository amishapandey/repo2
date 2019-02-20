import java.util.Scanner;
Class Simple{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
char n=input.next().charAt(0);
if(n<='a' && n>='z' || n<='A'&& n>='Z')
System.out.println("Alphabet");
else
System.out.println("No");
}
}
