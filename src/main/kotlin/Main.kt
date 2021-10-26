fun main(args: Array<String>) {

    println("Digite um número para saber o mês do ano! ")
    print("Digite um número de 1 a 12: ")
    var num = readLine()!!.toInt()

    when(num){
        1 -> println("Você está no mês de Janeiro")
        2 -> println("Você está no mês de Fevereiro")
        3 -> println("Você está no mês de Março")
        4 -> println("Você está no mês de Abril")
        5 -> println("Você está no mês de Maio")
        6 -> println("Você está no mês de Junho")
        7 -> println("Você está no mês de Julho")
        8 -> println("Você está no mês de Agosto")
        9 -> println("Você está no mês de Setembro")
        10 -> println("Você está no mês de Outubro")
        11 -> println("Você está no mês de Novembro")
        12 -> println("Você está no mês de Dezembro")
        else -> println("Número digitado inválido")
    }





}