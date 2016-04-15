package ar.edu.uno.poo2.modulo;
import java.io.*;

public class Palindromo {
	private String palabra = null;
	private String[] palindromos = null;

	public Palindromo(String palabra){
		this.setPalabra(palabra);
	}

	public void cortePalabra(String string){
	}

	public boolean esPalindromo(){
		String palabra = this.getPalabra();
		boolean es = false;
		Integer largo = palabra.length();
		char[] palabraArray = palabra.toCharArray();
		for(int i = 0; i<largo-1 ;i++){
			if(palabraArray[i]==palabraArray[largo-1]){
				es = true;
				if(largo>=0){
					largo--;}
			}
			else{
				es = false;
				largo = i;}

		}


		return es;
	}
	//Getters y Setters
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public String[] getPalindromos() {
		return palindromos;
	}
	public void setPalindromos(String[] palindromos) {
		this.palindromos = palindromos;
	}


}

