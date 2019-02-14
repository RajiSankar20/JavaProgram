import java.util.Scanner;
class Primeno{
public static void main(String[] abc){
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
for(int i=2;i<N;i++){
if(N%i==0)
System.out.println("not prime");
else
System.out.println("prime");
}
}
}
