package cells

/**
 * class Cellule : Cellule
 * une Cellule poss�de 3 attributs :
 * 	- une coordon�e X
 *	- une coordon�e Y
 *	- une valeur � afficher
 */
abstract class Cellule {
	abstract var posX : kotlin.Int
	abstract var posY : kotlin.Int
	abstract var toPrint : kotlin.String
}

/**
 * class Nombre : Cellule sans Mine
 * valeur à afficher : nombre de voisins
 */
class Nombre (
	//TODO : renseigner les attributs d'un nombre
) : Cellule()

/**
 * class Mine : Cellule avec une Mine
 * valeur a� afficher : *
 */
class Mine (
	//TODO : renseigner les attributs d'une mine
) : Cellule()