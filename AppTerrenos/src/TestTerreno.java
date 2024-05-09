
import java.util.Scanner;

public class TestTerreno {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Terreno arrayTerrenos[] = new Terreno[2];
        int i = 0;
        String opc;
        while (true) {
            System.out.print("Dame alto,ancho y vmc");
            arrayTerrenos[i] = new Terreno(tc.nextDouble(), tc.nextDouble(), tc.nextDouble());
            i++;
            System.out.print("Desee mas terrenos (S/N)");
            opc = tc.next();
            if (opc.equals("N") || (i >= arrayTerrenos.length)) {
                break;
            }
            System.out.println("Los terrenos ingresados y calculados son:");
            for (Terreno terr:arrayTerrenos) {
                terr.calcularArea();
                terr.calcularCostoFinal();
                System.out.println(terr);
            }
        }
    }
}

/*
Terreno t1 = new Terreno(40, 10, 2);
        Terreno t2 = new Terreno(21, 12, 2);
        Terreno t3 = new Terreno(10, 10, 2);
        t1.calcularArea();
        t1.calcularCostoFinal();
        System.out.println(t1);
        t2.calcularArea();
        t2.calcularCostoFinal();
        System.out.println(t2);
        t3.calcularArea();
        t3.calcularCostoFinal();
        System.out.println(t3);

Terreno t1 = new Terreno(40, 10, 2);
        Terreno t2 = new Terreno(21, 12, 2);
        Terreno t3 = new Terreno(10, 10, 2);
        /*t1.calcularArea();
        t1.calcularCostoFinal();
        System.out.println(t1);
        t2.calcularArea();
        t2.calcularCostoFinal();
        System.out.println(t2);
        t3.calcularArea();
        t3.calcularCostoFinal();
        System.out.println(t3);
        // Terreno arrayTerreno[]= [null,null,null,null,,null];
        Terreno arrayTerreno[]= new Terreno[3];
        arrayTerreno[0]=t1;
        arrayTerreno[1]=t2;
        arrayTerreno[2]=t3;
        for (Terreno terreno:  arrayTerreno) {
            terreno.calcularArea();
            terreno.calcularCostoFinal();
            System.out.println(terreno);
        }
    }
}
Terreno arrayTerrenos[] =  {new Terreno(10,3,2),
                                    new Terreno(20,10,1),
                                    new Terreno(40,10,2)};
        for (Terreno terreno:  arrayTerrenos) {
            terreno.calcularArea();
            terreno.calcularCostoFinal();
            System.out.println(terreno);
 */
