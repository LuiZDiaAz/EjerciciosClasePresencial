package com.example.ejerciciosclass

import java.util.Random

class dadoClass {

    var valor: Int? = null
    get() = field
    set(value) {
        if (value != null) {
            if (value <= 0 || value >= 7){
                field = 1
            }else field = value

        }
    }

    fun dado(){
        if (valor == null){
            var nAleatorio = (1..6).random()
            println("El valor del dado es: $nAleatorio")
        }else println("El valor del dado es: $valor")
    }
}