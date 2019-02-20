import java.util.Scanner;
Class Simple{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int k=input.nextInt();
int[] arr=new int[n];
int i,sum=0;
for(i=1;i<=n;i++)
{
arr[i]=input.nextInt();
}
for(i=1;i<=k;i++)
{
sum=sum+arr[i];
}
System.out.println(sum);
}
}
