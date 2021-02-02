package lll;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Esta aplicacion genera un horario para un alumno o para un profesor
 * @author rober
 *
 */
public class lol {
	
	
	static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		int coso;
		System.out.println("Bien venido al generador de horarios ¿Cualquieres?");
do {
	
	System.out.println("1:Alumno, 2:Profesor, 3:salir");
	 coso = key.nextInt();
	 if(coso==1) {
		 alumno();
	 }else if(coso==2) {
		 profesor();
		 }
}while(coso !=3);
        
		
	}
	/**
	 * Este metodo crea el horario para el alumno,
	 * Reparte las asinaturas en la semana
	 */
	public static void alumno(){
		ArrayList<String> asinaturas = new ArrayList<String>();
		asinaturas.add("dpl");
		asinaturas.add("dsw");
		asinaturas.add("dew");
		asinaturas.add("dor");
		asinaturas.add("emr");
		ArrayList<String> calendario = new ArrayList<String>();
		ArrayList<String> asinaturasHoras = new ArrayList<String>();
		asinaturasHoras.add("6");
		asinaturasHoras.add("8");
		asinaturasHoras.add("7");
		asinaturasHoras.add("6");
		asinaturasHoras.add("3");
		
		do {
			
			int  asinatura= (int)(Math.random() * (asinaturas.size()));
			int  horas;
			if(Integer.parseInt(asinaturasHoras.get(asinatura))>6) {
				horas= (int)(Math.random() * (6));
			}else {
				horas= (int)(Math.random() * (Integer.parseInt(asinaturasHoras.get(asinatura))));
				if(horas==0) {
					horas =1;
				}
			}
			for(int i=0;i<horas;i++) {
				calendario.add(asinaturas.get(asinatura));
			}

			asinaturasHoras.set(asinatura, (""+(Integer.parseInt(asinaturasHoras.get(asinatura))-horas)));
			if(Integer.parseInt(asinaturasHoras.get(asinatura))==0) {
				asinaturasHoras.remove(asinatura);
				asinaturas.remove(asinatura);
			}
		}while(calendario.size()<30);

		System.out.print("Lunes  ");
		System.out.print("Martes  ");
		System.out.print("Miercoles  ");
		System.out.print("jueves  ");
		System.out.println("viernes");
		int e =0;
		for(int i=0;i<5;i++) {
			
				System.out.print(calendario.get((i+0)));
				System.out.print("    ");
				System.out.print(calendario.get((i+5)));
				System.out.print("     ");
				System.out.print(calendario.get((i+10)));
				System.out.print("           ");
				System.out.print(calendario.get((i+15)));
				System.out.print("     ");
				System.out.print(calendario.get((i+20)));
				System.out.println("");
				e=0;
			
		}
		
		}
	/**
	 * Este metodo crea el horario para los profesores
	 * Reparte las horas que le corresponde a la semana 
	 */
	public static void profesor(){
			ArrayList<String> asinaturas = new ArrayList<String>();
			asinaturas.add("DAW         ");
			asinaturas.add("DAM         ");
			asinaturas.add("SMR         ");
			asinaturas.add("Hora libre  ");
			asinaturas.add("Tutoria     ");
			ArrayList<String> calendario = new ArrayList<String>();
			ArrayList<String> asinaturasHoras = new ArrayList<String>();
			asinaturasHoras.add("6");
			asinaturasHoras.add("8");
			asinaturasHoras.add("7");
			asinaturasHoras.add("6");
			asinaturasHoras.add("3");
			
			do {
				
				int  asinatura= (int)(Math.random() * (asinaturas.size()));
				int  horas;
				if(Integer.parseInt(asinaturasHoras.get(asinatura))>6) {
					horas= (int)(Math.random() * (6));
				}else {
					horas= (int)(Math.random() * (Integer.parseInt(asinaturasHoras.get(asinatura))));
					if(horas==0) {
						horas =1;
					}
				}
				for(int i=0;i<horas;i++) {
					calendario.add(asinaturas.get(asinatura));
				}

				asinaturasHoras.set(asinatura, (""+(Integer.parseInt(asinaturasHoras.get(asinatura))-horas)));
				if(Integer.parseInt(asinaturasHoras.get(asinatura))==0) {
					asinaturasHoras.remove(asinatura);
					asinaturas.remove(asinatura);
				}
			}while(calendario.size()<30);

			System.out.print("Lunes       ");
			System.out.print("Martes      ");
			System.out.print("Miercoles   ");
			System.out.print("jueves      ");
			System.out.println("viernes     ");
			int e =0;
			for(int i=0;i<5;i++) {
				
					System.out.print(calendario.get((i+0)));
					System.out.print(calendario.get((i+5)));
					System.out.print(calendario.get((i+10)));
					System.out.print(calendario.get((i+15)));
					System.out.print(calendario.get((i+20)));
					System.out.println("");
					e=0;
				
			}

			System.out.println("");
			System.out.println("");
			}
	
}
