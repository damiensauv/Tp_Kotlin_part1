package main

import cells.Cellule
import cells.Mine
import cells.Nombre
import cells.Vide

class Part1_Main {
	fun main(args: Array<String>) {
		val mineCell : Cellule = Mine(0, 0)
		println(cell.toPrint)
		
		val nombreCell : Cellule = Nombre(0, 0, "0")
		println(cell.toPrint)
		
		//	TODO : print un tableau à 2 dimensions de Cellules aléatoires
		//	on pourra utiliser la fonction random() qui s'utilise de la manière suivante :
		//			<< (borne inférieure..borne supérieure).random() >>
		//  pour générer aléatoirement les cellules (si le random = 1, c'est une Mine, sinon c'est un Nombre, par exemple)
	}
}