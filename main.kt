import kotlin.math.abs
import kotlin.math.sqrt
import kotlin.math.tan

fun length(x1 : Double, y1 : Double, x2 : Double, y2 : Double) : Double {
    val dX = abs(x2 - x1)
    val dY = abs(y2 - y1)
    return sqrt(dX * dX + dY * dY)
}

fun main(args : Array<String>) {
    if (args.size != 4) {
        throw Exception("Args size must be 4")
    }

    val x1 = args[0].toDouble()
    val y1 = args[1].toDouble()
    val x2 = args[2].toDouble()
    val y2 = args[3].toDouble()

    val len = length(x1, y1, x2, y2)
    val ctg = 1 / tan(kotlin.math.PI / 5)

    // S = n / 4 * a^2 * ctg(PI / n), n = 5 for pentagon
    val res =  5 / 4 * len * len * ctg
    println("Final result = $res")
}