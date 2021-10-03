package com.example.ejerciciosclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operario()
        tablasMultiplicar()
        empleado()
        dado()
    }

    //Ejercicio 1
    fun operario(){
        val nombre = "Luis Diaz"
        val pagoHora = 7.5
        val horasTrabajadas = 40
        val horasExtras = 10
        val totalHoras = horasTrabajadas + horasExtras

        println("Nombre del operario: $nombre")
        println("Sueldo por hora: $pagoHora$")
        println("Horas trabajadas en la semana: $horasTrabajadas")
        println("Horas extra: $horasExtras")
        println("Total de horas: $totalHoras")
        println("Salario normal : ${pagoHora * horasTrabajadas}$")
        println("Salario con horas extra: ${pagoHora * totalHoras}$")
    }

    //Ejercicio 2
    fun tablasMultiplicar(){
        val numeroMultiplicador = 7
        val termino = 10
        for (i in 1..termino) {
            println("$numeroMultiplicador x $i = ${numeroMultiplicador * i}")
        }
    }

    //Ejercicio 3
    fun empleado(){
        val empleado1 = empleadoClass("Luis Diaz", 900.0, arrayOf(empleadoClass.areas.IMFORMATICA), arrayOf(empleadoClass.cargos.PROGRAMADOR), 10)
        fun verificar(): Int{
            return (empleado1.tiempoLaborando.div(5))
        }
        val aumento = 25 * verificar()
        val sueldoTotal = empleado1.sueldo + aumento

        //Nombre
        println("Nombre Empleado: ${empleado1.nombre}")
        //Area
        empleado1.areaEmpleado()
        //Cargo
        empleado1.cargoEmpleado()
        //Tiempo de Trabajo
        println("Tiempo Laborando: ${empleado1.tiempoLaborando}")
        //Aumento
        println("Aumento por años laborando: $aumento$")
        //Sueldo
        if (empleado1.sueldo >= 0){
            println("Sueldo: $sueldoTotal$")
        }else
            println("Sueldo: El sueldo no puede ser negativo...")
    }

    //Ejercicio 4
    fun dado(){
        val probarSuerte = dadoClass()

        //Si la constante probarSuerte tiene se le asigna un valor entre el 1 y 6, este imprimira ese valor.
        //Pero si ese valor es menor o igual a 0 y mayor o igual a 7, este imprimira el valor de 1
        probarSuerte.valor = 7
        //Si la constante probarSuerte es igual a null, se genera un numero aleatorio entre 1 y 6
        //probarSuerte.valor = null
        probarSuerte.dado()
    }
}