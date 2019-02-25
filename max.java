import java.util.*;
class Simple{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,max=0;
int ar[]=new int[n];
for(i=0;i<n;i++){
ar[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
if(max<ar[i]){
max=ar[i];
}
else
max=max;
}
System.out.println(max);
}
}
