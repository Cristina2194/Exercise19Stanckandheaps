package com.exercise19stanckandheaps.app;
import java.util.Stack;

public class StancksandHeads {

	public static void main(String[] args) 
	{
		//Varibles declaration
		
		String cad = "La noche de este lunes un grupo de sujetos sustrajo 200 equipos celulares de la marca Apple después de romper los cristales de una tienda en un centro comercial en Arcos Vallarta; sin embargo, un guardia y elementos de la Policía de Guadalajara evitaron el atraco, además se detuvo a una persona.El hecho ocurrió alrededor de las 22:00 horas en un centro comercial en Vallarta y Francisco de Quevedo. Oficiales de la unidad G-1205 fueron alertados vía radio sobre detonaciones de arma de fuego en dicho lugar,tras lo que se trasladaron al punto.";
		
		Stack<Character> letters = new Stack<Character>();
		char[] lettersArray = cad.toCharArray();
		for(Character c: lettersArray)
		{
			//if(c='a' || c=='A') esta es una opción
			if(Character.toUpperCase(c)=='A')
			{
				letters.push(c);
			}
		}
		while(!letters.isEmpty())
		{
			System.out.println(letters.pop());
		}
	
	}

}
