/* cetak 5 baris sapaan dengan menyebut nama
*contoh : halo selamat pagi wanda */
//1x pagi, 5 x siang,3x sore, 1x malam, 1x pagi, 2x goodbye/
  fun main () {
    val name = "wanda"
    morning(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    evening(name)
    evening(name)
    evening(name)
    night(name)
    morning(name)
    goodbye(name)
    goodbye(name)
// fungsi pertama
  }
fun morning (name :String){
    println("selamat pagi ${name}")
}
fun afternoon (name : String){
    println("selamat siang ${name}")
}
fun  evening(name : String){
     println("selamat sore ${name}")
}
fun night (name : String){
    println("selamat malam ${name}")
}
fun goodbye(name : String){
    println("sampai jumpa ${name}")
}