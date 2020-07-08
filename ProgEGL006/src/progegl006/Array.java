
package progegl006;

public class Array {
    public static int separaParesImpares(int[] Arreglo)
    {
        int x;
        System.out.println("\nArray Ordenado:");
        for(x=0; x<20;x++)
        {
            if(Arreglo[x]%2==0)
            {
                System.out.print(+Arreglo[x]+", ");
            }
        }
        for(x=0; x<20;x++)
        {
            if(Arreglo[x]%2!=0)
            {
                System.out.print(+Arreglo[x]+", ");
            }
        }
        return 0;
    }
    
}
