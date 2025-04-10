package ejercicios;

public class StreetNumbers {
    public static int cuadratica(int n) {
        int sumIzq;
        int sumDer;

        for(int i=2;i<n;i++)
        {
            sumIzq=0;
            sumDer=0;
            for(int j=i-1;j>0;j--)
                sumIzq+=j;                
            for(int k=i+1;k<=n;k++)
                sumDer+=k;
            if(sumIzq ==sumDer)
                return i;
        }
        return -1;
    }
    
    public static int lineal(long n) {
    	long sumIzq;
    	long sumDer;
    	long sumTotal = n*(n+1)/2;

        for(int i=2;i<n;i++){
            sumIzq = (i-1)*(i)/2;
            sumDer = sumTotal-sumIzq-i;

            if(sumIzq==sumDer)
                return i;
        }
        return -1;
    }
    
    public static int constante(long n)
    {
    	double i = Math.sqrt(n*(n+1)/2);
    	int parteEntera = (int) i;
    	
    	System.out.println(n*(n+1)/2);
    	
    	if(i-parteEntera == 0)
    		return parteEntera;
    	else
    		return -1;
    }
    
    public static void main(String[] args) {
        int n = 57121;
        System.out.println(lineal(n)+","+n);
    }
}
