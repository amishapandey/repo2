import java.util.Scanner;
class Simple{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
int y=input.nextInt();
int c=0;
while(y!=0){
y=y/10;
c+=1;
}
System.out.println(c);
}
}
