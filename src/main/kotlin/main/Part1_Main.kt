package main

import cells.Cellule
import cells.Mine
import cells.Nombre


fun main(args: Array<String>) {
    val mineCell: Cellule = Mine(0, 0)
    println(cell.toPrint)

    val nombreCell: Cellule = Nombre(0, 0, "0")
    println(cell.toPrint)

    var ligne: Array<Cellule?>
    var tableau: Array<Array<Cellule?>?>

    //	TODO : print un tableau � 2 dimensions de Cellules al�atoires
    //	on pourra utiliser la fonction random() qui s'utilise de la mani�re suivante :
    //			<< (borne inf�rieure..borne sup�rieure).random() >>
    //  pour g�n�rer al�atoirement les cellules (si le random = 1, c'est une Mine, sinon c'est un Nombre, par exemple)
}
