import java.util.Scanner;
class NaturalNumbers{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a no");
int N=scan.nextInt();
int sum=0,i=1;
while(i<=N){
sum=sum+i;
i++;
}
System.out.println("OUTPUT"+sum);
}
}