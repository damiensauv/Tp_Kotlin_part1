package cells

/**
 * class Cellule : Cellule
 * une Cellule possède 3 attributs :
 * 	- une coordonée X
 *	- une coordonée Y
 *	- une valeur à afficher
 */
abstract class Cellule {
	abstract var posX : kotlin.Int
	abstract var posY : kotlin.Int
	abstract var toPrint : kotlin.String
}

/**
 * class Vide : Cellule vide
 * valeur Ã  afficher : _ (espace)
 */
class Vide (
	//TODO : renseigner les attributs d'un vide
) : Cellule()

/**
 * class Nombre : Cellule sans Mine
 * valeur Ã  afficher : nombre de voisins
 */
class Nombre (
	//TODO : renseigner les attributs d'un nombre
) : Cellule()

/**
 * class Mine : Cellule avec une Mine
 * valeur a  afficher : *
 */
class Mine (
	//TODO : renseigner les attributs d'une mine
) : Cellule()