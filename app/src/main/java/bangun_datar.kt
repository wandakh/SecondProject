fun main(){
   persegi(5.0)
    persegipanjang(5.0, 10.0)
    jajargenjang(8.0,5.0)
    layanglayang(5.0,2.0)
    lingkaran(3.14,10.0)
    segitiga(10.0,6.0)
    trapesium(5.0,5.0,10.0)
    belahketupat(8.0,7.0)

}

fun persegipanjang(panjang : Double,lebar : Double) {
    val result = panjang * lebar
    println ("luas persegi panjang adalah $result")
}
fun persegi(sisi : Double) {
    val result = sisi * sisi
    println("luas persegi adalah $result")
}
fun jajargenjang(alas : Double, tinggi : Double){
    val result =  alas * tinggi
    println("luas jajargenjang adalah $result")
}
fun layanglayang(D1 :Double, D2 : Double ){
    val result = 2 * D1 * D2
    println("luas layanglayang adala $result")
}
fun lingkaran(phi : Double, r : Double){
    val result = phi * r * r
    println ("luas lingkaran adala $result")
}
fun segitiga(alas:Double, tinggi : Double){
    val result =   alas * tinggi /2
    println ("luas segitiga adalah $result")
}
fun trapesium(w : Double,x : Double, tinggi : Double){
    val result =  w + x * tinggi/2
    println ("luas trapesium adalah $result")
}
fun belahketupat(D1 : Double, D2 : Double){
    val result = 2 * D1 * D2
    println ("luas belah ketupat adalah $result")

}