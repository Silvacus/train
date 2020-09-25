public class emp{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
int hrs=0;
int wage=0;
int attend =(int)Math.floor(Math.random()*10)%3;
if(attend==1){ hrs=8;}
else if(attend==2)hrs=4;

else System.out.println("Emp is absent");
wage=hrs*20;
System.out.println("Emp Wage: "+wage);}}
