package angulo;

public class calculo {
	
	int prodpunto(int x[] , int y[])
	{
		int r[] = new int[3];
		int c=0,i;
		
		for(i=0; i<3;i++)
		{
			r[i] = x[i] * y[i];
			
		}
		
		for(i=0; i<3; i++)
		{
			c += r[i];
		}
		
		return c;
		
	}
	
	double magnitud (int x[])
	{
		int i;
		double c=0 , r;
		
		for (i=0; i<3;i++)
		{
			c += Math.pow(x[i], 2);
		}
		
		r = Math.sqrt(c);
		
		return r;
		
		
	}
	

}
