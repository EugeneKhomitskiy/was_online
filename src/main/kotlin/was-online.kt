fun main() {
    while (true) {
        println("Введите время в секундах:")
        val input = readLine()!!.toInt()
        println(agoToText(input))
    }
}

fun agoToText(timeSec: Int): String {
    return when (timeSec) {
        in 0..60 -> "Был(а) в сети только что"
        in 61..3600 -> "Был(а) в сети ${minutes(timeSec)} назад"
        in 3601..86400 -> "Был(а) в сети ${hours(timeSec)} назад"
        in 86400..172800 -> "Был(а) в сети сегодня"
        in 172800..259200 -> "Был(а) в сети вчера"
        else -> "Был(а) в сети давно"
    }
}

fun minutes(timeSec: Int): String {
    val timeMin = timeSec/60
    return if (timeMin % 10 in 2..4 && timeMin % 100 !in 11..19) "$timeMin минуты"
    else if (timeMin % 10 == 1 && timeMin % 100 != 11) "$timeMin минуту"
    else "$timeMin минут"
}

fun hours(timeSec: Int): String {
    val timeHour = timeSec/3600
    return if (timeHour % 10 in 2..4 && timeHour % 100 !in 11..19) "$timeHour часа"
    else if (timeHour % 10 == 1 && timeHour % 100 != 11) "$timeHour час"
    else "$timeHour часов"
}

