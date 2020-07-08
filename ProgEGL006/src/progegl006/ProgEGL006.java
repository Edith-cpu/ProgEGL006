package progegl006;
public class ProgEGL006 {
    public static void main(String[] args) {
        int [] Arreglo= new int [20];
        int x;
        System.out.println("Array inicial generado con numeros aleatorios:");
        for(x=0; x<20; x++)
        {
            Arreglo[x]=(int) (Math.random()*100+1);
            System.out.print(+Arreglo[x]+", ");
        }
        Array EnviarArreglo= new Array();
        EnviarArreglo.separaParesImpares(Arreglo);
    }
}
