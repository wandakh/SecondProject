import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    println(
        "pilihlah skala suhu yang kamu inginkan dengan angka 1, 2, 3\n" +
                "1. fahrenheit\n" +
                "2. kelvin\n" +
                "3. reamur\n" +
                "inputkan pilihanmu :\n")
    val bil1 = reader.nextInt()

    if (bil1 == 1) {
        val skalakonversi = "fahrenheit"
        print(
            "masukan suhu dalam skala celcius yang ingin kamu konversikan !\n" +
                    "masukan suhu (celcius) : \n")
        val bil2 = reader.nextInt()
        val suhuAwal = bil2
        val suhuAkhir = (suhuAwal * 9 / 5) + 32
        print("hasil konversi suhu $suhuAwal celcius menjadi $suhuAkhir $skalakonversi")

    } else if (bil1 == 2) {
        val skalakonversi = "kelvin"
        print(
            "masukan suhu dalam skala celcius yang ingin kamu konversikan !\n" +
                    "masukan suhu (celcius) : \n")
        val bil2 = reader.nextInt()
        val suhuAwal = bil2
        val suhuAkhir = suhuAwal + 273
        print("hasil konversi suhu $suhuAwal celcius menjadi $suhuAkhir $skalakonversi")

    } else if (bil1 == 3) {
        val skalakonversi = "reamur"
        print(
            "masukan suhu dalam skala celcius yang ingin kamu konversikan !\n" +
                    "masukan suhu (celcius) : \n"
        )
        val bil2 = reader.nextInt()
        val suhuAwal = bil2
        val suhuAkhir = suhuAwal * 4 / 5
        print("hasil konversi suhu $suhuAwal celcius menjadi $suhuAkhir $skalakonversi")
    }

}



