import java.util.Scanner;
Class Simple{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int p=input.nextInt();
int q=input.nextInt();
int max;
if(n>p && n>q){
max=n;
}
else if(p>n && p>q){
max=p;
}
else{
max=q;
}
System.out.println(max);
}
}
