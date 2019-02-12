import java.util.Scanner;
class CheckDigit{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("enter value for N");
int N=scan.nextInt();
int count=0;
while(N!=0){
N=N/10;
count++;
}
System.out.println("OUTPUT"+count);
}
}