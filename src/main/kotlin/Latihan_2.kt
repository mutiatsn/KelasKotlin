fun main(){

    var lamaParkir: Int
    var biayaParkir: Float

    lamaParkir = 8

    //rule biaya parkir

    val tarifDasar = 1.0
    val tarifBerikutnya = 0.5
    val maxTarifPerHari = 15

    if (lamaParkir < 6){
        biayaParkir = (lamaParkir * tarifDasar).toFloat()
    }else if ((lamaParkir >= 6) && (lamaParkir < 24)){
        biayaParkir = (5 + ((lamaParkir-5) * tarifBerikutnya)).toFloat()
    }else{
        biayaParkir = maxTarifPerHari.toFloat()
    }

    println("Lama Parkir: $lamaParkir")
    println("Biaya Parkir: $biayaParkir")
}