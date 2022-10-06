fun helloPolban() {
    println("Hello Polban")
}

fun helloSiswa(nama: String) {
    println("Hallo apa kabar $nama")
}

fun nilaiAkhir(uts: Int, uas:Int): Int{
    return (uts+uas) / 2
}

fun main () {
    val nama = "Ujang"

    helloPolban()
    helloSiswa(nama)

    val nilai = nilaiAkhir(8,70)

    println("Nilai akhir $nama adalah: $nilai")
}