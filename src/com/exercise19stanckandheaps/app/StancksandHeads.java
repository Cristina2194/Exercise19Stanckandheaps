package com.exercise19stanckandheaps.app;
import java.util.Stack;

public class StancksandHeads {

	public static void main(String[] args) 
	{
		//Varibles declaration
		
		String cad = "La noche de este lunes un grupo de sujetos sustrajo 200 equipos celulares de la marca Apple despu�s de romper los cristales de una tienda en un centro comercial en Arcos Vallarta; sin embargo, un guardia y elementos de la Polic�a de Guadalajara evitaron el atraco, adem�s se detuvo a una persona.El hecho ocurri� alrededor de las 22:00 horas en un centro comercial en Vallarta y Francisco de Quevedo. Oficiales de la unidad G-1205 fueron alertados v�a radio sobre detonaciones de arma de fuego en dicho lugar,tras lo que se trasladaron al punto.";
		
		Stack<Character> letters = new Stack<Character>();
		char[] lettersArray = cad.toCharArray();
		for(Character c: lettersArray)
		{
			//if(c='a' || c=='A') esta es una opci�n
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
