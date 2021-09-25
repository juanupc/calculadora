import java.io.*;
import java.math.*;

public class calculadora {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double grados;
                long factorial=1;
		double num_1;
		double num_2;
		int op;
		double pi;
		double rad;
		double total;
		do {
			System.out.println(" 1/ Suma ");
			System.out.println(" 2/ Resta ");
			System.out.println(" 3/ Multiplicacion ");
			System.out.println(" 4/ Division ");
			System.out.println(" 5/ Potencia");
			System.out.println(" 6/ Raiz cuadrada");
			System.out.println(" 7/ Raiz cubica");
			System.out.println(" 8/ Seno");
			System.out.println(" 9/ Coseno");
			System.out.println(" 10/ Tangente");
			System.out.println(" 11/ Arcoseno");
			System.out.println(" 12/ Arcocoseno");
			System.out.println(" 13/ Arcotangente");
			System.out.println(" 14/ Logaritmo natural");
			System.out.println(" 15/ Convertir grados a radiandes");
			System.out.println(" 16/ Convertir radianes a grados");
			System.out.println(" 17/ Redondear numeros");
                        System.out.println(" 18/ factorial");
			System.out.println(" 19/ valor absoluto");
			System.out.println(" 20/ Cerrar ");
			System.out.print(" Seleccione una de la anteriores opciones ");
			op = Integer.parseInt(bufEntrada.readLine());
			switch (op) {
			case 1:
				System.out.print(" Escriba el primer valor de la suma ");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				System.out.print("  Escriba el segundo valor de la suma ");
				num_2 = Double.parseDouble(bufEntrada.readLine());
				total = num_1+num_2;
				System.out.println("  El valor total de la suma "+num_1+"+"+num_2+" es de "+total);
				break;
			case 2:
				System.out.print(" Escriba el primer valor de la resta ");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				System.out.print("  Escriba el segundo valor de la resta ");
				num_2 = Double.parseDouble(bufEntrada.readLine());
				total = num_1-num_2;
				System.out.println("  El valor total de la resta "+num_1+"-"+num_2+" es de "+total);
				break;
			case 3:
				System.out.print(" Escriba el primer valor de la multiplicacion ");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				System.out.print("  Escriba el segundo valor de la multiplicacion ");
				num_2 = Double.parseDouble(bufEntrada.readLine());
				total = num_1*num_2;
				System.out.println("  El valor total de la multiplicacion "+num_1+"x"+num_2+" es de "+total);
				break;
			case 4:
				System.out.print(" Escriba el primer valor de la division ");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				System.out.print("  Escriba el segundo valor de la division ");
				num_2 = Double.parseDouble(bufEntrada.readLine());
				if(num_2==0){
                                   System.out.println("no se puede dividir entre cero");
                                }
                                else{
				total = num_1/num_2;
				System.out.println("  El valor total de la division "+num_1+"/"+num_2+" es de "+total);
                                }
				break;
			case 5:
				System.out.print(" Escriba el numerador ");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				System.out.print(" Escriba el exponente ");
				num_2 = Double.parseDouble(bufEntrada.readLine());
				total = Math.pow(num_1,num_2);
				System.out.println(" El valor total de la potencia es "+total);
				break;
			case 6:
				System.out.print(" Ingrese el numero ");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				System.out.println(" La raiz cuadrada "+num_1+" Es "+Math.sqrt(num_1));
				break;
			case 7:
				System.out.print(" Ingrese el numero ");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				System.out.println(" La raiz cubica "+num_1+" Es "+Math.cbrt(num_1));
				break;
					
			case 8:	System.out.print(" Ingrese el numero ");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				System.out.println(" El seno de "+num_1+" Es "+Math.sin(num_1));
				break;
			case 9:
				System.out.print(" Ingrese el numero ");
				num_2 = Double.parseDouble(bufEntrada.readLine());
				System.out.println(" El coseno de "+num_2+" Es "+Math.cos(num_2));
				break;
			case 10:
				System.out.print(" Ingrese el valor se seno ");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				System.out.println(" La tangente de "+num_1+" Es "+Math.tan(num_1));
				break;
			case 11:
				System.out.print(" Ingrese el numero ");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				System.out.println(" El arcoseno de "+num_1+" Es "+Math.asin(num_1));
				break;
			case 12:
				System.out.print(" Ingrese el numero ");
				num_2 = Double.parseDouble(bufEntrada.readLine());
				System.out.println(" El arcocoseno de "+num_2+" Es "+Math.acos(num_2));
				break;
			case 13:
				System.out.print(" Ingrese el valor se seno ");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				System.out.println(" La arcotangente de "+num_1+" Es "+Math.atan(num_1));
				break;
			case 14:
				System.out.println("Ingresar el numero ");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				if (num_1>=0) {
					System.out.println("Logaritmo natural es "+Math.log(num_1));
				} else {
					System.out.println(" El numero debe ser mayor a cero ");
				}
				break;
			case 15:
				System.out.println("Ingrese los grados ");
				grados = Double.parseDouble(bufEntrada.readLine());
				rad = grados*(Math.PI/180);
				System.out.println("Los grados "+grados+" en radianes son "+rad);
				break;
			case 16:
				System.out.println("Ingrese los radianes");
				rad = Double.parseDouble(bufEntrada.readLine());
				grados = rad*(180/Math.PI);
				System.out.println("Los radianes "+rad+" en grados son "+grados);
				break;
			case 17:
				System.out.println("Ingrese el valor");
				num_1 = Double.parseDouble(bufEntrada.readLine());
				System.out.println("El numero aproximado es "+Math.round(num_1));
				break;
                        case 18:
                                System.out.println("Ingrese el valor");
                                num_1 = Double.parseDouble(bufEntrada.readLine());
                                for (int i = (int) num_1; i > 0; i--) {
                                    factorial = factorial * i;
                                }
                                System.out.println("El factorial de " + num_1 + " es: " + factorial);
                                break;
			case 19:
				System.out.println("Ingrese el numero ");
				num_2 = Double.parseDouble(bufEntrada.readLine());
				System.out.println("El valor absoluto es "+Math.abs(num_2));
				break;
                     
			case 20:
				System.out.println("Saliendo....");
				System.out.println(" Gracias por utilizar la calculadora ");
				break;
			default:
			}
		} while (op!=20);
	}

}
