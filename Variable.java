
package fundamentosabel;
// variables o metodos de clases son static
// variables o metodos de instancias no son static
// Para acceder a un metodo o variable static es:NombreClase.Metodo
// o NombreClase.Variable
 class CuentaBancaria {
 public int saldo;
public static int numero=0;
}
  public class Variable{

    
    public static void SumarSaldo(CuentaBancaria ct1){
        ct1.saldo+=10;
    }
    public static void SumarSaldo( int saldo){
        saldo+=10;
    }
            
     // crear 10 objetos de cuenta bancaria
    // y pilas probar,probar,probar....
    public static void main(String[] args) {
        System.out.println("=====PRUEBAS DE INSTANCIAS========");
       CuentaBancaria ct1=new CuentaBancaria();// objeto1
        CuentaBancaria ct2=ct1;
        ct1.saldo=1000;
        SumarSaldo(ct1);
        SumarSaldo(ct2);
        System.out.println(ct1.saldo);// imprime 1020
        System.out.println(ct2.saldo);// imprime 1020
        ct2=new CuentaBancaria();// objeto2
        System.out.println("ct2:"+ct2.saldo);//imprime 0
        CuentaBancaria ct3=ct2;
        ct3=new CuentaBancaria();//objeto3
        SumarSaldo(ct2);
        System.out.println(+ct2.saldo);// imprime 10
        SumarSaldo(ct3);
        System.out.println(+ct3.saldo);// imprime 10
        ct3.saldo=2000;
        SumarSaldo(ct2);//se acumulan estos valores
        SumarSaldo(ct3);
        SumarSaldo(ct3);
        SumarSaldo(ct2);//se acumulan estos valores
        System.out.println(+ct2.saldo);//imprime 30
        System.out.println(+ct3.saldo);// imprime 2020
        SumarSaldo(ct1);
        System.out.println(+ct1.saldo);// imprime 1030
        CuentaBancaria ct4=new CuentaBancaria();//objeto4
        System.out.println(+ct4.saldo);
        CuentaBancaria ct5=ct4;
        SumarSaldo(ct4);
        System.out.println(+ct4.saldo);//imprime 10
        System.out.println(+ct5.saldo);//imprime 10
        CuentaBancaria ct6=new CuentaBancaria();//objeto5
        System.out.println(+ct6.saldo);//imprime 0
        CuentaBancaria ct7=ct6;// puntos de referencia que te envian valor de 0 al metodo.
        SumarSaldo(ct7);//acumula 10
        SumarSaldo(ct6);// acumula 10
        System.out.println(+ct6.saldo);//imprime 20
        System.out.println(+ct7.saldo);//imprime 20
        SumarSaldo(ct3);
        SumarSaldo(ct5);
        SumarSaldo(ct5);
        System.out.println(+ct3.saldo);//imprime 2030
        System.out.println(+ct5.saldo);//imprime 30
        CuentaBancaria ct8=new CuentaBancaria();//objeto6
        ct8.saldo=3000;
        SumarSaldo(ct3);
        SumarSaldo(ct8);
        SumarSaldo(ct5);
        System.out.println(+ct3.saldo);//imprime 2040
        System.out.println(+ct8.saldo+ct5.saldo);//imprime 3050
        CuentaBancaria ct9=new CuentaBancaria();//objeto7
        ct9.saldo=4000;
        SumarSaldo(ct2);
        SumarSaldo(ct3);
        SumarSaldo(ct7);
        System.out.println(+ct3.saldo+ct2.saldo);//imprime 2090
        System.out.println(+ct7.saldo+ct9.saldo);//imprime 4030
        CuentaBancaria ct10=new CuentaBancaria();//objeto8
        CuentaBancaria ct11=ct10;
        ct10.saldo=250;//envia por referencia el valor a la variable saldo. 
        SumarSaldo(ct10);
        SumarSaldo(ct11);
        System.out.println(+ct11.saldo);//imprime 270
        System.out.println(+ct10.saldo);//imprime 270
         CuentaBancaria ct12=new CuentaBancaria();//objeto9
         CuentaBancaria ct13=ct12;
         //como "no" pasamos referencia "SumarSaldo(ct12)" nos imprime 0
        System.out.println(+ct12.saldo);//imprime 0
        System.out.println(+ct13.saldo);//imprime 0
        ct13=new CuentaBancaria();//objeto10
        ct13.saldo=-25;//PROBANDO CON NUMEROS NEGATIVOS PILASS PROFE!!!
        System.out.println(+ct13.saldo);//imprime -25
        SumarSaldo(ct13);
        System.out.println(+ct13.saldo);//imprime -15
        SumarSaldo(ct13);
        SumarSaldo(ct7);
        SumarSaldo(ct7);
        SumarSaldo(ct10);
        SumarSaldo(ct5);
        SumarSaldo(ct3);
        System.out.println(+ct13.saldo+ct7.saldo);//imprime 45
        System.out.println(+ct10.saldo+ct5.saldo+ct3.saldo);//imprime 2390
        
    }
    
}
