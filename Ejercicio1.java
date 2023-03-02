
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numeroA = 5;
int numeroB = 14;
boolean var=true;

while (numeroA <= numeroB) {
	if(numeroA%2==0 && var==true){
	System.out.print(numeroA + " ");}
	else		
	if(numeroA%2!=0 && var==false) {	
		System.out.print(numeroA + " ");
	}numeroA++;
	}

numeroA=5;	
for(int i=numeroB;i>numeroA;i--) {
	 if(i%2==0) {
		 System.out.print(" "+i+ "," );	 }
	}}
}