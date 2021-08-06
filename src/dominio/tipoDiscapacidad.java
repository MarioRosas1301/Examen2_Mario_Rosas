
package dominio;

public class tipoDiscapacidad extends InterfacePension implements Tipo_Jubilado{
     @Override
     public int metodoCalculaPension() {
       if(0<get.anios_aporte()<11){
           pension_inicial = get.salario_base()*0.5+get.salario_base()*0.25;
           System.out.println("La pension coorespondiente es: "+pension_inicial);
       }
       
       if(10<get.anios_aporte()<21){
           pension_inicial = get.salario_base()*0.6+get.salario_base()*0.25;
           System.out.println("La pension coorespondiente es: "+pension_inicial);
       }
       
        if(20<get.anios_aporte()<31){
           pension_inicial = get.salario_base()*0.7+get.salario_base()*0.25;
           System.out.println("La pension coorespondiente es: "+pension_inicial);
       }
        
        if(30<get.anios_aporte()<36){
           pension_inicial = get.salario_base()*0.8+get.salario_base()*0.25;
           System.out.println("La pension coorespondiente es: "+pension_inicial);
       }
        
        if(35<get.anios_aporte()<40){
           pension_inicial = get.salario_base()*0.9+get.salario_base()*0.25;
           System.out.println("La pension coorespondiente es: "+pension_inicial);
       }
        
        if(39<get.anios_aporte()){
           pension_inicial = get.salario_base()+get.salario_base()*0.25;
           System.out.println("La pension coorespondiente es: "+pension_inicial);
       }
         return 0;
     }
}
