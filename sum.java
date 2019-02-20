import java.util.Scanner;
Class Simple{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int i,sum=0;
for(i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
