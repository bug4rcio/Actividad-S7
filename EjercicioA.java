/*
Elaborar un programa que permita ingresar
mediante un menú la información de un
empleado y sus salarios

• Opcion1: Se debe pedir el nombre y
apellidos del empleado (por separado) - LISTO

• Opción2: Se debe ingresar el sueldo - LISTO
mensual y validar que sea un salario válido - LISTO

• Opción 3: Elaborar el reporte ASCII (validar
que los datos del empleado y el salario hayan sido ingresados. - LISTO

- CONTRATO VIGENTE = BONUS | LISTO
- SIN CONTRATO = SIN BONUS | LISTO
*/

package EjercicioA;

import java.util.Scanner;

public class EjercicioA {

    public static void main(String[] args) {
        
        int opcion;
        boolean montoIncorrecto = true;
        double mensual = 0, total = 0, bonus = 0;
        double enero, febrero, marzo, abril, mayo, junio;
        double julio, agosto, septiembre, octubre, noviembre, diciembre;
        String nombre = null, apellido = null;
        String opcPago = null, opcContrato = null;
        String menMeses = null;
                
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("");
            System.out.println("##################################");
            System.out.println("#        MENÚ DE OPCIONES        #");
            System.out.println("##################################");
            System.out.println("# 1: Ingresar datos              #");
            System.out.println("# 2: Ingresar salario            #");
            System.out.println("# 3: Condición de contrato       #");
            System.out.println("# 4: Emitir boleta               #");
            System.out.println("# 5: Salir                       #");
            System.out.println("##################################");
            System.out.println("");
            
            System.out.println("Ingresar opción:");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1: 
                    System.out.println("Nombre del usuario:");
                    nombre = sc.next();
                    System.out.println("Apellido del usuario:");
                    apellido = sc.next();
                    break;
                    
                case 2:
                    System.out.println("¿El pago al usuario es fijo o variable?");
                    opcPago = sc.next();
                    switch(opcPago){
                        case "fijo":
                            do{
                                System.out.println("Ingresar pago mensual:");
                                mensual = sc.nextDouble();
                            
                                menMeses = ""
                                +"Enero: "+mensual+"             Julio: "+mensual
                                +"\nFebrero: "+mensual+"           Agosto: "+mensual
                                +"\nMarzo: "+mensual+"             Septiembre: "+mensual
                                +"\nAbril: "+mensual+"             Octubre: "+mensual
                                +"\nMayo: "+mensual+"              Noviembre: "+mensual
                                +"\nJunio: "+mensual+"             Diciembre: "+mensual
                                +"";
                                total = (mensual*12);
                                montoIncorrecto = (mensual <= 0);
                                if(montoIncorrecto){
                                System.out.println("Se ha ingresado un monto inválido.");
                                }
                            } while(montoIncorrecto);
                            break;
                            
                        case "variable":
                            do{
                            System.out.println("Ingresar pago de ENERO:");
                            enero = sc.nextDouble();
                            montoIncorrecto = (enero < 0);
                            if(montoIncorrecto){
                            System.out.println("Se ha ingresado un monto inválido.");
                            }
                        } while(montoIncorrecto);
                            
                        do{
                            System.out.println("Ingresar pago de FEBRERO:");
                            febrero = sc.nextDouble();
                            montoIncorrecto = (febrero < 0);
                            if(montoIncorrecto){
                            System.out.println("Se ha ingresado un monto inválido.");
                            }
                        } while(montoIncorrecto);
                            
                        do{
                            System.out.println("Ingresar pago de MARZO:");
                            marzo = sc.nextDouble();
                            montoIncorrecto = (marzo < 0);
                            if(montoIncorrecto){
                            System.out.println("Se ha ingresado un monto inválido.");
                            }
                        } while(montoIncorrecto);
                            
                        do{
                            System.out.println("Ingresar pago de ABRIL:");
                            abril = sc.nextDouble();
                            montoIncorrecto = (abril < 0);
                            if(montoIncorrecto){
                            System.out.println("Se ha ingresado un monto inválido.");
                            }
                        } while(montoIncorrecto);
                        
                        do{
                            System.out.println("Ingresar pago de MAYO:");
                            mayo = sc.nextDouble();
                            montoIncorrecto = (mayo < 0);
                            if(montoIncorrecto){
                            System.out.println("Se ha ingresado un monto inválido.");
                            }
                        } while(montoIncorrecto);
                        
                        do{
                            System.out.println("Ingresar pago de JUNIO:");
                            junio = sc.nextDouble();
                            montoIncorrecto = (junio < 0);
                            if(montoIncorrecto){
                            System.out.println("Se ha ingresado un monto inválido.");
                            }
                        } while(montoIncorrecto);
                        
                        do{
                            System.out.println("Ingresar pago de JULIO:");
                            julio = sc.nextDouble();
                            montoIncorrecto = (julio < 0);
                            if(montoIncorrecto){
                            System.out.println("Se ha ingresado un monto inválido.");
                            }
                        } while(montoIncorrecto);
                        
                        do{
                            System.out.println("Ingresar pago de AGOSTO:");
                            agosto = sc.nextDouble();
                            montoIncorrecto = (agosto < 0);
                            if(montoIncorrecto){
                            System.out.println("Se ha ingresado un monto inválido.");
                            }
                        } while(montoIncorrecto);
                        
                        do{
                            System.out.println("Ingresar pago de SEPTIEMBRE:");
                            septiembre = sc.nextDouble();
                            montoIncorrecto = (septiembre < 0);
                            if(montoIncorrecto){
                            System.out.println("Se ha ingresado un monto inválido.");
                            }
                        } while(montoIncorrecto);
                        
                        do{
                            System.out.println("Ingresar pago de OCTUBRE:");
                            octubre = sc.nextDouble();
                            montoIncorrecto = (octubre < 0);
                            if(montoIncorrecto){
                            System.out.println("Se ha ingresado un monto inválido.");
                            }
                        } while(montoIncorrecto);
                        
                        do{
                            System.out.println("Ingresar pago de NOVIEMBRE:");
                            noviembre = sc.nextDouble();
                            montoIncorrecto = (noviembre < 0);
                            if(montoIncorrecto){
                            System.out.println("Se ha ingresado un monto inválido.");
                            }
                        } while(montoIncorrecto);

                        do{
                            System.out.println("Ingresar pago de DICIEMBRE:");
                            diciembre = sc.nextDouble();
                            montoIncorrecto = (diciembre < 0);
                            if(montoIncorrecto){
                            System.out.println("Se ha ingresado un monto inválido.");
                            }
                        } while(montoIncorrecto);

                            menMeses = ""
                                +"Enero: "+enero+"             Julio: "+julio
                                +"\nFebrero: "+febrero+"           Agosto: "+agosto
                                +"\nMarzo: "+marzo+"             Septiembre: "+septiembre
                                +"\nAbril: "+abril+"             Octubre: "+octubre
                                +"\nMayo: "+mayo+"              Noviembre: "+noviembre
                                +"\nJunio: "+junio+"             Diciembre: "+diciembre
                                +"";
                            total = (enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+octubre+noviembre+diciembre);
                            break;
                        default: break;
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es la condición de su contrato?: (vigente/finalizado)");
                    opcContrato = sc.next();
                    switch(opcContrato){
                        case "vigente": bonus = 500;
                            total = total + bonus;
                            break;
                        case "finalizado": bonus = 50;
                            total = total + bonus;
                            break;
                        default: break;
                    }
                    break;
                    
                case 4:
                    System.out.println("");
                    System.out.println("##############################################");
                    System.out.println("#          *RESUMEN DE PAGOS ANUAL*          #");
                    System.out.println("##############################################");
                    System.out.println("Nombre: "+nombre);
                    System.out.println("Apellido: "+apellido);
                    System.out.println("##############################################");
                    System.out.println("Tipo de pago: "+opcPago);
                    System.out.println(""+menMeses);
                    System.out.println("##############################################");
                    System.out.println("Condición de contrato: "+opcContrato);
                    System.out.println("Bonus por contrato: S/"+bonus);
                    System.out.println("Total: S/"+total);
                    System.out.println("##############################################");
                    System.out.println("");
                    break;
                default: return;
            }
        } while(opcion != 5);
    }
}