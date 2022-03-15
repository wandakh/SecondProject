import java.util.*

fun main(){
    val reader =  Scanner(System.`in`)
    print(" masukan bilangan pertama :")
    val bil1 = reader.nextInt()


    print("\n")

    print(" masukan bilangan kedua :")

    val bil2 = reader.nextInt()
    calculator2bil(bil1,bil2)
}

fun calculator2bil(bil1 : Int, bil2 : Int) {
    val penjumlahan = bil1 + bil2
    val perkalian = bil1 * bil2
    val pengurangan = bil2 - bil1
    val pembagian = bil1.toDouble() / bil2.toDouble()

    println("operasi matematika antar $bil1 dan $bil2 sebagai berikut\n " +
            "penjumlahan $penjumlahan \n perkalian $perkalian \n " +
            "pengurangan $pengurangan \n pembagian $pembagian")

}
