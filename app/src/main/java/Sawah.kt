import java.util.*

fun main (){
    val reader = Scanner(System.`in`)
    print("Masukan luas meter persegi : ")
    val Luas_sawah = reader.nextInt()
    if ( Luas_sawah < 100){
        val harga = Luas_sawah * 100000
        print("Harga yang harus dibayar adalah sejumlah $harga")

    }else if (Luas_sawah >=100 && Luas_sawah < 500 ) {
        val harga = Luas_sawah * 100000
        val diskon = harga * 2/100
        if (diskon >= 5000000){
            val finalharga = harga - 5000000
            print("harga yang harus dibayar adalah sejumlah Rp $finalharga")
        }

    }else if (Luas_sawah >= 500000 && Luas_sawah < 1000){
        val harga = Luas_sawah * 100000
        val diskon = harga * 5/100
        if (diskon >= 5000000){
            val finalharga = harga - 5000000
            print("harga yang harus dibayar adalah sejumlah Rp $finalharga")}

    }else if( Luas_sawah >1000 && Luas_sawah < 4000 ){
        val harga = Luas_sawah * 100000
        val diskon = harga * 12/100
        if (diskon >= 5000000){
            val finalharga = harga - 5000000
            print("harga yang harus dibayar adalah sejumlah Rp $finalharga")
        }

    }else {}
    val harga = Luas_sawah * 100000
    val diskon = harga * 25/100
    if (diskon >= 5000000){
        val finalharga = harga - 5000000
        print("harga yang harus dibayar adalah sejumlah Rp $finalharga")
    }
}