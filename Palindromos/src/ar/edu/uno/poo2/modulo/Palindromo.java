package ar.edu.uno.poo2.modulo;
import java.io.*;
import java.util.ArrayList;

public class Palindromo {
	private String palabra = null;
	private ArrayList<String> palindromos = new ArrayList<>(10);

	public Palindromo(String palabra){
		this.setPalabra(palabra);
	}


	public boolean esPalindromo(){
		String palabra = this.getPalabra();
		boolean es = false;
		Integer largo = palabra.length();
		for(int i = 0; i<largo ;i++){
			if(palabra.charAt(i)==palabra.charAt(largo-1)){
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

	public boolean esPalindromo(String palabra){
		boolean es = false;
		Integer largo = palabra.length();
		for(int i = 0; i<largo ;i++){
			if(palabra.charAt(i)==palabra.charAt(largo-1)){
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

	//metodo de corte y guardado de palabras

	public void cortePalindromos(String palabra){

		for(int i=0; i>palabra.length()-2;i++){
			int j = i+2;
			if(esPalindromo(palabra.substring(j))){
				palindromos.add(palabra.substring(j));
			}
		}

		for(int i=0; i>palabra.length()-2;i++){
			if(esPalindromo(palabra.substring(i))){
				palindromos.add(palabra.substring(i));
			}
		}

	}

	public void cortePalindromos(){

		String palabra = this.getPalabra();
		System.out.println("Palabra Original: "+palabra);

		for(int i=0; i<palabra.length()-2;i++){
			System.out.println("Para I: "+palabra.substring(i));
			if(esPalindromo(palabra.substring(i))&&(palabra.substring(i).length()>=2)){
				System.out.println("Metida en palindromos");
				this.palindromos.add(palabra.substring(i));
			}
		}

		for(int i=0; i<palabra.length()-2;i++){
			int j = i+2;
			System.out.println("Para J: "+palabra.substring(j));

			if(esPalindromo(palabra.substring(j))&&(palabra.substring(j).length()>=2)){
				System.out.println("Metida en palindromos");
				this.palindromos.add(palabra.substring(j));
			}
		}
		for(int i=1; i<palindromos.size();i++){
			if(existeEnPalindromos(this.palindromos.get(i))){
				this.palindromos.remove(i);
			}
		}



	}
	
	//metodo que chequea si la palabra cortada ya existe en el array de palindromos.
	private boolean existeEnPalindromos(String palabra){
		boolean flag = false;
		System.out.println(this.palindromos.size());
		for(int i=0; i<this.palindromos.size();i++){
			System.out.println("Chequeo: "+palindromos.get(i));
			if(this.palindromos.get(i)!=palabra){
				flag = true;
			}
		}
		return flag;
	}


	//Getters y Setters
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public ArrayList<String> getPalindromos() {
		return palindromos;
	}

	public void setPalindromos(ArrayList<String> palindromos) {
		this.palindromos = palindromos;
	}



}

