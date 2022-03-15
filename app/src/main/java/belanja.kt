fun main(){
    list_belanja("mie, telor, minyak, cornet",  "10 bungkus,1kg, 5 bungkus,3 kaleng",
        "2.000, 24.000, 15.000, 12,500")


}
fun list_belanja (sembako: String, jumlahbarang: String,hargapersatuan:String){
    println("daftar belanjaaan: ${sembako}\njumlahbarang: ${jumlahbarang}\n" +
            "harga persatuan: ${hargapersatuan}")

}