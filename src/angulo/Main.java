package angulo;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[] = new int[3];
		int y[] = new int[3];
		int i ;
		double angulo=0 , p=0;
		Scanner sc = new Scanner(System.in);
		
		
		for (i=0; i<3; i++)
			
		{
			System.out.println("Introzuca el valor de x");
			x[i] = sc.nextInt();
			
			System.out.println("Introduzca el valor de y");
			y[i] = sc.nextInt();
			
			
		}
		
		calculo s = new calculo();
		p =Math.acos( s.prodpunto(x, y) /( s.magnitud(x) * s.magnitud(y)));
		
		angulo = Math.toDegrees(p);
		
		System.out.println(angulo);
		

	}

}
