package model

/**
 * @author arifhidayat
 *
 */
class Antena constructor(nameAntena: String, x : Int, y : Int) {
    var nameAntena: String = nameAntena
    var x: Int = 0
    var y: Int = 0


    override fun toString(): String {
        return "Antena(nameAntena='$nameAntena', x=$x, y=$y)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Antena

        if (nameAntena != other.nameAntena) return false
        if (x != other.x) return false
        if (y != other.y) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nameAntena.hashCode()
        result = 31 * result + x
        result = 31 * result + y
        return result
    }

}

